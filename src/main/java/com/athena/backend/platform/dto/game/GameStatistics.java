package com.athena.backend.platform.dto.game;

public final class GameStatistics {
	public String gameId;
	public String score;
	
	public Team home;
	public Team away;
	public Team winningTeam;
	
	public Player bestScorer;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((bestScorer == null) ? 0 : bestScorer.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		result = prime * result + ((winningTeam == null) ? 0 : winningTeam.hashCode());
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
		final GameStatistics other = (GameStatistics) obj;
		if (away == null) {
			if (other.away != null)
				return false;
		} else if (!away.equals(other.away))
			return false;
		if (bestScorer == null) {
			if (other.bestScorer != null)
				return false;
		} else if (!bestScorer.equals(other.bestScorer))
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
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		if (winningTeam == null) {
			if (other.winningTeam != null)
				return false;
		} else if (!winningTeam.equals(other.winningTeam))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GameStatistics [gameId=" + gameId + ", score=" + score + ", home=" + home + ", away=" + away
				+ ", winningTeam=" + winningTeam + ", bestScorer=" + bestScorer + "]";
	}

	
	public static final class Player{
		public String id;
		public String name;
		public int score;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + score;
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
			final Player other = (Player) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (score != other.score)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Player [id=" + id + ", name=" + name + ", score=" + score + "]";
		}
	}
	public static final class Team {
		public String id;
		public int score;
		public String name;
		
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + score;
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
			final Team other = (Team) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (score != other.score)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Team [id=" + id + ", score=" + score + ", name=" + name + "]";
		}
	}
}
