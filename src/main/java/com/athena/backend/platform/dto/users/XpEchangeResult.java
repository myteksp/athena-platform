package com.athena.backend.platform.dto.users;

public final class XpEchangeResult {
	public final UserXpDTO xp;
	public final UserBallanceDTO ballance;
	
	public XpEchangeResult(final UserXpDTO xp, final UserBallanceDTO ballance) {
		this.xp = xp;
		this.ballance = ballance;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ballance == null) ? 0 : ballance.hashCode());
		result = prime * result + ((xp == null) ? 0 : xp.hashCode());
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
		final XpEchangeResult other = (XpEchangeResult) obj;
		if (ballance == null) {
			if (other.ballance != null)
				return false;
		} else if (!ballance.equals(other.ballance))
			return false;
		if (xp == null) {
			if (other.xp != null)
				return false;
		} else if (!xp.equals(other.xp))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "XpEchangeResult [xp=" + xp + ", ballance=" + ballance + "]";
	}
}
