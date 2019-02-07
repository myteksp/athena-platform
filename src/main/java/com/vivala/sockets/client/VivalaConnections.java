package com.vivala.sockets.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.athena.backend.platform.dto.general.BooleanDTO;
import com.athena.backend.platform.utils.ParamsParser;
import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;
import com.gf.collections.tuples.Tuple2;
import com.gf.collections.tuples.Tuples;
import com.gf.util.string.MC;
import com.vivala.sockets.client.impl.VivalaSocket;

public final class VivalaConnections {
	
	public static final VivalaConnection connection(final String channel, final String userName, final String password) {
		return new VivalaSocket(channel, userName, password);
	}
	
	public static final VivalaConnection connection(final List<String> channels, final String userName, final String password) {
		return new VivalaSocket(channels, userName, password);
	}
	
	public static final VivalaConnection connection(final String channel, final String userName, final String password, final ConnectionLogger logger) {
		return new VivalaSocket(channel, userName, password, logger);
	}
	
	public static final VivalaConnection connection(final List<String> channels, final String userName, final String password, final ConnectionLogger logger) {
		return new VivalaSocket(channels, userName, password, logger);
	}
	
	public static final VivalaSender sender(final String channel) {
		return sender(GfCollections.asLinkedCollection(channel));
	}
	
	private static final Map<String, GfCollection<String>> buildParams(final List<String> channels){
		final Map<String, GfCollection<String>> params = new HashMap<String, GfCollection<String>>(3);
		params.put("channel", GfCollections.wrapAsCollection(channels));
		return params;
	}
	
	private static final RestTemplate getRestTemplete() {
		final RestTemplateBuilder builder = new RestTemplateBuilder();
	    return builder.build();
	}
	
	public static final VivalaSender sender(final List<String> channels) {
		return new VivalaSender() {
			private final String url = MC.fmt("https://vivala-sockets.herokuapp.com/api/sendToChannelB64?${0}", ParamsParser.toBase64Query(buildParams(channels)));
			private final RestTemplate rest = getRestTemplete();
			private final ConcurrentLinkedQueue<String> failed = new ConcurrentLinkedQueue<String>();
			
			@Override
			public final void close() {
				
			}
			
			private final void fail(final String message) {
				failed.add(message);
			}
			
			private final boolean sendFailed() {
				if (failed.isEmpty())
					return true;
				while(!failed.isEmpty()) {
					if (internalSend(failed.peek())) {
						failed.poll();
					}else {
						return false;
					}
				}
				return true;
			}
			
			private final boolean internalSend(final String message) {
				try {
					final BooleanDTO res = rest.postForObject(url, message, BooleanDTO.class);
					return res.result;
				}catch(final Throwable t) {
					return false;
				}
			}
			
			@Override
			public final void send(final String message) {
				if (message == null)
					throw new NullPointerException("Message can not be null.");
				if (sendFailed()) {
					if (!internalSend(message)) {
						fail(message);
					}
				}else {
					fail(message);
				}
			}

			@Override
			public final void sendNotSafe(final String message) {
				if (message == null)
					throw new NullPointerException("Message can not be null.");
				internalSend(message);
			}
		};
	}
	
