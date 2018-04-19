package com.vivala.analytics.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public final class Event {
	@JsonProperty(required=false)
	public String id = null;

	@JsonProperty(required=false)
	public String project_id = null;
	@JsonProperty(required=false)
	public String user_id = null;
	@JsonProperty(required=false)
	public String session_id = null;
	@JsonProperty(required=false)
	public String platform = null;
	@JsonProperty(required=false)
	public String login_type = null;
	@JsonProperty(required=false)
	public String country = null;
	@JsonProperty(required=false)
	public String city = null;
	@JsonProperty(required=false)
	public String ip = null;

	@JsonProperty(required=true)
	public Kind kind = null;

	@JsonProperty(required=true)
	public String type = null;
	@JsonProperty(required=false)
	public String sub_type_1 = null;
	@JsonProperty(required=false)
	public String sub_type_2 = null;
	@JsonProperty(required=false)
	public String sub_type_3 = null;
	@JsonProperty(required=false)
	public String sub_type_4 = null;
	@JsonProperty(required=false)
	public String sub_type_5 = null;

	@JsonProperty(required=false)
	public String param_1 = null;
	@JsonProperty(required=false)
	public String param_2 = null;
	@JsonProperty(required=false)
	public String param_3 = null;
	@JsonProperty(required=false)
	public String param_4 = null;
	@JsonProperty(required=false)
	public String param_5 = null;

	@JsonProperty(required=false)
	public Long long_param_1 = null;
	@JsonProperty(required=false)
	public Long long_param_2 = null;
	@JsonProperty(required=false)
	public Long long_param_3 = null;

	@JsonProperty(required=false)
	public Double double_param_1 = null;
	@JsonProperty(required=false)
	public Double double_param_2 = null;
	@JsonProperty(required=false)
	public Double double_param_3 = null;
	
	
	public static enum Kind{
		SINGLE, START, END, UPDATE
	}


	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((double_param_1 == null) ? 0 : double_param_1.hashCode());
		result = prime * result + ((double_param_2 == null) ? 0 : double_param_2.hashCode());
		result = prime * result + ((double_param_3 == null) ? 0 : double_param_3.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + ((login_type == null) ? 0 : login_type.hashCode());
		result = prime * result + ((long_param_1 == null) ? 0 : long_param_1.hashCode());
		result = prime * result + ((long_param_2 == null) ? 0 : long_param_2.hashCode());
		result = prime * result + ((long_param_3 == null) ? 0 : long_param_3.hashCode());
		result = prime * result + ((param_1 == null) ? 0 : param_1.hashCode());
		result = prime * result + ((param_2 == null) ? 0 : param_2.hashCode());
		result = prime * result + ((param_3 == null) ? 0 : param_3.hashCode());
		result = prime * result + ((param_4 == null) ? 0 : param_4.hashCode());
		result = prime * result + ((param_5 == null) ? 0 : param_5.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
		result = prime * result + ((project_id == null) ? 0 : project_id.hashCode());
		result = prime * result + ((session_id == null) ? 0 : session_id.hashCode());
		result = prime * result + ((sub_type_1 == null) ? 0 : sub_type_1.hashCode());
		result = prime * result + ((sub_type_2 == null) ? 0 : sub_type_2.hashCode());
		result = prime * result + ((sub_type_3 == null) ? 0 : sub_type_3.hashCode());
		result = prime * result + ((sub_type_4 == null) ? 0 : sub_type_4.hashCode());
		result = prime * result + ((sub_type_5 == null) ? 0 : sub_type_5.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final Event other = (Event) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (double_param_1 == null) {
			if (other.double_param_1 != null)
				return false;
		} else if (!double_param_1.equals(other.double_param_1))
			return false;
		if (double_param_2 == null) {
			if (other.double_param_2 != null)
				return false;
		} else if (!double_param_2.equals(other.double_param_2))
			return false;
		if (double_param_3 == null) {
			if (other.double_param_3 != null)
				return false;
		} else if (!double_param_3.equals(other.double_param_3))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (kind != other.kind)
			return false;
		if (login_type == null) {
			if (other.login_type != null)
				return false;
		} else if (!login_type.equals(other.login_type))
			return false;
		if (long_param_1 == null) {
			if (other.long_param_1 != null)
				return false;
		} else if (!long_param_1.equals(other.long_param_1))
			return false;
		if (long_param_2 == null) {
			if (other.long_param_2 != null)
				return false;
		} else if (!long_param_2.equals(other.long_param_2))
			return false;
		if (long_param_3 == null) {
			if (other.long_param_3 != null)
				return false;
		} else if (!long_param_3.equals(other.long_param_3))
			return false;
		if (param_1 == null) {
			if (other.param_1 != null)
				return false;
		} else if (!param_1.equals(other.param_1))
			return false;
		if (param_2 == null) {
			if (other.param_2 != null)
				return false;
		} else if (!param_2.equals(other.param_2))
			return false;
		if (param_3 == null) {
			if (other.param_3 != null)
				return false;
		} else if (!param_3.equals(other.param_3))
			return false;
		if (param_4 == null) {
			if (other.param_4 != null)
				return false;
		} else if (!param_4.equals(other.param_4))
			return false;
		if (param_5 == null) {
			if (other.param_5 != null)
				return false;
		} else if (!param_5.equals(other.param_5))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (project_id == null) {
			if (other.project_id != null)
				return false;
		} else if (!project_id.equals(other.project_id))
			return false;
		if (session_id == null) {
			if (other.session_id != null)
				return false;
		} else if (!session_id.equals(other.session_id))
			return false;
		if (sub_type_1 == null) {
			if (other.sub_type_1 != null)
				return false;
		} else if (!sub_type_1.equals(other.sub_type_1))
			return false;
		if (sub_type_2 == null) {
			if (other.sub_type_2 != null)
				return false;
		} else if (!sub_type_2.equals(other.sub_type_2))
			return false;
		if (sub_type_3 == null) {
			if (other.sub_type_3 != null)
				return false;
		} else if (!sub_type_3.equals(other.sub_type_3))
			return false;
		if (sub_type_4 == null) {
			if (other.sub_type_4 != null)
				return false;
		} else if (!sub_type_4.equals(other.sub_type_4))
			return false;
		if (sub_type_5 == null) {
			if (other.sub_type_5 != null)
				return false;
		} else if (!sub_type_5.equals(other.sub_type_5))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
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
		return "Event [id=" + id + ", project_id=" + project_id + ", user_id=" + user_id + ", session_id=" + session_id
				+ ", platform=" + platform + ", login_type=" + login_type + ", country=" + country + ", city=" + city
				+ ", ip=" + ip + ", kind=" + kind + ", type=" + type + ", sub_type_1=" + sub_type_1 + ", sub_type_2="
				+ sub_type_2 + ", sub_type_3=" + sub_type_3 + ", sub_type_4=" + sub_type_4 + ", sub_type_5="
				+ sub_type_5 + ", param_1=" + param_1 + ", param_2=" + param_2 + ", param_3=" + param_3 + ", param_4="
				+ param_4 + ", param_5=" + param_5 + ", long_param_1=" + long_param_1 + ", long_param_2=" + long_param_2
				+ ", long_param_3=" + long_param_3 + ", double_param_1=" + double_param_1 + ", double_param_2="
				+ double_param_2 + ", double_param_3=" + double_param_3 + "]";
	}
}
