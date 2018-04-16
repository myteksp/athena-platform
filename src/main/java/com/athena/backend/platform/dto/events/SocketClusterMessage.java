package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SocketClusterMessage {
	@JsonProperty(required=true)
	public String topic;
	@JsonProperty(required=true)
	public Object data;
	
	public SocketClusterMessage() {}
	
	public SocketClusterMessage(final String topic, final Object data) {
		this.topic = topic;
		this.data = data;
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		final SocketClusterMessage other = (SocketClusterMessage) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SocketClusterMessage [topic=" + topic + ", data=" + data + "]";
	}
}
