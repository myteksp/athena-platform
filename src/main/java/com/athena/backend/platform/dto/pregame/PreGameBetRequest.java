package com.athena.backend.platform.dto.pregame;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PreGameBetRequest {
	@JsonProperty(required=true)
	public PreGameBetType type;
	@JsonProperty(required=false)
	public String gameId;
	@JsonProperty(required=false)
	public String teamId;
	@JsonProperty(required=false)
	public String playerId;
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
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(riskAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((scoreBet == null) ? 0 : scoreBet.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		temp = Double.doubleToLongBits(winAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(winningThreshold);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final PreGameBetRequest other = (PreGameBetRequest) obj;
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
		if (Double.doubleToLongBits(riskAmount) != Double.doubleToLongBits(other.riskAmount))
			return false;
		if (scoreBet != other.scoreBet)
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (type != other.type)
			return false;
		if (Double.doubleToLongBits(winAmount) != Double.doubleToLongBits(other.winAmount))
			return false;
		if (Double.doubleToLongBits(winningThreshold) != Double.doubleToLongBits(other.winningThreshold))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PreGameBetRequest [type=" + type + ", gameId=" + gameId + ", teamId=" + teamId + ", playerId="
				+ playerId + ", scoreBet=" + scoreBet + ", riskAmount=" + riskAmount + ", winAmount=" + winAmount
				+ ", winningThreshold=" + winningThreshold + "]";
	}
}
