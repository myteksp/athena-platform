package com.athena.backend.platform.dto.sportradar.nba;

import java.util.Date;

public final class Game {
	public String id;
	public String status;
	public String coverage;
	public Date scheduled;
	public int home_points;
	public int away_points;
	public Venue venue;
	public Broadcast broadcast;
	public Team home;
	public Team away;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + away_points;
		result = prime * result + ((broadcast == null) ? 0 : broadcast.hashCode());
		result = prime * result + ((coverage == null) ? 0 : coverage.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + home_points;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((venue == null) ? 0 : venue.hashCode());
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
		if (away_points != other.away_points)
			return false;
		if (broadcast == null) {
			if (other.broadcast != null)
				return false;
		} else if (!broadcast.equals(other.broadcast))
			return false;
		if (coverage == null) {
			if (other.coverage != null)
				return false;
		} else if (!coverage.equals(other.coverage))
			return false;
		if (home == null) {
			if (other.home != null)
				return false;
		} else if (!home.equals(other.home))
			return false;
		if (home_points != other.home_points)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (scheduled == null) {
			if (other.scheduled != null)
				return false;
		} else if (!scheduled.equals(other.scheduled))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (venue == null) {
			if (other.venue != null)
				return false;
		} else if (!venue.equals(other.venue))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "Game [id=" + id + ", status=" + status + ", coverage=" + coverage + ", scheduled=" + scheduled
				+ ", home_points=" + home_points + ", away_points=" + away_points + ", venue=" + venue + ", broadcast="
				+ broadcast + ", home=" + home + ", away=" + away + "]";
	}
}
