package com.athena.backend.platform.dto.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.util.string.JSON;

public final class DeviceDTO {
	@JsonProperty(required=true)
	public String deviceId;
	@JsonProperty(required=true)
	public String userId;
	@JsonProperty(required=true)
	public Platform platform;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
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
		final DeviceDTO other = (DeviceDTO) obj;
		if (deviceId == null) {
			if (other.deviceId != null)
				return false;
		} else if (!deviceId.equals(other.deviceId))
			return false;
		if (platform != other.platform)
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
