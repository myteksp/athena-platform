package com.vivala.analytics.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public final class AnalyticsUserData {
	@JsonProperty(required=true)
	public String project_id;
	@JsonProperty(required=true)
	public String user_id;
	@JsonProperty(required=false)
	public String param_1;
	@JsonProperty(required=false)
	public String param_2;
	@JsonProperty(required=false)
	public String param_3;
	@JsonProperty(required=false)
	public String param_4;
	@JsonProperty(required=false)
	public String param_5;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((project_id == null) ? 0 : project_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
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
		final AnalyticsUserData other = (AnalyticsUserData) obj;
		if (project_id == null) {
			if (other.project_id != null)
				return false;
		} else if (!project_id.equals(other.project_id))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "AnalyticsUserData [project_id=" + project_id + ", user_id=" + user_id + ", param_1=" + param_1
				+ ", param_2=" + param_2 + ", param_3=" + param_3 + ", param_4=" + param_4 + ", param_5=" + param_5
				+ "]";
	}
}
