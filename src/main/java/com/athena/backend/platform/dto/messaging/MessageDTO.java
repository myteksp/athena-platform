package com.athena.backend.platform.dto.messaging;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.gf.util.string.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessageDTO {
	public MessageDTO() {}
	public MessageDTO(final Object data) {
		this(UUID.randomUUID().toString(), data);
	}
	public MessageDTO(final String id, final Object data) {
		this.id = id;
		this.data = data;
	}
	
	@JsonProperty(required=true)
	public String id;
	
	@JsonProperty(required=true)
	public Object data;
	
	public final MessageDTO copy() {
		return JSON.fromJson(JSON.toJson(this), MessageDTO.class);
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final MessageDTO other = (MessageDTO) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MessageDTO [id=" + id + ", data=" + data + "]";
	}
}
