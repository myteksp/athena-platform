package com.athena.backend.platform.dto.pregame;

import java.util.List;

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
	public List<String> nonOfThePlayers;
	@JsonProperty(required=false)
	public ScoreBetType scoreBet;
	@JsonProperty(required=true)
	public double riskAmount;
	@JsonProperty(required=true)
	public double winAmount;
	@JsonProperty(required=false)
	public double winningThreshold;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PreGameBet [id=" + id + ", type=" + type + ", status=" + status + ", statusMessage=" + statusMessage
				+ ", gameId=" + gameId + ", userId=" + userId + ", placedAt=" + placedAt + ", completedAt="
				+ completedAt + ", teamId=" + teamId + ", playerId=" + playerId + ", nonOfThePlayers=" + nonOfThePlayers
				+ ", scoreBet=" + scoreBet + ", riskAmount=" + riskAmount + ", winAmount=" + winAmount
				+ ", winningThreshold=" + winningThreshold + "]";
	}
}
