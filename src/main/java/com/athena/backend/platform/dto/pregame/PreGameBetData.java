package com.athena.backend.platform.dto.pregame;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class PreGameBetData {
	@JsonProperty(required=true)
	public String game_id;
	
	@JsonProperty(required=true)
	public String home_team_id;
	@JsonProperty(required=true)
	public String home_team_name;
	@JsonProperty(required=true)
	public String home_team_alias;
	@JsonProperty(required=true)
	public String away_team_id;
	@JsonProperty(required=true)
	public String away_team_name;
	@JsonProperty(required=true)
	public String away_team_alias;
	
	@JsonProperty(required=true)
	public double team_home_risk;
	@JsonProperty(required=true)
	public double team_home_win;
	@JsonProperty(required=true)
	public double team_away_risk;
	@JsonProperty(required=true)
	public double team_away_win;
	
	@JsonProperty(required=true)
	public double score_threshold;
	@JsonProperty(required=true)
	public double score_less_risk;
	@JsonProperty(required=true)
	public double score_more_risk;
	@JsonProperty(required=true)
	public double score_less_win;
	@JsonProperty(required=true)
	public double score_more_win;
	
	@JsonProperty(required=true)
	public List<PreGameMVPplayer> players;

	
}
