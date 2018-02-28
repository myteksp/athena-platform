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
	
	@JsonProperty(required=true)
	public String clock;
	
	
	@JsonProperty(required=false)
	public String playerId;
	
	@JsonProperty(required=false)
	public GameLocation location;
	
	@JsonProperty(required=false)
	public String playerName;


}
