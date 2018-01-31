package com.athena.backend.platform.dto.sportradar.nba;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Game {
	public String id;
	//acceptable values [scheduled, inprogress, closed, pending]
	public String status;
	public String coverage;
	public Date scheduled;
	public int home_points;
	public int away_points;
	public Team home;
	public Team away;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final Game other = (Game) obj;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "Game [id=" + id + ", status=" + status + ", coverage=" + coverage + ", scheduled=" + scheduled
				+ ", home_points=" + home_points + ", away_points=" + away_points + ", home=" + home + ", away=" + away
				+ "]";
	}
}
