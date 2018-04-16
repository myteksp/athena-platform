package io.github.sac;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.athena.backend.platform.dto.events.SocketClusterMessage;
import com.gf.collections.GfCollections;
import com.gf.util.string.JSON;
import com.neovisionaries.ws.client.WebSocketException;
import com.neovisionaries.ws.client.WebSocketFrame;



public final class SocketClusterPushService implements Closeable{
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	private final Socket connection;
	private final String key;
	private final ConcurrentHashMap<String, Bundle> not_sent;
	
	private final ScheduledExecutorService scheduler;
	private final long unsent_interval;
	
	public SocketClusterPushService(
			final String socketClusterUrl,
			final String channel) {
		this(socketClusterUrl, channel, 10000);
	}
	
	public SocketClusterPushService(
			final String socketClusterUrl,
			final String channel,
			final long unsent_interval) {
		this.unsent_interval = unsent_interval;
		this.key = channel;
		this.connection = new Socket(socketClusterUrl);
		this.not_sent = new ConcurrentHashMap<String, Bundle>(32);
		this.scheduler = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
			@Override
			public final Thread newThread(final Runnable r) {
				final Thread t = new Thread(r);
				t.setPriority(Thread.MIN_PRIORITY);
				return t;
			}
		});
		this.init();
	}
	
	private final void init() {
		connection.setListener(new BasicListener() {
			public final void onConnected(final Socket socket, final Map<String, List<String>> headers) {
				log.info("Connected to endpoint");
			}
			public final void onDisconnected(final Socket socket, 
					final WebSocketFrame serverCloseFrame, 
					final WebSocketFrame clientCloseFrame, 
					final boolean closedByServer) {
				log.info("Disconnected from end-point");
				new Thread(new Runnable() {
					@Override
					public final void run() {
						while(!connection.isconnected()) {
							try {Thread.sleep(1000);} catch (InterruptedException e) {}
							log.warn("Reconnection...");
							connection.setReconnection(new ReconnectStrategy().setDelay(2000).setMaxAttempts(null));
							connection.connect();
						}
						GfCollections.asArrayCollection(not_sent.entrySet())
						.action((c)->{not_sent.clear();})
						.map((e)->e.getValue())
						.sortCollection((o1, o2)->Long.compare(o1.time, o2.time))
						.iterate((e,i)->connection.publish(key, e.payload));
					}
				}).start();

			}

			public final void onConnectError(final Socket socket, final WebSocketException exception) {
				log.info("Got connect error "+ exception);
			}

			public final void onSetAuthToken(final String token, final Socket socket) {
				log.info("Set auth token got called");
				socket.setAuthToken(token);
			}

			public final void onAuthentication(final Socket socket, final Boolean status) {
				if (status) {
					log.info("socket is authenticated");
				} else {
					log.info("Authentication is required (optional)");
				}
			}
		});
		connection.setReconnection(new ReconnectStrategy().setDelay(2000).setMaxAttempts(null));
		connection.connect();
		if (!log.isDebugEnabled()) {
			connection.disableLogging();
		}
		scheduler.scheduleAtFixedRate(new Runnable() {
			@Override
			public final void run() {
				checkUnsent();
			}
		}, unsent_interval * 2, unsent_interval, TimeUnit.MILLISECONDS);
	}
	
	@Override
	public final void close() throws IOException {
		scheduler.shutdownNow();
		not_sent.clear();
		connection.disconnect();
	}
	
	private final void checkUnsent() {
		if (!connection.isconnected())
			return;
		
		GfCollections.asArrayCollection(not_sent.entrySet())
		.iterate((e, i) -> {
			final String id = e.getKey();
			final Bundle b = e.getValue();
			if (System.currentTimeMillis() - b.time > unsent_interval) {
				not_sent.remove(id);
				final String payload = b.payload;
				not_sent.put(id, new Bundle(System.currentTimeMillis(), payload));
				connection.publish(key, payload, new Ack() {
					@Override
					public final void call(final String name, final Object error, final Object data) {
						not_sent.remove(id);
					}
				});
			}
		});
	}
	
	
	public final void broadcastMessage(final String topic, final Object toSend) {
		if (toSend == null)
			throw new NullPointerException("toSend can't be null");
		if (topic == null)
			throw new NullPointerException("topic can't be null");
		
		final String id = UUID.randomUUID().toString();
		final String payload = JSON.toJson(new SocketClusterMessage(topic, toSend));
		not_sent.put(id, new Bundle(System.currentTimeMillis(), payload));
		connection.publish(key, payload, new Ack() {
			@Override
			public final void call(final String name, final Object error, final Object data) {
				not_sent.remove(id);
			}
		});
	}
	
	public final void broadcastMessage(final String topic, final Object toSend, final boolean guaranteed) {
		if (guaranteed) {
			broadcastMessage(topic, toSend);
		} else {
			if (toSend == null)
				throw new NullPointerException("toSend can't be null");
			if (topic == null)
				throw new NullPointerException("topic can't be null");
			
			final String payload = JSON.toJson(new SocketClusterMessage(topic, toSend));
			connection.publish(key, payload);
		}
	}
	
	
	private static final class Bundle{
		public final long time;
		public final String payload;
		public Bundle(final long time, final String payload) {
			this.time = time;
			this.payload = payload;
		}
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((payload == null) ? 0 : payload.hashCode());
			result = prime * result + (int) (time ^ (time >>> 32));
			return result;
		}
		@Override
		public final boolean equals(final Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final Bundle other = (Bundle) obj;
			if (payload == null) {
				if (other.payload != null)
					return false;
			} else if (!payload.equals(other.payload))
				return false;
			if (time != other.time)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Bundle [time=" + time + ", payload=" + payload + "]";
		}
	}
}
