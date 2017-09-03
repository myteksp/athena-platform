package com.athena.backend.platform.dto.sportradar.globalBasketball;

import java.util.Date;
import java.util.List;


public final class SportEvent {
	public String id;
	public Date scheduled;
	public boolean start_time_tbd;
	public String status;
	public TournamentRound tournament_round;
	public Season season;
	public Tournament tournament;
	public List<Competitor> competitors;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((competitors == null) ? 0 : competitors.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + (start_time_tbd ? 1231 : 1237);
		result = prime * result + ((tournament == null) ? 0 : tournament.hashCode());
		result = prime * result + ((tournament_round == null) ? 0 : tournament_round.hashCode());
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
		final SportEvent other = (SportEvent) obj;
		if (competitors == null) {
			if (other.competitors != null)
				return false;
		} else if (!competitors.equals(other.competitors))
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
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (start_time_tbd != other.start_time_tbd)
			return false;
		if (tournament == null) {
			if (other.tournament != null)
				return false;
		} else if (!tournament.equals(other.tournament))
			return false;
		if (tournament_round == null) {
			if (other.tournament_round != null)
				return false;
		} else if (!tournament_round.equals(other.tournament_round))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SportEvent [id=" + id + ", scheduled=" + scheduled + ", start_time_tbd=" + start_time_tbd
				+ ", tournament_round=" + tournament_round + ", season=" + season + ", tournament=" + tournament
				+ ", competitors=" + competitors + "]";
	}
}
