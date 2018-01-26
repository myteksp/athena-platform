package com.athena.backend.platform.dto.game;

import com.athena.backend.platform.dto.users.UserBallanceDTO;

public final class GameBetResponse {
	public String betId;
	public UserBallanceDTO ballance;
	public Status status;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ballance == null) ? 0 : ballance.hashCode());
		result = prime * result + ((betId == null) ? 0 : betId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		final GameBetResponse other = (GameBetResponse) obj;
		if (ballance == null) {
			if (other.ballance != null)
				return false;
		} else if (!ballance.equals(other.ballance))
			return false;
		if (betId == null) {
			if (other.betId != null)
				return false;
		} else if (!betId.equals(other.betId))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GameBetResponse [betId=" + betId + ", ballance=" + ballance + ", status=" + status + "]";
	}
	public static enum Status{
		ACCEPTED, REJECTED_INSUFFICENT_BALLANCE, REJECTED_GAME_OUTOFDATE
	}
}
