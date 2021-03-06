package com.athena.backend.platform.dto.config;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.util.string.JSON;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConfigBundle {
	public Map<String, Object> config;
	public Map<String, Object> values;
	public Map<String, String> overrideScripts;
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
		final ConfigBundle other = (ConfigBundle) obj;
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
