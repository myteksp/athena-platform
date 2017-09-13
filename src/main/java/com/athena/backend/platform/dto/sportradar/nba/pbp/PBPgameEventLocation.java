package com.athena.backend.platform.dto.sportradar.nba.pbp;

public final class PBPgameEventLocation {
	public int coord_x;
	public int coord_y;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (coord_x != other.coord_x)
			return false;
		if (coord_y != other.coord_y)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPgameEventLocation [coord_x=" + coord_x + ", coord_y=" + coord_y + "]";
	}
}