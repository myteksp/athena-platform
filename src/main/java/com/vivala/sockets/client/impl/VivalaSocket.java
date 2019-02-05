package com.vivala.sockets.client.impl;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import com.athena.backend.platform.utils.ParamsParser;
import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;
import com.gf.util.string.MC;
import com.vivala.sockets.client.ConnectionLogger;
import com.vivala.sockets.client.MessageHandler;
import com.vivala.sockets.client.VivalaConnection;



@ClientEndpoint
public final class VivalaSocket implements VivalaConnection{
	private static final long PING_DELAY = 10000;

	private final String ping;
	private final String url;
	private final AtomicBoolean isClosed;
	private final AtomicBoolean isReconnecting;
	private volatile Session currentSession;
	private final AtomicLong lastActive;
	private final ConcurrentLinkedQueue<MessageHandler> handlers;
	private final ConcurrentLinkedQueue<String> messages;
	private final ScheduledExecutorService executor;
	private final WebSocketContainer container;
	private final ConnectionLogger log;

	public VivalaSocket(final List<String> channels, final String user, final String password, final ConnectionLogger logger) {
		this.log = new ConnectionLogger() {
			@Override
			public final void log(final String message) {
				try {
					logger.log(message);
				}catch(final Throwable t) {
					t.printStackTrace();
				}
			}
		};
		final WebSocketContainer s = this.container = ContainerProvider.getWebSocketContainer();
		s.setDefaultMaxSessionIdleTimeout(PING_DELAY * 2);
		log.log("Container created.");
		this.isReconnecting = new AtomicBoolean(false);
		this.handlers = new ConcurrentLinkedQueue<MessageHandler>();
		this.messages = new ConcurrentLinkedQueue<String>();
		currentSession = null;
		this.isClosed = new AtomicBoolean(false);
		this.ping = UUID.randomUUID().toString().replace('-', 'a');
		final Map<String, GfCollection<String>> params = new HashMap<String, GfCollection<String>>(Math.max(5, channels.size() + 5)); 
		params.put("channel", GfCollections.wrapAsCollection(channels));
		params.put("user", GfCollections.asArrayCollection(user));
		params.put("password", GfCollections.asArrayCollection(password));
		params.put("ping", GfCollections.asArrayCollection(ping));
		this.url = MC.fmt("wss://vivala-sockets.herokuapp.com/channels?${0}", ParamsParser.toBase64Query(params));
		log.log(MC.fmt("SocketURL(${0}).", this.url));
		this.executor = Executors.newScheduledThreadPool(2, new ThreadFactory() {
			private final AtomicInteger cnt = new AtomicInteger(0);
			@Override
			public final Thread newThread(final Runnable r) {
				final String name = "SOCKET " + cnt.incrementAndGet() + ": " + url;
				final Thread t = new Thread(r);
				t.setPriority(Thread.MAX_PRIORITY);
				t.setName(name);
				log.log("Thread created: " + name);
				return t;
			}
		});
		lastActive = new AtomicLong(System.currentTimeMillis());
		executor.scheduleAtFixedRate(()->{
			if (System.currentTimeMillis() - lastActive.get() >= PING_DELAY) {
				log.log("idle session. reconnecting.");
				reconnect();
			}
		}, PING_DELAY, PING_DELAY, TimeUnit.MILLISECONDS);
		reconnect();
	}

	public VivalaSocket(final String channels, final String user, final String password) {
		this(channels, user, password, new ConnectionLogger() {
			@Override
			public final void log(final String message) {}
		});
	}

	public VivalaSocket(final List<String> channels, final String user, final String password) {
		this(channels, user, password, new ConnectionLogger() {
			@Override
			public final void log(final String message) {}
		});
	}

	public VivalaSocket(final String channels, final String user, final String password, final ConnectionLogger logger) {
		this(GfCollections.asLinkedCollection(channels), user, password, new ConnectionLogger() {
			@Override
			public final void log(final String message) {
				try {
					logger.log(message);
				}catch(final Throwable t) {
					t.printStackTrace();
				}
			}
		});
	}

	public final void addHandler(final MessageHandler handler) {
		handlers.add(handler);
	}

	public final void deleteHandler(final MessageHandler handler) {
		handlers.remove(handler);
	}

	public final void close() {
		close(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, ""));
	}

	private final void close(final CloseReason reason) {
		isClosed.set(true);
		closeCurrentSession(reason);
		executor.shutdownNow();
	}

	private final void closeCurrentSession(final CloseReason reason) {
		final Session s = currentSession;
		currentSession = null;
		if (s != null) {
			try {
				s.close(reason);
			} catch (final IOException e) {}
		}
	}

	public final void send(final String message) {
		messages.add(message);
		sendQueue();
	}

	@Override
	public final void sendNotSafe(final String message) {
		final Session s = currentSession;
		if (s != null) {
			try {
				s.getBasicRemote().sendText(message);
				lastActive.set(System.currentTimeMillis());
			} catch (final Throwable e) {}
		}
	}

	private final void sendQueue() {
		if (messages.isEmpty())
			return;

		executor.execute(()->{
			final GfCollection<String> coll = GfCollections.asLinkedCollection();
			while(!messages.isEmpty()) {
				coll.add(messages.poll());
			}

			final AtomicBoolean doReconnect = new AtomicBoolean(false);
			coll.forEach(m->{
				final Session s = currentSession;
				if (s != null) {
					try {
						s.getBasicRemote().sendText(m);
						lastActive.set(System.currentTimeMillis());
					} catch (final Throwable e) {
						messages.add(m);
						doReconnect.set(true);
					}
				}else {
					messages.add(m);
				}
			});
			if (doReconnect.get()) {
				reconnect();
			}
		});
	}

	private final void reconnect() {
		if (isReconnecting.getAndSet(true))
			return;

		if (isClosed.get())
			return;
		closeCurrentSession(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, ""));
		executor.execute(()->{
			boolean success = false;
			while(!success) {
				if (isClosed.get())
					return;
				try {
					container.connectToServer(this, new URI(url));
					success = true;
					lastActive.set(System.currentTimeMillis());
					log.log("Binding to endpoint success.");
				} catch (final Throwable e) {
					log.log("Failed to bind. " + e.getMessage());
					try {Thread.sleep(1000);} catch (final InterruptedException e1) {}
				}
			}
		});
	}

	@OnMessage
	public final void onMessage(final String message) {
		if (message.equals(ping)) {
			lastActive.set(System.currentTimeMillis());
		}else {
			lastActive.set(System.currentTimeMillis());
			executor.execute(()->{
				handlers.forEach(h->h.onMessage(message));
			});
		}
	}

	@OnOpen
	public final void onOpen(final Session userSession) {
		isReconnecting.set(false);
		log.log("Connection established.");
		currentSession = userSession;
		if (isClosed.get()) {
			closeCurrentSession(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, ""));
		}else {
			sendQueue();
		}
	}

	@OnClose
	public final void onClose(final Session userSession, final CloseReason reason) {
		currentSession = userSession;
		if (!isClosed.get()) {
			log.log("Connection closed. Reconnecting...");
			reconnect();
		} else {
			log.log("Connection closed.");
		}
	}

	@OnError
	public final void onError(final Session session, final Throwable throwable) {
		log.log("Connection error. " + throwable.getMessage());
		currentSession = session;
		if (!isClosed.get()) {
			reconnect();
		}
	}




	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		final VivalaSocket other = (VivalaSocket) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
}
