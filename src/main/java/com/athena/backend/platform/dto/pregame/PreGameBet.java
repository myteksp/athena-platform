package com.athena.backend.platform.dto.pregame;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class PreGameBet {
	@JsonProperty(required=true)
	public String id;
	@JsonProperty(required=true)
	public PreGameBetType type;
	@JsonProperty(required=true)
	public PreGameBetStatus status;
	@JsonProperty(required=true)
	public String statusMessage;
	@JsonProperty(required=true)
	public String gameId;
	@JsonProperty(required=true)
	public String userId;
	@JsonProperty(required=true)
	public long placedAt;
	
	@JsonProperty(required=false)
	public Long completedAt;
	@JsonProperty(required=false)
	public String teamId;
	@JsonProperty(required=false)
	public String playerId;
	@JsonProperty(required=false)
	public ScoreBetType scoreBet;
	@JsonProperty(required=false)
	public Double scoreBetAmount;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((completedAt == null) ? 0 : completedAt.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (placedAt ^ (placedAt >>> 32));
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((scoreBet == null) ? 0 : scoreBet.hashCode());
		result = prime * result + ((scoreBetAmount == null) ? 0 : scoreBetAmount.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusMessage == null) ? 0 : statusMessage.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		final PreGameBet other = (PreGameBet) obj;
		if (completedAt == null) {
			if (other.completedAt != null)
				return false;
		} else if (!completedAt.equals(other.completedAt))
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (placedAt != other.placedAt)
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (scoreBet != other.scoreBet)
			return false;
		if (scoreBetAmount == null) {
			if (other.scoreBetAmount != null)
				return false;
		} else if (!scoreBetAmount.equals(other.scoreBetAmount))
			return false;
		if (status != other.status)
			return false;
		if (statusMessage == null) {
			if (other.statusMessage != null)
				return false;
		} else if (!statusMessage.equals(other.statusMessage))
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (type != other.type)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PreGameBet [id=" + id + ", type=" + type + ", status=" + status + ", statusMessage=" + statusMessage
				+ ", gameId=" + gameId + ", userId=" + userId + ", placedAt=" + placedAt + ", completedAt="
				+ completedAt + ", teamId=" + teamId + ", playerId=" + playerId + ", scoreBet=" + scoreBet
				+ ", scoreBetAmount=" + scoreBetAmount + "]";
	}
}
