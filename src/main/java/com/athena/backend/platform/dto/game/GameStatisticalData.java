package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class GameStatisticalData {
	@JsonProperty(required=true)
	public String gameId;
	
	@JsonProperty(required=false)
	public TeamStatisticalData home;
	
	@JsonProperty(required=false)
	public TeamStatisticalData away;
	

	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
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
		final GameStatisticalData other = (GameStatisticalData) obj;
		if (away == null) {
			if (other.away != null)
				return false;
		} else if (!away.equals(other.away))
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GameStatisticalData [gameId=" + gameId + ", home=" + home + ", away=" + away + "]";
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class TeamStatisticalData{
		public String teamId;
		public double winPrice;
		public double loosePrice;
		public List<PlayerStatisticalData> players;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(loosePrice);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((players == null) ? 0 : players.hashCode());
			result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
			temp = Double.doubleToLongBits(winPrice);
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
			final TeamStatisticalData other = (TeamStatisticalData) obj;
			if (Double.doubleToLongBits(loosePrice) != Double.doubleToLongBits(other.loosePrice))
				return false;
			if (players == null) {
				if (other.players != null)
					return false;
			} else if (!players.equals(other.players))
				return false;
			if (teamId == null) {
				if (other.teamId != null)
					return false;
			} else if (!teamId.equals(other.teamId))
				return false;
			if (Double.doubleToLongBits(winPrice) != Double.doubleToLongBits(other.winPrice))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "TeamStatisticalData [teamId=" + teamId + ", winPrice=" + winPrice + ", loosePrice=" + loosePrice
					+ ", players=" + players + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class PlayerStatisticalData{
		public String playerId;
		public double winPrice;
		public double loosePrice;
		public List<LocationStatisticalData> locations;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((locations == null) ? 0 : locations.hashCode());
			long temp;
			temp = Double.doubleToLongBits(loosePrice);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
			temp = Double.doubleToLongBits(winPrice);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			PlayerStatisticalData other = (PlayerStatisticalData) obj;
			if (locations == null) {
				if (other.locations != null)
					return false;
			} else if (!locations.equals(other.locations))
				return false;
			if (Double.doubleToLongBits(loosePrice) != Double.doubleToLongBits(other.loosePrice))
				return false;
			if (playerId == null) {
				if (other.playerId != null)
					return false;
			} else if (!playerId.equals(other.playerId))
				return false;
			if (Double.doubleToLongBits(winPrice) != Double.doubleToLongBits(other.winPrice))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "PlayerStatisticalData [playerId=" + playerId + ", winPrice=" + winPrice + ", loosePrice="
					+ loosePrice + ", locations=" + locations + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class LocationStatisticalData{
		public String playerId;
		public GameLocation location;
		public double winPrice;
		public double loosePrice;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((location == null) ? 0 : location.hashCode());
			long temp;
			temp = Double.doubleToLongBits(loosePrice);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
			temp = Double.doubleToLongBits(winPrice);
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
			final LocationStatisticalData other = (LocationStatisticalData) obj;
			if (location != other.location)
				return false;
			if (Double.doubleToLongBits(loosePrice) != Double.doubleToLongBits(other.loosePrice))
				return false;
			if (playerId == null) {
				if (other.playerId != null)
					return false;
			} else if (!playerId.equals(other.playerId))
				return false;
			if (Double.doubleToLongBits(winPrice) != Double.doubleToLongBits(other.winPrice))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "LocationStatisticalData [playerId=" + playerId + ", location=" + location + ", winPrice=" + winPrice
					+ ", loosePrice=" + loosePrice + "]";
		}
	}
}
