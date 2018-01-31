package com.athena.backend.platform.dto.sportradar.nba.pbp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PBPgameEventLocation {
	public int coord_x;
	public int coord_y;
	public String action_area;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action_area == null) ? 0 : action_area.hashCode());
		result = prime * result + coord_x;
		result = prime * result + coord_y;
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
		final PBPgameEventLocation other = (PBPgameEventLocation) obj;
		if (action_area == null) {
			if (other.action_area != null)
				return false;
		} else if (!action_area.equals(other.action_area))
			return false;
		if (coord_x != other.coord_x)
			return false;
		if (coord_y != other.coord_y)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPgameEventLocation [coord_x=" + coord_x + ", coord_y=" + coord_y + ", action_area=" + action_area
				+ "]";
	}
}
