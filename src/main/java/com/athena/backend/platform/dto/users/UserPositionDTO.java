package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserPositionDTO {
	public UserDTO user;
	public long position;
	public UserBallanceDTO ballance;
	public int rank;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ballance == null) ? 0 : ballance.hashCode());
		result = prime * result + (int) (position ^ (position >>> 32));
		result = prime * result + rank;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		final UserPositionDTO other = (UserPositionDTO) obj;
		if (ballance == null) {
			if (other.ballance != null)
				return false;
		} else if (!ballance.equals(other.ballance))
			return false;
		if (position != other.position)
			return false;
		if (rank != other.rank)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserPositionDTO [user=" + user + ", position=" + position + ", ballance=" + ballance + ", rank=" + rank
				+ "]";
	}
}
