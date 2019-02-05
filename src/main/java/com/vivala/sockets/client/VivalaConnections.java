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
	public static final VivalaSender sender(final List<String> channels) {
		return new VivalaSender() {
			private final String url = MC.fmt("https://vivala-sockets.herokuapp.com/api/sendToChannelB64?${0}", ParamsParser.toBase64Query(buildParams(channels)));
			private final RestTemplate rest = new RestTemplateBuilder()
					.build();
			
			private final ConcurrentLinkedQueue<String> failed = new ConcurrentLinkedQueue<String>();
			
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
		};
	}
}
