package com.athena.backend.platform.dto.pregame;

import java.util.List;

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
	public List<String> nonOfThePlayers;
	@JsonProperty(required=false)
	public ScoreBetType scoreBet;
	@JsonProperty(required=true)
	public double riskAmount;
	@JsonProperty(required=true)
	public double winAmount;
	@JsonProperty(required=false)
	public double winningThreshold;
	
}
