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
	public GameLocation location;
	public Long clientTime;
	public String teamName;
	public String playerName;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientTime == null) ? 0 : clientTime.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + stakeAmount;
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + winAmount;
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
		if (location != other.location)
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (stakeAmount != other.stakeAmount)
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (type != other.type)
			return false;
		if (winAmount != other.winAmount)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PlaceBetRequest [gameId=" + gameId + ", stakeAmount=" + stakeAmount + ", winAmount=" + winAmount
				+ ", type=" + type + ", teamId=" + teamId + ", playerId=" + playerId + ", location=" + location
				+ ", clientTime=" + clientTime + ", teamName=" + teamName + ", playerName=" + playerName + "]";
	}
}
