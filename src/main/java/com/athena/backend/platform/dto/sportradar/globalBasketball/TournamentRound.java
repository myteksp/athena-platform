package com.athena.backend.platform.dto.sportradar.globalBasketball;


public final class TournamentRound {
	public String type;
	public String name;
	public int cup_round_match_number;
	public int cup_round_matches;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cup_round_match_number;
		result = prime * result + cup_round_matches;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		final TournamentRound other = (TournamentRound) obj;
		if (cup_round_match_number != other.cup_round_match_number)
			return false;
		if (cup_round_matches != other.cup_round_matches)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return "TournamentRound [type=" + type + ", name=" + name + ", cup_round_match_number="
				+ cup_round_match_number + ", cup_round_matches=" + cup_round_matches + "]";
	}
}
