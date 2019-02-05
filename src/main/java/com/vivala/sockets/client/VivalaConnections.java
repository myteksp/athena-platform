package com.vivala.sockets.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultClientConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
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
	
	private static final Tuple2<RestTemplate, CloseableHttpClient> getRestTemplete() {
		final RestTemplateBuilder builder = new RestTemplateBuilder();
		final PoolingHttpClientConnectionManager poolingConnectionManager = new PoolingHttpClientConnectionManager();
	    poolingConnectionManager.setMaxTotal(1024 * 3);
	    poolingConnectionManager.setDefaultMaxPerRoute(512);
	    final CloseableHttpClient client = HttpClientBuilder.create()
	    		.setConnectionReuseStrategy(DefaultClientConnectionReuseStrategy.INSTANCE)
	    		.setConnectionManager(poolingConnectionManager).build();
	    final HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(client);
	    clientHttpRequestFactory.setConnectTimeout(30000);
	    clientHttpRequestFactory.setReadTimeout(10000);
	    builder.requestFactory(()->clientHttpRequestFactory);
	    return Tuples.get(builder.build(), client);
	}
	
	public static final VivalaSender sender(final List<String> channels) {
		final Tuple2<RestTemplate, CloseableHttpClient> pair = getRestTemplete();
		return new VivalaSender() {
			private final String url = MC.fmt("https://vivala-sockets.herokuapp.com/api/sendToChannelB64?${0}", ParamsParser.toBase64Query(buildParams(channels)));
			private final RestTemplate rest = pair.v1;
			private final CloseableHttpClient client = pair.v2;
			private final ConcurrentLinkedQueue<String> failed = new ConcurrentLinkedQueue<String>();
			
			@Override
			public final void close() {
				try {client.close();} catch (IOException e) {}
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
			public final void sendNotSafe(String message) {
				internalSend(message);
			}
		};
	}
	
}
