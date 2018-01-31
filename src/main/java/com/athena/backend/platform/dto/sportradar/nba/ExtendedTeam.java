package com.athena.backend.platform.dto.sportradar.nba;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ExtendedTeam {
	public String id;
	public String name;
	public String alias;
	public String market;
	public Long founded;
	public String reference;
	public Venue venue;
	public League league;
	public Conference conference;
	public Division division;
	public List<Coach> coaches;
	public List<Player> players;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((coaches == null) ? 0 : coaches.hashCode());
		result = prime * result + ((conference == null) ? 0 : conference.hashCode());
		result = prime * result + ((division == null) ? 0 : division.hashCode());
		result = prime * result + ((founded == null) ? 0 : founded.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((league == null) ? 0 : league.hashCode());
		result = prime * result + ((market == null) ? 0 : market.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((players == null) ? 0 : players.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
		final ExtendedTeam other = (ExtendedTeam) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (coaches == null) {
			if (other.coaches != null)
				return false;
		} else if (!coaches.equals(other.coaches))
			return false;
		if (conference == null) {
			if (other.conference != null)
				return false;
		} else if (!conference.equals(other.conference))
			return false;
		if (division == null) {
			if (other.division != null)
				return false;
		} else if (!division.equals(other.division))
			return false;
		if (founded == null) {
			if (other.founded != null)
				return false;
		} else if (!founded.equals(other.founded))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (league == null) {
			if (other.league != null)
				return false;
		} else if (!league.equals(other.league))
			return false;
		if (market == null) {
			if (other.market != null)
				return false;
		} else if (!market.equals(other.market))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (players == null) {
			if (other.players != null)
				return false;
		} else if (!players.equals(other.players))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
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
		return "ExtendedTeam [id=" + id + ", name=" + name + ", alias=" + alias + ", market=" + market + ", founded="
				+ founded + ", reference=" + reference + ", venue=" + venue + ", league=" + league + ", conference="
				+ conference + ", division=" + division + ", coaches=" + coaches + ", players=" + players + "]";
	}
}
