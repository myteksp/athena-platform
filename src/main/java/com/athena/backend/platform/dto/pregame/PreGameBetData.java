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

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((away_team_alias == null) ? 0 : away_team_alias.hashCode());
		result = prime * result + ((away_team_id == null) ? 0 : away_team_id.hashCode());
		result = prime * result + ((away_team_name == null) ? 0 : away_team_name.hashCode());
		result = prime * result + ((game_id == null) ? 0 : game_id.hashCode());
		result = prime * result + ((home_team_alias == null) ? 0 : home_team_alias.hashCode());
		result = prime * result + ((home_team_id == null) ? 0 : home_team_id.hashCode());
		result = prime * result + ((home_team_name == null) ? 0 : home_team_name.hashCode());
		result = prime * result + ((players == null) ? 0 : players.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score_less_risk);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(score_less_win);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(score_more_risk);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(score_more_win);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(score_threshold);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(team_away_risk);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(team_away_win);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(team_home_risk);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(team_home_win);
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
		final PreGameBetData other = (PreGameBetData) obj;
		if (away_team_alias == null) {
			if (other.away_team_alias != null)
				return false;
		} else if (!away_team_alias.equals(other.away_team_alias))
			return false;
		if (away_team_id == null) {
			if (other.away_team_id != null)
				return false;
		} else if (!away_team_id.equals(other.away_team_id))
			return false;
		if (away_team_name == null) {
			if (other.away_team_name != null)
				return false;
		} else if (!away_team_name.equals(other.away_team_name))
			return false;
		if (game_id == null) {
			if (other.game_id != null)
				return false;
		} else if (!game_id.equals(other.game_id))
			return false;
		if (home_team_alias == null) {
			if (other.home_team_alias != null)
				return false;
		} else if (!home_team_alias.equals(other.home_team_alias))
			return false;
		if (home_team_id == null) {
			if (other.home_team_id != null)
				return false;
		} else if (!home_team_id.equals(other.home_team_id))
			return false;
		if (home_team_name == null) {
			if (other.home_team_name != null)
				return false;
		} else if (!home_team_name.equals(other.home_team_name))
			return false;
		if (players == null) {
			if (other.players != null)
				return false;
		} else if (!players.equals(other.players))
			return false;
		if (Double.doubleToLongBits(score_less_risk) != Double.doubleToLongBits(other.score_less_risk))
			return false;
		if (Double.doubleToLongBits(score_less_win) != Double.doubleToLongBits(other.score_less_win))
			return false;
		if (Double.doubleToLongBits(score_more_risk) != Double.doubleToLongBits(other.score_more_risk))
			return false;
		if (Double.doubleToLongBits(score_more_win) != Double.doubleToLongBits(other.score_more_win))
			return false;
		if (Double.doubleToLongBits(score_threshold) != Double.doubleToLongBits(other.score_threshold))
			return false;
		if (Double.doubleToLongBits(team_away_risk) != Double.doubleToLongBits(other.team_away_risk))
			return false;
		if (Double.doubleToLongBits(team_away_win) != Double.doubleToLongBits(other.team_away_win))
			return false;
		if (Double.doubleToLongBits(team_home_risk) != Double.doubleToLongBits(other.team_home_risk))
			return false;
		if (Double.doubleToLongBits(team_home_win) != Double.doubleToLongBits(other.team_home_win))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PreGameBetData [game_id=" + game_id + ", home_team_id=" + home_team_id + ", home_team_name="
				+ home_team_name + ", home_team_alias=" + home_team_alias + ", away_team_id=" + away_team_id
				+ ", away_team_name=" + away_team_name + ", away_team_alias=" + away_team_alias + ", team_home_risk="
				+ team_home_risk + ", team_home_win=" + team_home_win + ", team_away_risk=" + team_away_risk
				+ ", team_away_win=" + team_away_win + ", score_threshold=" + score_threshold + ", score_less_risk="
				+ score_less_risk + ", score_more_risk=" + score_more_risk + ", score_less_win=" + score_less_win
				+ ", score_more_win=" + score_more_win + ", players=" + players + "]";
	}
}
