package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PlayerStats {
	public String playerId;
	public long made;
	public long miss;
	public List<LocationStat> locations;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locations == null) ? 0 : locations.hashCode());
		result = prime * result + (int) (made ^ (made >>> 32));
		result = prime * result + (int) (miss ^ (miss >>> 32));
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
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
		final PlayerStats other = (PlayerStats) obj;
		if (locations == null) {
			if (other.locations != null)
				return false;
		} else if (!locations.equals(other.locations))
			return false;
		if (made != other.made)
			return false;
		if (miss != other.miss)
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PlayerStats [playerId=" + playerId + ", made=" + made + ", miss=" + miss + ", locations=" + locations
				+ "]";
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class LocationStat{
		public GameLocation location;
		public long made;
		public long miss;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((location == null) ? 0 : location.hashCode());
			result = prime * result + (int) (made ^ (made >>> 32));
			result = prime * result + (int) (miss ^ (miss >>> 32));
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
			final LocationStat other = (LocationStat) obj;
			if (location != other.location)
				return false;
			if (made != other.made)
				return false;
			if (miss != other.miss)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "LocationStat [location=" + location + ", made=" + made + ", miss=" + miss + "]";
		}
	}
}
