package com.athena.backend.platform.dto.sportradar.nba.pbp;

public final class PBPgameEventStatistics {
	public String type;
	public boolean made;
	public String shot_type;
	public PBPteam team;
	public PBPplayer player;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (made ? 1231 : 1237);
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + ((shot_type == null) ? 0 : shot_type.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final PBPgameEventStatistics other = (PBPgameEventStatistics) obj;
		if (made != other.made)
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		if (shot_type == null) {
			if (other.shot_type != null)
				return false;
		} else if (!shot_type.equals(other.shot_type))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPgameEventStatistics [type=" + type + ", made=" + made + ", shot_type=" + shot_type + ", team=" + team
				+ ", player=" + player + "]";
	}
}
