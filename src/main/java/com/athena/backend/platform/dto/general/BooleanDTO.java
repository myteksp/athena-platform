package com.athena.backend.platform.dto.general;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BooleanDTO {
	public boolean result;
	public Map<String, Object> params;
	
	public BooleanDTO() {}

	public BooleanDTO(final boolean result, final Object ...params) {
		this.params = new HashMap<String, Object>();
		this.result = result;
		final int len = params.length;
		if (len > 0) {
			String key = "";
			for (int i = 0; i < len; i++) {
				final Object p = params[i];
				if (i % 2 == 0) {
					if (p == null) 
						key = "null";
					else
						key = p.toString();
				}else {
					this.params.put(key, p);
				}
			}
		}
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((params == null) ? 0 : params.hashCode());
		result = prime * result + (this.result ? 1231 : 1237);
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
		final BooleanDTO other = (BooleanDTO) obj;
		if (params == null) {
			if (other.params != null)
				return false;
		} else if (!params.equals(other.params))
			return false;
		if (result != other.result)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BooleanDTO [result=" + result + ", params=" + params + "]";
	}
}
