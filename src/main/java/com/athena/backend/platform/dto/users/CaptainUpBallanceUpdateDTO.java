package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class CaptainUpBallanceUpdateDTO {
	public int delta;
	public String platform;
	public String badgeId;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((badgeId == null) ? 0 : badgeId.hashCode());
		result = prime * result + delta;
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
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
		final CaptainUpBallanceUpdateDTO other = (CaptainUpBallanceUpdateDTO) obj;
		if (badgeId == null) {
			if (other.badgeId != null)
				return false;
		} else if (!badgeId.equals(other.badgeId))
			return false;
		if (delta != other.delta)
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "CaptainUpBallanceUpdateDTO [delta=" + delta + ", platform=" + platform + ", badgeId=" + badgeId + "]";
	}
}
