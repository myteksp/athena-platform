package com.athena.backend.platform.dto.users;

public final class UserXpDTO {
	public final int xp;
	public final String title;
	public UserXpDTO(final int xp, final String title) {
		this.xp = xp;
		this.title = title;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (xp != other.xp)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserXpDTO [xp=" + xp + ", title=" + title + "]";
	}
}
