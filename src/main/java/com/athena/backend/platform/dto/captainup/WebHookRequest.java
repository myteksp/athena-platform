package com.athena.backend.platform.dto.captainup;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebHookRequest {
	public String timestamp;
	public String user;
	public String app;
	public String type;
	public Map<String, Curency> currencies;
	public Map<String, Object> user_data;
	public Map<String, Object> data;
	public Map<String, Object> custom;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((app == null) ? 0 : app.hashCode());
		result = prime * result + ((currencies == null) ? 0 : currencies.hashCode());
		result = prime * result + ((custom == null) ? 0 : custom.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((user_data == null) ? 0 : user_data.hashCode());
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
		final WebHookRequest other = (WebHookRequest) obj;
		if (app == null) {
			if (other.app != null)
				return false;
		} else if (!app.equals(other.app))
			return false;
		if (currencies == null) {
			if (other.currencies != null)
				return false;
		} else if (!currencies.equals(other.currencies))
			return false;
		if (custom == null) {
			if (other.custom != null)
				return false;
		} else if (!custom.equals(other.custom))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (user_data == null) {
			if (other.user_data != null)
				return false;
		} else if (!user_data.equals(other.user_data))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "WebHookRequest [timestamp=" + timestamp + ", user=" + user + ", app=" + app + ", type=" + type
				+ ", currencies=" + currencies + ", user_data=" + user_data + ", data=" + data + ", custom=" + custom
				+ "]";
	}
}
