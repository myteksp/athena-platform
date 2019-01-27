package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.util.string.JSON;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ValueSource {
	@JsonProperty(required=false)
	public String id;
	
	@JsonProperty(required=true)
	public String name;
	
	@JsonProperty(required=true)
	public String url;
	
	@JsonProperty(required=true)
	public String valueNameField;
	
	@JsonProperty(required=true)
	public String valueField;
	
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
		final ValueSource other = (ValueSource) obj;
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
