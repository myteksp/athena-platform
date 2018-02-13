package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BetStatistics {
	public String gameId;
	public boolean available;
	public List<TeamBetStat> teams;
	public List<PlayerBetStat> players;
	public List<LocationBetStat> locations;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((locations == null) ? 0 : locations.hashCode());
		result = prime * result + ((players == null) ? 0 : players.hashCode());
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
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
		final BetStatistics other = (BetStatistics) obj;
		if (available != other.available)
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (locations == null) {
			if (other.locations != null)
				return false;
		} else if (!locations.equals(other.locations))
			return false;
		if (players == null) {
			if (other.players != null)
				return false;
		} else if (!players.equals(other.players))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BetStatistics [gameId=" + gameId + ", available=" + available + ", teams=" + teams + ", players="
				+ players + ", locations=" + locations + "]";
	}

	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class TeamBetStat{
		public String teamId;
		public double portion;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(portion);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
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
			final TeamBetStat other = (TeamBetStat) obj;
			if (Double.doubleToLongBits(portion) != Double.doubleToLongBits(other.portion))
				return false;
			if (teamId == null) {
				if (other.teamId != null)
					return false;
			} else if (!teamId.equals(other.teamId))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "TeamBetStat [teamId=" + teamId + ", portion=" + portion + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class PlayerBetStat{
		public String teamId;
		public String playerId;
		public double portion;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
			long temp;
			temp = Double.doubleToLongBits(portion);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
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
			final PlayerBetStat other = (PlayerBetStat) obj;
			if (playerId == null) {
				if (other.playerId != null)
					return false;
			} else if (!playerId.equals(other.playerId))
				return false;
			if (Double.doubleToLongBits(portion) != Double.doubleToLongBits(other.portion))
				return false;
			if (teamId == null) {
				if (other.teamId != null)
					return false;
			} else if (!teamId.equals(other.teamId))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "PlayerBetStat [teamId=" + teamId + ", playerId=" + playerId + ", portion=" + portion + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class LocationBetStat{
		public String teamId;
		public String playerId;
		public GameLocation location;
		public double portion;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((location == null) ? 0 : location.hashCode());
			result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
			long temp;
			temp = Double.doubleToLongBits(portion);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
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
			final LocationBetStat other = (LocationBetStat) obj;
			if (location != other.location)
				return false;
			if (playerId == null) {
				if (other.playerId != null)
					return false;
			} else if (!playerId.equals(other.playerId))
				return false;
			if (Double.doubleToLongBits(portion) != Double.doubleToLongBits(other.portion))
				return false;
			if (teamId == null) {
				if (other.teamId != null)
					return false;
			} else if (!teamId.equals(other.teamId))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "LocationBetStat [teamId=" + teamId + ", playerId=" + playerId + ", location=" + location
					+ ", portion=" + portion + "]";
		}
	}
}
