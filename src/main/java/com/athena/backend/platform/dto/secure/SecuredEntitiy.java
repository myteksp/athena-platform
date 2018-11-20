package com.athena.backend.platform.dto.secure;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SecuredEntitiy {
	public String encrypted;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((encrypted == null) ? 0 : encrypted.hashCode());
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
		final SecuredEntitiy other = (SecuredEntitiy) obj;
		if (encrypted == null) {
			if (other.encrypted != null)
				return false;
		} else if (!encrypted.equals(other.encrypted))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SecuredEntitiy [encrypted=" + encrypted + "]";
	}
}
