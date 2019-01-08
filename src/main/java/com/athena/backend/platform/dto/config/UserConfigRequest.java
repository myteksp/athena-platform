package com.athena.backend.platform.dto.config;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.util.string.JSON;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserConfigRequest {
	public String appId;
	public String userId;
	public Map<String, List<String>> headers;
	
	@Override
	public final int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final UserConfigRequest other = (UserConfigRequest) obj;
		return this.toString().equals(other.toString());
	}

	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