	public static final VivalaMultichannelSender sender() {
		return new VivalaMultichannelSender() {
			private final RestTemplate rest = getRestTemplete();
			private final ConcurrentLinkedQueue<Tuple2<String, String>> failed = new ConcurrentLinkedQueue<Tuple2<String, String>>();
			
			@Override
			public final void close() {
				
			}
			
			private final Tuple2<String, String> createPair(final List<String> channels, final String message){
				return Tuples.get(ParamsParser.toBase64Query(buildParams(channels)), message);
			}
			
			private final void fail(final Tuple2<String, String> message) {
				failed.add(message);
			}
			
			private final boolean sendFailed() {
				if (failed.isEmpty())
					return true;
				while(!failed.isEmpty()) {
					if (internalSend(failed.peek())) {
						failed.poll();
					}else {
						return false;
					}
				}
				return true;
			}
			
			private final boolean internalSend(final Tuple2<String, String> message) {
				try {
					final BooleanDTO res = rest.postForObject(MC.fmt("https://vivala-sockets.herokuapp.com/api/sendToChannelB64?${0}", message.v1), message.v2, BooleanDTO.class);
					return res.result;
				}catch(final Throwable t) {
					return false;
				}
			}
			
			@Override
			public final void send(final List<String> channels, final String message) {
				if (message == null)
					throw new NullPointerException("Message can not be null.");
				if (channels == null)
					throw new NullPointerException("channels can not be null.");
				if (channels.isEmpty())
					throw new NullPointerException("channels can not be empty.");
				
				final Tuple2<String, String> t = createPair(channels, message);
				if (sendFailed()) {
					if (!internalSend(t)) {
						fail(t);
					}
				}else {
					fail(t);
				}
			}

			@Override
			public final void sendNotSafe(final List<String> channels, String message) {
				if (message == null)
					throw new NullPointerException("Message can not be null.");
				if (channels == null)
					throw new NullPointerException("channels can not be null.");
				if (channels.isEmpty())
					throw new NullPointerException("channels can not be empty.");
				
				final Tuple2<String, String> t = createPair(channels, message);
				internalSend(t);
			}
		};
	}
	
	private static final VivalaConnection wrappConnectionPool(final GfCollection<VivalaConnection> connectionsPool) {
		return new VivalaConnection() {
			private final GfCollection<VivalaConnection> pool = connectionsPool;
			
			@Override
			public final void sendNotSafe(final String message) {
				pool.takeRandom().sendNotSafe(message);
			}
			
			@Override
			public final void send(final String message) {
				pool.takeRandom().send(message);
			}
			
			@Override
			public final void close() {
				pool.forEach(c->c.close());
			}
			
			@Override
			public final void deleteHandler(final MessageHandler handler) {
				pool.forEach(c->c.deleteHandler(handler));
			}
			
			@Override
			public final void addHandler(final MessageHandler handler) {
				pool.takeRandom().addHandler(handler);
			}
		};
	}
	
	public static final VivalaConnection connection(final int poolSize, final String channel, final String userName, final String password) {
		if (poolSize < 2)
			return connection(channel, userName, password);
		
		final GfCollection<VivalaConnection> pool = GfCollections.asLinkedCollection();
		for (int i = 0; i < poolSize; i++) 
			pool.add(connection(channel, userName, password));
		
		return wrappConnectionPool(pool.map(c->c));
	}
	
	public static final VivalaConnection connection(final int poolSize, final List<String> channels, final String userName, final String password) {
		if (poolSize < 2)
			return connection(channels, userName, password);
		
		final GfCollection<VivalaConnection> pool = GfCollections.asLinkedCollection();
		for (int i = 0; i < poolSize; i++) 
			pool.add(connection(channels, userName, password));
		
		return wrappConnectionPool(pool.map(c->c));
	}
	
	public static final VivalaConnection connection(final int poolSize, final String channel, final String userName, final String password, final ConnectionLogger logger) {
		if (poolSize < 2)
			return connection(channel, userName, password, logger);
		
		final GfCollection<VivalaConnection> pool = GfCollections.asLinkedCollection();
		for (int i = 0; i < poolSize; i++) 
			pool.add(connection(channel, userName, password, logger));
		
		return wrappConnectionPool(pool.map(c->c));
	}
	
	public static final VivalaConnection connection(final int poolSize, final List<String> channels, final String userName, final String password, final ConnectionLogger logger) {
		if (poolSize < 2)
			return connection(channels, userName, password, logger);
		
		final GfCollection<VivalaConnection> pool = GfCollections.asLinkedCollection();
		for (int i = 0; i < poolSize; i++) 
			pool.add(connection(channels, userName, password, logger));
		
		return wrappConnectionPool(pool.map(c->c));
	}
}
