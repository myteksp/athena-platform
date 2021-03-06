package com.athena.backend.platform.dto.sportradar.nba.pbp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PBPgameEventAttribution {
	public String id;
	public String name;
	public String market;
	public String team_basket;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((market == null) ? 0 : market.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((team_basket == null) ? 0 : team_basket.hashCode());
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
		final PBPgameEventAttribution other = (PBPgameEventAttribution) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (team_basket == null) {
			if (other.team_basket != null)
				return false;
		} else if (!team_basket.equals(other.team_basket))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPgameEventAttribution [id=" + id + ", name=" + name + ", market=" + market + ", team_basket="
				+ team_basket + "]";
	}
}
