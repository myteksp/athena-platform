package com.athena.backend.platform.dto.users;

import com.athena.backend.platform.dto.geometry.PointDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class LocationDTO {
	public boolean available;
	public PointDTO position;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}
	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocationDTO other = (LocationDTO) obj;
		if (available != other.available)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "LocationDTO [available=" + available + ", position=" + position + "]";
	}
}
