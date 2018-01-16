package com.athena.backend.platform.dto.nba;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public final class NativePushEvent {
	public Type type;
	public String data;

	public NativePushEvent(final Type type, final String data) {
		this.type = type;
		this.data = data;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final NativePushEvent other = (NativePushEvent) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "NativePushEvent [type=" + type + ", data=" + data + "]";
	}



	private static final Encoder encoder = Base64.getUrlEncoder();
	private static final Decoder decoder = Base64.getUrlDecoder();

	public static final NativePushEvent encode(final NativePushEvent event) {
		try {
			return new NativePushEvent(event.type, encoder.encodeToString(event.data.getBytes("UTF-8")));
		} catch (final UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static final NativePushEvent decode(final NativePushEvent event) {
		try {
			return new NativePushEvent(event.type, new String(decoder.decode(event.data), "UTF-8"));
		} catch (final UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static enum Type{
		stats, clock, event, heartbeat
	}
}
