package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BetsBundle {
	public final String commonId;
	public final List<Bet> bets;
	
	public BetsBundle(final String commonId, final List<Bet> bets) {
		this.commonId = commonId;
		this.bets = bets;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bets == null) ? 0 : bets.hashCode());
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
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
		final BetsBundle other = (BetsBundle) obj;
		if (bets == null) {
			if (other.bets != null)
				return false;
		} else if (!bets.equals(other.bets))
			return false;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BetsBundle [commonId=" + commonId + ", bets=" + bets + "]";
	}
}
