package com.athena.backend.platform.dto.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PlaceBetRequest {
	public String gameId;
	public int stakeAmount;
	public int winAmount;
	public BetType type;
	public String teamId;
	public String playerId;
	public Integer x;
	public Integer y;
	public Long clientTime;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientTime == null) ? 0 : clientTime.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + stakeAmount;
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + winAmount;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
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
		final PlaceBetRequest other = (PlaceBetRequest) obj;
		if (clientTime == null) {
			if (other.clientTime != null)
				return false;
		} else if (!clientTime.equals(other.clientTime))
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (stakeAmount != other.stakeAmount)
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (type != other.type)
			return false;
		if (winAmount != other.winAmount)
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PlaceBetRequest [gameId=" + gameId + ", stakeAmount=" + stakeAmount + ", winAmount=" + winAmount
				+ ", type=" + type + ", teamId=" + teamId + ", playerId=" + playerId + ", x=" + x + ", y=" + y
				+ ", clientTime=" + clientTime + "]";
	}
}
