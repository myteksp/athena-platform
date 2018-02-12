package com.athena.backend.platform.dto.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PlaceBetRequest {
	@JsonProperty(required=true)
	public String gameId;
	
	@JsonProperty(required=true)
	public int stakeAmount;
	
	@JsonProperty(required=true)
	public int winAmount;
	
	@JsonProperty(required=true)
	public BetType type;
	
	@JsonProperty(required=true)
	public String teamId;
	
	@JsonProperty(required=true)
	public String teamName;
	
	@JsonProperty(required=true)
	public long clientTime;
	
	@JsonProperty(required=true)
	public int quarter;
	
	
	@JsonProperty(required=false)
	public String playerId;
	
	@JsonProperty(required=false)
	public GameLocation location;
	
	@JsonProperty(required=false)
	public String playerName;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + quarter;
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
		if (quarter != other.quarter)
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
				+ ", type=" + type + ", teamId=" + teamId + ", teamName=" + teamName + ", clientTime=" + clientTime
				+ ", quarter=" + quarter + ", playerId=" + playerId + ", location=" + location + ", playerName="
				+ playerName + "]";
	}
}
