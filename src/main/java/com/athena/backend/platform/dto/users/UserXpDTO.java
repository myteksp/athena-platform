package com.athena.backend.platform.dto.users;

public final class UserXpDTO {
	public final int xp;
	public UserXpDTO(final int xp) {
		this.xp = xp;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xp;
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
		final UserXpDTO other = (UserXpDTO) obj;
		if (xp != other.xp)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserXpDTO [xp=" + xp + "]";
	}
}
