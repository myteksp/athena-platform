package com.athena.backend.platform.dto.sportradar.nba;

import java.util.Date;
import java.util.List;

public final class DailySchedule {
	public Date date;
	public League league;
	public List<Game> games;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((games == null) ? 0 : games.hashCode());
		result = prime * result + ((league == null) ? 0 : league.hashCode());
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
		final DailySchedule other = (DailySchedule) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (games == null) {
			if (other.games != null)
				return false;
		} else if (!games.equals(other.games))
			return false;
		if (league == null) {
			if (other.league != null)
				return false;
		} else if (!league.equals(other.league))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "DailySchedule [date=" + date + ", league=" + league + ", games=" + games + "]";
	}
}
