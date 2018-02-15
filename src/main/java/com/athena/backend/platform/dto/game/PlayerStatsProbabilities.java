package com.athena.backend.platform.dto.game;

import java.util.List;

import com.athena.backend.platform.dto.game.PlayerStats.LocationStat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.collections.GfCollections;
import com.gf.collections.functions.MapFunction;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PlayerStatsProbabilities {
	public String playerId;
	public double willMake;
	public double willMiss;
	public List<LocationStatProbabilities> locations;

	public PlayerStatsProbabilities(final PlayerStats stats) {
		this.playerId = stats.playerId;
		if (stats.made == 0 && stats.miss == 0) {
			this.willMake = 0.5;
			this.willMiss = 0.5;
		}else if (stats.made == 0) {
			this.willMake = 0;
			this.willMiss = 1;
		}else if (stats.miss == 0) {
			this.willMake = 1;
			this.willMiss = 0;
		}else {
			final long totalShots = stats.made + stats.miss;
			this.willMake = ((double)stats.made) / ((double)totalShots);
			this.willMiss = ((double)stats.miss) / ((double)totalShots);
		}
		this.locations = GfCollections.wrapAsCollection(stats.locations)
				.map(new MapFunction<LocationStat, LocationStatProbabilities>() {
					@Override
					public final LocationStatProbabilities map(final LocationStat loc) {
						return new LocationStatProbabilities(loc);
					}
				});
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locations == null) ? 0 : locations.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(willMake);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(willMiss);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final PlayerStatsProbabilities other = (PlayerStatsProbabilities) obj;
		if (locations == null) {
			if (other.locations != null)
				return false;
		} else if (!locations.equals(other.locations))
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (Double.doubleToLongBits(willMake) != Double.doubleToLongBits(other.willMake))
			return false;
		if (Double.doubleToLongBits(willMiss) != Double.doubleToLongBits(other.willMiss))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PlayerStatsProbabilities [playerId=" + playerId + ", willMake=" + willMake + ", willMiss=" + willMiss
				+ ", locations=" + locations + "]";
	}








	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class LocationStatProbabilities{
		public GameLocation location;
		public double willMake;
		public double willMiss;

		public LocationStatProbabilities(final LocationStat stats) {
			this.location = stats.location;
			if (stats.made == 0 && stats.miss == 0) {
				this.willMake = 0.5;
				this.willMiss = 0.5;
			}else if (stats.made == 0) {
				this.willMake = 0;
				this.willMiss = 1;
			}else if (stats.miss == 0) {
				this.willMake = 1;
				this.willMiss = 0;
			}else {
				final long totalShots = stats.made + stats.miss;
				this.willMake = ((double)stats.made) / ((double)totalShots);
				this.willMiss = ((double)stats.miss) / ((double)totalShots);
			}
		}

		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((location == null) ? 0 : location.hashCode());
			long temp;
			temp = Double.doubleToLongBits(willMake);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(willMiss);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			final LocationStatProbabilities other = (LocationStatProbabilities) obj;
			if (location != other.location)
				return false;
			if (Double.doubleToLongBits(willMake) != Double.doubleToLongBits(other.willMake))
				return false;
			if (Double.doubleToLongBits(willMiss) != Double.doubleToLongBits(other.willMiss))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "LocationStatProbabilities [location=" + location + ", willMake=" + willMake + ", willMiss="
					+ willMiss + "]";
		}
	}
}
