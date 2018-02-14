package com.athena.backend.platform.dto.events;

public final class ServerNodeEvent {
	public String p;
	public Type type;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
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
		final ServerNodeEvent other = (ServerNodeEvent) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ServerNodeEvent [p=" + p + ", type=" + type + "]";
	}

	public static enum Type{
		ACK, REGISTER, UNREGISTER, REGISTER_REQUEST
	}
}
