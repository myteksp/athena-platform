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
	
	public boolean neutral_site;
	public boolean conference_game;
	public boolean track_on_court;
	
	public Team home;
	public Team away;
	public int quarter;
	public String clock;
	public boolean clockRunning;
	public long timeLeftBeforeTheGame;
	public String leagueName;
	public String leagueAlias;
	public String periodType;
	public Broadcast broadcast;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away == null) ? 0 : away.hashCode());
		result = prime * result + away_points;
		result = prime * result + ((broadcast == null) ? 0 : broadcast.hashCode());
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + (clockRunning ? 1231 : 1237);
		result = prime * result + (conference_game ? 1231 : 1237);
		result = prime * result + ((coverage == null) ? 0 : coverage.hashCode());
		result = prime * result + ((home == null) ? 0 : home.hashCode());
		result = prime * result + home_points;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((leagueAlias == null) ? 0 : leagueAlias.hashCode());
		result = prime * result + ((leagueName == null) ? 0 : leagueName.hashCode());
		result = prime * result + (neutral_site ? 1231 : 1237);
		result = prime * result + ((periodType == null) ? 0 : periodType.hashCode());
		result = prime * result + quarter;
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + (int) (timeLeftBeforeTheGame ^ (timeLeftBeforeTheGame >>> 32));
		result = prime * result + (track_on_court ? 1231 : 1237);
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
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (clockRunning != other.clockRunning)
			return false;
		if (conference_game != other.conference_game)
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
		if (leagueAlias == null) {
			if (other.leagueAlias != null)
				return false;
		} else if (!leagueAlias.equals(other.leagueAlias))
			return false;
		if (leagueName == null) {
			if (other.leagueName != null)
				return false;
		} else if (!leagueName.equals(other.leagueName))
			return false;
		if (neutral_site != other.neutral_site)
			return false;
		if (periodType == null) {
			if (other.periodType != null)
				return false;
		} else if (!periodType.equals(other.periodType))
			return false;
		if (quarter != other.quarter)
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
		if (timeLeftBeforeTheGame != other.timeLeftBeforeTheGame)
			return false;
		if (track_on_court != other.track_on_court)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "Game [id=" + id + ", status=" + status + ", coverage=" + coverage + ", scheduled=" + scheduled
				+ ", home_points=" + home_points + ", away_points=" + away_points + ", neutral_site=" + neutral_site
				+ ", conference_game=" + conference_game + ", track_on_court=" + track_on_court + ", home=" + home
				+ ", away=" + away + ", quarter=" + quarter + ", clock=" + clock + ", clockRunning=" + clockRunning
				+ ", timeLeftBeforeTheGame=" + timeLeftBeforeTheGame + ", leagueName=" + leagueName + ", leagueAlias="
				+ leagueAlias + ", periodType=" + periodType + ", broadcast=" + broadcast + "]";
	}



	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Broadcast{
		public String network;
		public String satellite;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((network == null) ? 0 : network.hashCode());
			result = prime * result + ((satellite == null) ? 0 : satellite.hashCode());
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
			final Broadcast other = (Broadcast) obj;
			if (network == null) {
				if (other.network != null)
					return false;
			} else if (!network.equals(other.network))
				return false;
			if (satellite == null) {
				if (other.satellite != null)
					return false;
			} else if (!satellite.equals(other.satellite))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Broadcast [network=" + network + ", satellite=" + satellite + "]";
		}
	}
}
