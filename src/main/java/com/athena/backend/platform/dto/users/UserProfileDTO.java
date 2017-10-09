package com.athena.backend.platform.dto.users;

public final class UserProfileDTO {
	public String avatarUrl;
	public String name;
	public String socialNetwork;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avatarUrl == null) ? 0 : avatarUrl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((socialNetwork == null) ? 0 : socialNetwork.hashCode());
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
		final UserProfileDTO other = (UserProfileDTO) obj;
		if (avatarUrl == null) {
			if (other.avatarUrl != null)
				return false;
		} else if (!avatarUrl.equals(other.avatarUrl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (socialNetwork == null) {
			if (other.socialNetwork != null)
				return false;
		} else if (!socialNetwork.equals(other.socialNetwork))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserProfileDTO [avatarUrl=" + avatarUrl + ", name=" + name + ", socialNetwork=" + socialNetwork + "]";
	}
}
