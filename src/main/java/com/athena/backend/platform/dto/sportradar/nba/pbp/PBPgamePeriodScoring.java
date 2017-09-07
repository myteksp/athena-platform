package com.athena.backend.platform.dto.sportradar.nba.pbp;

public final class PBPgamePeriodScoring {
	public PBPteamScore home;
	public PBPteamScore away;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
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
		final PBPgamePeriodScoring other = (PBPgamePeriodScoring) obj;
		if (away == null) {
			if (other.away != null)
				return false;
		} else if (!away.equals(other.away))
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
		return "PBPgamePeriodScoring [home=" + home + ", away=" + away + "]";
	}
}
