package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RabbitEvent {
	@JsonProperty(required=false)
	public long count;
	
	@JsonProperty(required=false)
	public GeneralEvent m;
	
	@JsonProperty(required=false)
	public TickEvent t;
	
	@JsonProperty(required=true)
	public Type tp;
	
	public RabbitEvent() {}
	
	public static final RabbitEvent meta(final GeneralEvent event) {
		final RabbitEvent res = new RabbitEvent();
		res.tp = Type.m;
		res.m = event;
		return res;
	}
	
	public static final RabbitEvent tick(final TickEvent event) {
		final RabbitEvent res = new RabbitEvent();
		res.tp = Type.t;
		res.t = event;
		return res;
	}
	
	public static enum Type{
		m,t
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m == null) ? 0 : m.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		result = prime * result + ((tp == null) ? 0 : tp.hashCode());
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
		final RabbitEvent other = (RabbitEvent) obj;
		if (m == null) {
			if (other.m != null)
				return false;
		} else if (!m.equals(other.m))
			return false;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		if (tp != other.tp)
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "RabbitEvent [m=" + m + ", t=" + t + ", tp=" + tp + "]";
	}
}
