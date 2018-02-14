package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ServerNodeEvent {
	@JsonProperty(required=true)
	public Type type;
	
	@JsonProperty(required=false)
	public String nodeId;
	
	@JsonProperty(required=false)
	public String eventId;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
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
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ServerNodeEvent [type=" + type + ", nodeId=" + nodeId + ", eventId=" + eventId + "]";
	}


	public static enum Type{
		ACK, REGISTER, UNREGISTER, REGISTER_REQUEST
	}
}
