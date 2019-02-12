package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SmartPush {
	@JsonProperty(required=true)
	public String id;
	
	@JsonProperty(required=true)
	public Type type;
	
	@JsonProperty(required=true)
	public String userId;
	
	public static enum Type{
		MAKE_PRE_GAME, CREATE_GROUP, INVITE_FRIEND, SET_HOT_PLAYER
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		final SmartPush other = (SmartPush) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (type != other.type)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SmartPush [id=" + id + ", type=" + type + ", userId=" + userId + "]";
	}
}
