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
	public String title;
	
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
				+ ", home_points=" + home_points + ", away_points=" + away_points + ", title=" + title
				+ ", neutral_site=" + neutral_site + ", conference_game=" + conference_game + ", track_on_court="
				+ track_on_court + ", home=" + home + ", away=" + away + ", quarter=" + quarter + ", clock=" + clock
				+ ", clockRunning=" + clockRunning + ", timeLeftBeforeTheGame=" + timeLeftBeforeTheGame
				+ ", leagueName=" + leagueName + ", leagueAlias=" + leagueAlias + ", periodType=" + periodType
				+ ", broadcast=" + broadcast + "]";
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
