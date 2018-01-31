package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ActivateBetsResponse {
	public BetStatus status;
	public List<Bet> bets;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bets == null) ? 0 : bets.hashCode());
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
		final ActivateBetsResponse other = (ActivateBetsResponse) obj;
		if (bets == null) {
			if (other.bets != null)
				return false;
		} else if (!bets.equals(other.bets))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ActivateBetsResponse [status=" + status + ", bets=" + bets + "]";
	}
}
