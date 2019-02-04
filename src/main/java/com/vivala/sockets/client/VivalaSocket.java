package com.vivala.sockets.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.athena.backend.platform.utils.ParamsParser;
import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;


public final class VivalaSocket {
	
	private final String ping;
	private final String url;
	
	public VivalaSocket(final List<String> channels, final String user, final String password) {
		this.ping = UUID.randomUUID().toString().replace('-', 'a');
		final Map<String, GfCollection<String>> params = new HashMap<String, GfCollection<String>>(Math.max(5, channels.size() + 5)); 
		params.put("channel", GfCollections.wrapAsCollection(channels));
		params.put("user", GfCollections.asArrayCollection(user));
		params.put("password", GfCollections.asArrayCollection(password));
		params.put("ping", GfCollections.asArrayCollection(ping));
		this.url = ParamsParser.toBase64Query(params);
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
