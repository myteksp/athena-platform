package com.athena.backend.platform.dto.game;


public final class PlaceBetResponse {
	public String betId;
	public BetStatus status;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
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
		final PlaceBetResponse other = (PlaceBetResponse) obj;
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
		return "GameBetResponse [betId=" + betId + ", status=" + status + "]";
	}
}
