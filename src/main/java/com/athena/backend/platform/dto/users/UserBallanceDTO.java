package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserBallanceDTO {
	public double rank;
	public int ballance;
	public UserXpDTO experience;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ballance;
		result = prime * result + ((experience == null) ? 0 : experience.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rank);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final UserBallanceDTO other = (UserBallanceDTO) obj;
		if (ballance != other.ballance)
			return false;
		if (experience == null) {
			if (other.experience != null)
				return false;
		} else if (!experience.equals(other.experience))
			return false;
		if (Double.doubleToLongBits(rank) != Double.doubleToLongBits(other.rank))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserBallanceDTO [rank=" + rank + ", ballance=" + ballance + ", experience=" + experience + "]";
	}
}
