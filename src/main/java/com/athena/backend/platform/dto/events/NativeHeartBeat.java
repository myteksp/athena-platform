package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class NativeHeartBeat {
	public Heartbeat heartbeat;
	public String type;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((heartbeat == null) ? 0 : heartbeat.hashCode());
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
		final NativeHeartBeat other = (NativeHeartBeat) obj;
		if (heartbeat == null) {
			if (other.heartbeat != null)
				return false;
		} else if (!heartbeat.equals(other.heartbeat))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "NativeHeartBeat [heartbeat=" + heartbeat + ", type=" + type + "]";
	}




	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Heartbeat{
		public long interval;

		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (interval ^ (interval >>> 32));
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
			final Heartbeat other = (Heartbeat) obj;
			if (interval != other.interval)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Heartbeat [interval=" + interval + "]";
		}
	}
}
