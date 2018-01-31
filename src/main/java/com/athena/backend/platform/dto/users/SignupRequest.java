package com.athena.backend.platform.dto.users;

import com.athena.backend.platform.dto.device.DeviceDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.util.string.JSON;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SignupRequest {
	@JsonProperty(required=true)
	public String userId;
	
	@JsonProperty(required=true)
	public LoginType type;
	
	@JsonProperty(required=false)
	public String password = "";
	
	@JsonProperty(required=false)
	public String avatarUrl = "";
	
	@JsonProperty(required=false)
	public String name = "";
	
	@JsonProperty(required=false)
	public Double latitude = null;
	
	@JsonProperty(required=false)
	public Double longtitude = null;
	
	@JsonProperty(required=false)
	public DeviceDTO device = null;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avatarUrl == null) ? 0 : avatarUrl.hashCode());
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longtitude == null) ? 0 : longtitude.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		final SignupRequest other = (SignupRequest) obj;
		if (avatarUrl == null) {
			if (other.avatarUrl != null)
				return false;
		} else if (!avatarUrl.equals(other.avatarUrl))
			return false;
		if (device == null) {
			if (other.device != null)
				return false;
		} else if (!device.equals(other.device))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longtitude == null) {
			if (other.longtitude != null)
				return false;
		} else if (!longtitude.equals(other.longtitude))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return JSON.toJson(this);
	}
}
