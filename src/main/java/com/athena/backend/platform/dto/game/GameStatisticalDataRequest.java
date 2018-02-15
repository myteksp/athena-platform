package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameStatisticalDataRequest {
	public String gameId;
	public TeamStatisticesRequest home;
	public TeamStatisticesRequest away;
	
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
		final GameStatisticalDataRequest other = (GameStatisticalDataRequest) obj;
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
		return "GameStatisticalDataRequest [gameId=" + gameId + ", home=" + home + ", away=" + away + "]";
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class TeamStatisticesRequest{
		public String teamId;
		public List<String> players;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((players == null) ? 0 : players.hashCode());
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
			final TeamStatisticesRequest other = (TeamStatisticesRequest) obj;
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
			return true;
		}
		@Override
		public final String toString() {
			return "TeamStatisticesRequest [teamId=" + teamId + ", players=" + players + "]";
		}
	}
}
