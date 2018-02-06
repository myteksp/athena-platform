package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PlacedBetsResponse {
	public String commonId;
	public List<PlaceBetResponse> placedBets;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
		result = prime * result + ((placedBets == null) ? 0 : placedBets.hashCode());
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
		final PlacedBetsResponse other = (PlacedBetsResponse) obj;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
			return false;
		if (placedBets == null) {
			if (other.placedBets != null)
				return false;
		} else if (!placedBets.equals(other.placedBets))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PlacedBetsResponse [commonId=" + commonId + ", placedBets=" + placedBets + "]";
	}
}
