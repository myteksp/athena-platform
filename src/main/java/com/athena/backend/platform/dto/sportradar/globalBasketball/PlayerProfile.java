package com.athena.backend.platform.dto.sportradar.globalBasketball;

import java.util.List;

import com.athena.backend.platform.dto.sportradar.nba.League;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PlayerProfile {
	public String id;
	public String status;
	public String full_name;
	public String first_name;
	public String last_name;
	public String abbr_name;
	public Double height;
	public Double weight;
	public String position;
	public String primary_position;
	public String jersey_number;
	public String experience;
	public String birth_place;
	public String birthdate;
	public String updated;
	public String reference;
	public League league;
	public Team team;
	public Draft draft;
	public List<Season> season;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abbr_name == null) ? 0 : abbr_name.hashCode());
		result = prime * result + ((birth_place == null) ? 0 : birth_place.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((draft == null) ? 0 : draft.hashCode());
		result = prime * result + ((experience == null) ? 0 : experience.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jersey_number == null) ? 0 : jersey_number.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((league == null) ? 0 : league.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((primary_position == null) ? 0 : primary_position.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		final PlayerProfile other = (PlayerProfile) obj;
		if (abbr_name == null) {
			if (other.abbr_name != null)
				return false;
		} else if (!abbr_name.equals(other.abbr_name))
			return false;
		if (birth_place == null) {
			if (other.birth_place != null)
				return false;
		} else if (!birth_place.equals(other.birth_place))
			return false;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (draft == null) {
			if (other.draft != null)
				return false;
		} else if (!draft.equals(other.draft))
			return false;
		if (experience == null) {
			if (other.experience != null)
				return false;
		} else if (!experience.equals(other.experience))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (full_name == null) {
			if (other.full_name != null)
				return false;
		} else if (!full_name.equals(other.full_name))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jersey_number == null) {
			if (other.jersey_number != null)
				return false;
		} else if (!jersey_number.equals(other.jersey_number))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (league == null) {
			if (other.league != null)
				return false;
		} else if (!league.equals(other.league))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (primary_position == null) {
			if (other.primary_position != null)
				return false;
		} else if (!primary_position.equals(other.primary_position))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PlayerProfile [id=" + id + ", status=" + status + ", full_name=" + full_name + ", first_name="
				+ first_name + ", last_name=" + last_name + ", abbr_name=" + abbr_name + ", height=" + height
				+ ", weight=" + weight + ", position=" + position + ", primary_position=" + primary_position
				+ ", jersey_number=" + jersey_number + ", experience=" + experience + ", birth_place=" + birth_place
				+ ", birthdate=" + birthdate + ", updated=" + updated + ", reference=" + reference + ", league="
				+ league + ", team=" + team + ", draft=" + draft + ", season=" + season + "]";
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Total{
		public double games_played;
		public double games_started;
		public double minutes;
		public double field_goals_made;
		public double field_goals_att;
		public double field_goals_pct;
		public double two_points_made;
		public double two_points_att;
		public double two_points_pct;
		public double three_points_made;
		public double three_points_att;
		public double three_points_pct;
		public double blocked_att;
		public double free_throws_made;
		public double free_throws_att;
		public double free_throws_pct;
		public double offensive_rebounds;
		public double defensive_rebounds;
		public double rebounds;
		public double assists;
		public double turnovers;
		public double assists_turnover_ratio;
		public double steals;
		public double blocks;
		public double personal_fouls;
		public double tech_fouls;
		public double points;
		public double flagrant_fouls;
		public double ejections;
		public double foulouts;
		public double true_shooting_att;
		public double true_shooting_pct;
		public double efficiency;
		public double points_off_turnovers;
		public double points_in_paint;
		public double points_in_paint_made;
		public double points_in_paint_att;
		public double points_in_paint_pct;
		public double effective_fg_pct;
		public double double_doubles;
		public double triple_doubles;
		public double fouls_drawn;
		public double offensive_fouls;
		public double fast_break_pts;
		public double fast_break_att;
		public double fast_break_made;
		public double fast_break_pct;
		public double coach_ejections;
		public double second_chance_pct;
		public double second_chance_pts;
		public double second_chance_att;
		public double second_chance_made;
		public double minus;
		public double plus;
		public double coach_tech_fouls;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(assists);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(assists_turnover_ratio);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(blocked_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(blocks);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(coach_ejections);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(coach_tech_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(defensive_rebounds);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(double_doubles);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(effective_fg_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(efficiency);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(ejections);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_pts);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(field_goals_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(field_goals_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(field_goals_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(flagrant_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(foulouts);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fouls_drawn);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(free_throws_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(free_throws_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(free_throws_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(games_played);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(games_started);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(minus);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(minutes);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(offensive_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(offensive_rebounds);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(personal_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(plus);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_off_turnovers);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(rebounds);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_pts);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(steals);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(tech_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(three_points_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(three_points_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(three_points_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(triple_doubles);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(true_shooting_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(true_shooting_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(turnovers);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(two_points_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(two_points_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(two_points_pct);
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
			final Total other = (Total) obj;
			if (Double.doubleToLongBits(assists) != Double.doubleToLongBits(other.assists))
				return false;
			if (Double.doubleToLongBits(assists_turnover_ratio) != Double
					.doubleToLongBits(other.assists_turnover_ratio))
				return false;
			if (Double.doubleToLongBits(blocked_att) != Double.doubleToLongBits(other.blocked_att))
				return false;
			if (Double.doubleToLongBits(blocks) != Double.doubleToLongBits(other.blocks))
				return false;
			if (Double.doubleToLongBits(coach_ejections) != Double.doubleToLongBits(other.coach_ejections))
				return false;
			if (Double.doubleToLongBits(coach_tech_fouls) != Double.doubleToLongBits(other.coach_tech_fouls))
				return false;
			if (Double.doubleToLongBits(defensive_rebounds) != Double.doubleToLongBits(other.defensive_rebounds))
				return false;
			if (Double.doubleToLongBits(double_doubles) != Double.doubleToLongBits(other.double_doubles))
				return false;
			if (Double.doubleToLongBits(effective_fg_pct) != Double.doubleToLongBits(other.effective_fg_pct))
				return false;
			if (Double.doubleToLongBits(efficiency) != Double.doubleToLongBits(other.efficiency))
				return false;
			if (Double.doubleToLongBits(ejections) != Double.doubleToLongBits(other.ejections))
				return false;
			if (Double.doubleToLongBits(fast_break_att) != Double.doubleToLongBits(other.fast_break_att))
				return false;
			if (Double.doubleToLongBits(fast_break_made) != Double.doubleToLongBits(other.fast_break_made))
				return false;
			if (Double.doubleToLongBits(fast_break_pct) != Double.doubleToLongBits(other.fast_break_pct))
				return false;
			if (Double.doubleToLongBits(fast_break_pts) != Double.doubleToLongBits(other.fast_break_pts))
				return false;
			if (Double.doubleToLongBits(field_goals_att) != Double.doubleToLongBits(other.field_goals_att))
				return false;
			if (Double.doubleToLongBits(field_goals_made) != Double.doubleToLongBits(other.field_goals_made))
				return false;
			if (Double.doubleToLongBits(field_goals_pct) != Double.doubleToLongBits(other.field_goals_pct))
				return false;
			if (Double.doubleToLongBits(flagrant_fouls) != Double.doubleToLongBits(other.flagrant_fouls))
				return false;
			if (Double.doubleToLongBits(foulouts) != Double.doubleToLongBits(other.foulouts))
				return false;
			if (Double.doubleToLongBits(fouls_drawn) != Double.doubleToLongBits(other.fouls_drawn))
				return false;
			if (Double.doubleToLongBits(free_throws_att) != Double.doubleToLongBits(other.free_throws_att))
				return false;
			if (Double.doubleToLongBits(free_throws_made) != Double.doubleToLongBits(other.free_throws_made))
				return false;
			if (Double.doubleToLongBits(free_throws_pct) != Double.doubleToLongBits(other.free_throws_pct))
				return false;
			if (Double.doubleToLongBits(games_played) != Double.doubleToLongBits(other.games_played))
				return false;
			if (Double.doubleToLongBits(games_started) != Double.doubleToLongBits(other.games_started))
				return false;
			if (Double.doubleToLongBits(minus) != Double.doubleToLongBits(other.minus))
				return false;
			if (Double.doubleToLongBits(minutes) != Double.doubleToLongBits(other.minutes))
				return false;
			if (Double.doubleToLongBits(offensive_fouls) != Double.doubleToLongBits(other.offensive_fouls))
				return false;
			if (Double.doubleToLongBits(offensive_rebounds) != Double.doubleToLongBits(other.offensive_rebounds))
				return false;
			if (Double.doubleToLongBits(personal_fouls) != Double.doubleToLongBits(other.personal_fouls))
				return false;
			if (Double.doubleToLongBits(plus) != Double.doubleToLongBits(other.plus))
				return false;
			if (Double.doubleToLongBits(points) != Double.doubleToLongBits(other.points))
				return false;
			if (Double.doubleToLongBits(points_in_paint) != Double.doubleToLongBits(other.points_in_paint))
				return false;
			if (Double.doubleToLongBits(points_in_paint_att) != Double.doubleToLongBits(other.points_in_paint_att))
				return false;
			if (Double.doubleToLongBits(points_in_paint_made) != Double.doubleToLongBits(other.points_in_paint_made))
				return false;
			if (Double.doubleToLongBits(points_in_paint_pct) != Double.doubleToLongBits(other.points_in_paint_pct))
				return false;
			if (Double.doubleToLongBits(points_off_turnovers) != Double.doubleToLongBits(other.points_off_turnovers))
				return false;
			if (Double.doubleToLongBits(rebounds) != Double.doubleToLongBits(other.rebounds))
				return false;
			if (Double.doubleToLongBits(second_chance_att) != Double.doubleToLongBits(other.second_chance_att))
				return false;
			if (Double.doubleToLongBits(second_chance_made) != Double.doubleToLongBits(other.second_chance_made))
				return false;
			if (Double.doubleToLongBits(second_chance_pct) != Double.doubleToLongBits(other.second_chance_pct))
				return false;
			if (Double.doubleToLongBits(second_chance_pts) != Double.doubleToLongBits(other.second_chance_pts))
				return false;
			if (Double.doubleToLongBits(steals) != Double.doubleToLongBits(other.steals))
				return false;
			if (Double.doubleToLongBits(tech_fouls) != Double.doubleToLongBits(other.tech_fouls))
				return false;
			if (Double.doubleToLongBits(three_points_att) != Double.doubleToLongBits(other.three_points_att))
				return false;
			if (Double.doubleToLongBits(three_points_made) != Double.doubleToLongBits(other.three_points_made))
				return false;
			if (Double.doubleToLongBits(three_points_pct) != Double.doubleToLongBits(other.three_points_pct))
				return false;
			if (Double.doubleToLongBits(triple_doubles) != Double.doubleToLongBits(other.triple_doubles))
				return false;
			if (Double.doubleToLongBits(true_shooting_att) != Double.doubleToLongBits(other.true_shooting_att))
				return false;
			if (Double.doubleToLongBits(true_shooting_pct) != Double.doubleToLongBits(other.true_shooting_pct))
				return false;
			if (Double.doubleToLongBits(turnovers) != Double.doubleToLongBits(other.turnovers))
				return false;
			if (Double.doubleToLongBits(two_points_att) != Double.doubleToLongBits(other.two_points_att))
				return false;
			if (Double.doubleToLongBits(two_points_made) != Double.doubleToLongBits(other.two_points_made))
				return false;
			if (Double.doubleToLongBits(two_points_pct) != Double.doubleToLongBits(other.two_points_pct))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Total [games_played=" + games_played + ", games_started=" + games_started + ", minutes=" + minutes
					+ ", field_goals_made=" + field_goals_made + ", field_goals_att=" + field_goals_att
					+ ", field_goals_pct=" + field_goals_pct + ", two_points_made=" + two_points_made
					+ ", two_points_att=" + two_points_att + ", two_points_pct=" + two_points_pct
					+ ", three_points_made=" + three_points_made + ", three_points_att=" + three_points_att
					+ ", three_points_pct=" + three_points_pct + ", blocked_att=" + blocked_att + ", free_throws_made="
					+ free_throws_made + ", free_throws_att=" + free_throws_att + ", free_throws_pct=" + free_throws_pct
					+ ", offensive_rebounds=" + offensive_rebounds + ", defensive_rebounds=" + defensive_rebounds
					+ ", rebounds=" + rebounds + ", assists=" + assists + ", turnovers=" + turnovers
					+ ", assists_turnover_ratio=" + assists_turnover_ratio + ", steals=" + steals + ", blocks=" + blocks
					+ ", personal_fouls=" + personal_fouls + ", tech_fouls=" + tech_fouls + ", points=" + points
					+ ", flagrant_fouls=" + flagrant_fouls + ", ejections=" + ejections + ", foulouts=" + foulouts
					+ ", true_shooting_att=" + true_shooting_att + ", true_shooting_pct=" + true_shooting_pct
					+ ", efficiency=" + efficiency + ", points_off_turnovers=" + points_off_turnovers
					+ ", points_in_paint=" + points_in_paint + ", points_in_paint_made=" + points_in_paint_made
					+ ", points_in_paint_att=" + points_in_paint_att + ", points_in_paint_pct=" + points_in_paint_pct
					+ ", effective_fg_pct=" + effective_fg_pct + ", double_doubles=" + double_doubles
					+ ", triple_doubles=" + triple_doubles + ", fouls_drawn=" + fouls_drawn + ", offensive_fouls="
					+ offensive_fouls + ", fast_break_pts=" + fast_break_pts + ", fast_break_att=" + fast_break_att
					+ ", fast_break_made=" + fast_break_made + ", fast_break_pct=" + fast_break_pct
					+ ", coach_ejections=" + coach_ejections + ", second_chance_pct=" + second_chance_pct
					+ ", second_chance_pts=" + second_chance_pts + ", second_chance_att=" + second_chance_att
					+ ", second_chance_made=" + second_chance_made + ", minus=" + minus + ", plus=" + plus
					+ ", coach_tech_fouls=" + coach_tech_fouls + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Average{
		public double minutes;
		public double points;
		public double off_rebounds;
		public double def_rebounds;
		public double rebounds;
		public double assists;
		public double steals;
		public double blocks;
		public double turnovers;
		public double personal_fouls;
		public double flagrant_fouls;
		public double blocked_att;
		public double field_goals_made;
		public double field_goals_att;
		public double three_points_made;
		public double three_points_att;
		public double free_throws_made;
		public double free_throws_att;
		public double two_points_made;
		public double two_points_att;
		public double efficiency;
		public double true_shooting_att;
		public double points_off_turnovers;
		public double points_in_paint_made;
		public double points_in_paint_att;
		public double points_in_paint;
		public double fouls_drawn;
		public double offensive_fouls;
		public double fast_break_pts;
		public double fast_break_att;
		public double fast_break_made;
		public double second_chance_pts;
		public double second_chance_att;
		public double second_chance_made;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(assists);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(blocked_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(blocks);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(def_rebounds);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(efficiency);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fast_break_pts);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(field_goals_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(field_goals_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(flagrant_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fouls_drawn);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(free_throws_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(free_throws_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(minutes);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(off_rebounds);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(offensive_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(personal_fouls);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_in_paint_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(points_off_turnovers);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(rebounds);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(second_chance_pts);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(steals);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(three_points_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(three_points_made);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(true_shooting_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(turnovers);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(two_points_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(two_points_made);
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
			final Average other = (Average) obj;
			if (Double.doubleToLongBits(assists) != Double.doubleToLongBits(other.assists))
				return false;
			if (Double.doubleToLongBits(blocked_att) != Double.doubleToLongBits(other.blocked_att))
				return false;
			if (Double.doubleToLongBits(blocks) != Double.doubleToLongBits(other.blocks))
				return false;
			if (Double.doubleToLongBits(def_rebounds) != Double.doubleToLongBits(other.def_rebounds))
				return false;
			if (Double.doubleToLongBits(efficiency) != Double.doubleToLongBits(other.efficiency))
				return false;
			if (Double.doubleToLongBits(fast_break_att) != Double.doubleToLongBits(other.fast_break_att))
				return false;
			if (Double.doubleToLongBits(fast_break_made) != Double.doubleToLongBits(other.fast_break_made))
				return false;
			if (Double.doubleToLongBits(fast_break_pts) != Double.doubleToLongBits(other.fast_break_pts))
				return false;
			if (Double.doubleToLongBits(field_goals_att) != Double.doubleToLongBits(other.field_goals_att))
				return false;
			if (Double.doubleToLongBits(field_goals_made) != Double.doubleToLongBits(other.field_goals_made))
				return false;
			if (Double.doubleToLongBits(flagrant_fouls) != Double.doubleToLongBits(other.flagrant_fouls))
				return false;
			if (Double.doubleToLongBits(fouls_drawn) != Double.doubleToLongBits(other.fouls_drawn))
				return false;
			if (Double.doubleToLongBits(free_throws_att) != Double.doubleToLongBits(other.free_throws_att))
				return false;
			if (Double.doubleToLongBits(free_throws_made) != Double.doubleToLongBits(other.free_throws_made))
				return false;
			if (Double.doubleToLongBits(minutes) != Double.doubleToLongBits(other.minutes))
				return false;
			if (Double.doubleToLongBits(off_rebounds) != Double.doubleToLongBits(other.off_rebounds))
				return false;
			if (Double.doubleToLongBits(offensive_fouls) != Double.doubleToLongBits(other.offensive_fouls))
				return false;
			if (Double.doubleToLongBits(personal_fouls) != Double.doubleToLongBits(other.personal_fouls))
				return false;
			if (Double.doubleToLongBits(points) != Double.doubleToLongBits(other.points))
				return false;
			if (Double.doubleToLongBits(points_in_paint) != Double.doubleToLongBits(other.points_in_paint))
				return false;
			if (Double.doubleToLongBits(points_in_paint_att) != Double.doubleToLongBits(other.points_in_paint_att))
				return false;
			if (Double.doubleToLongBits(points_in_paint_made) != Double.doubleToLongBits(other.points_in_paint_made))
				return false;
			if (Double.doubleToLongBits(points_off_turnovers) != Double.doubleToLongBits(other.points_off_turnovers))
				return false;
			if (Double.doubleToLongBits(rebounds) != Double.doubleToLongBits(other.rebounds))
				return false;
			if (Double.doubleToLongBits(second_chance_att) != Double.doubleToLongBits(other.second_chance_att))
				return false;
			if (Double.doubleToLongBits(second_chance_made) != Double.doubleToLongBits(other.second_chance_made))
				return false;
			if (Double.doubleToLongBits(second_chance_pts) != Double.doubleToLongBits(other.second_chance_pts))
				return false;
			if (Double.doubleToLongBits(steals) != Double.doubleToLongBits(other.steals))
				return false;
			if (Double.doubleToLongBits(three_points_att) != Double.doubleToLongBits(other.three_points_att))
				return false;
			if (Double.doubleToLongBits(three_points_made) != Double.doubleToLongBits(other.three_points_made))
				return false;
			if (Double.doubleToLongBits(true_shooting_att) != Double.doubleToLongBits(other.true_shooting_att))
				return false;
			if (Double.doubleToLongBits(turnovers) != Double.doubleToLongBits(other.turnovers))
				return false;
			if (Double.doubleToLongBits(two_points_att) != Double.doubleToLongBits(other.two_points_att))
				return false;
			if (Double.doubleToLongBits(two_points_made) != Double.doubleToLongBits(other.two_points_made))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Average [minutes=" + minutes + ", points=" + points + ", off_rebounds=" + off_rebounds
					+ ", def_rebounds=" + def_rebounds + ", rebounds=" + rebounds + ", assists=" + assists + ", steals="
					+ steals + ", blocks=" + blocks + ", turnovers=" + turnovers + ", personal_fouls=" + personal_fouls
					+ ", flagrant_fouls=" + flagrant_fouls + ", blocked_att=" + blocked_att + ", field_goals_made="
					+ field_goals_made + ", field_goals_att=" + field_goals_att + ", three_points_made="
					+ three_points_made + ", three_points_att=" + three_points_att + ", free_throws_made="
					+ free_throws_made + ", free_throws_att=" + free_throws_att + ", two_points_made=" + two_points_made
					+ ", two_points_att=" + two_points_att + ", efficiency=" + efficiency + ", true_shooting_att="
					+ true_shooting_att + ", points_off_turnovers=" + points_off_turnovers + ", points_in_paint_made="
					+ points_in_paint_made + ", points_in_paint_att=" + points_in_paint_att + ", points_in_paint="
					+ points_in_paint + ", fouls_drawn=" + fouls_drawn + ", offensive_fouls=" + offensive_fouls
					+ ", fast_break_pts=" + fast_break_pts + ", fast_break_att=" + fast_break_att + ", fast_break_made="
					+ fast_break_made + ", second_chance_pts=" + second_chance_pts + ", second_chance_att="
					+ second_chance_att + ", second_chance_made=" + second_chance_made + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Season{
		public String id;
		public Integer year;
		public String type;
		public List<Team> teams;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((teams == null) ? 0 : teams.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			result = prime * result + ((year == null) ? 0 : year.hashCode());
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
			final Season other = (Season) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (teams == null) {
				if (other.teams != null)
					return false;
			} else if (!teams.equals(other.teams))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			if (year == null) {
				if (other.year != null)
					return false;
			} else if (!year.equals(other.year))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Season [id=" + id + ", year=" + year + ", type=" + type + ", teams=" + teams + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Team{
		public String id;
		public String name;
		public String market;
		public String alias;
		public String reference;
		public Total total;
		public Average average;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((alias == null) ? 0 : alias.hashCode());
			result = prime * result + ((average == null) ? 0 : average.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
			result = prime * result + ((total == null) ? 0 : total.hashCode());
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
			final Team other = (Team) obj;
			if (alias == null) {
				if (other.alias != null)
					return false;
			} else if (!alias.equals(other.alias))
				return false;
			if (average == null) {
				if (other.average != null)
					return false;
			} else if (!average.equals(other.average))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (market == null) {
				if (other.market != null)
					return false;
			} else if (!market.equals(other.market))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (reference == null) {
				if (other.reference != null)
					return false;
			} else if (!reference.equals(other.reference))
				return false;
			if (total == null) {
				if (other.total != null)
					return false;
			} else if (!total.equals(other.total))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Team [id=" + id + ", name=" + name + ", market=" + market + ", alias=" + alias + ", reference="
					+ reference + ", total=" + total + ", average=" + average + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Draft{
		public String team_id;
		public Integer year;
		public String round;
		public String pick;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((pick == null) ? 0 : pick.hashCode());
			result = prime * result + ((round == null) ? 0 : round.hashCode());
			result = prime * result + ((team_id == null) ? 0 : team_id.hashCode());
			result = prime * result + ((year == null) ? 0 : year.hashCode());
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
			final Draft other = (Draft) obj;
			if (pick == null) {
				if (other.pick != null)
					return false;
			} else if (!pick.equals(other.pick))
				return false;
			if (round == null) {
				if (other.round != null)
					return false;
			} else if (!round.equals(other.round))
				return false;
			if (team_id == null) {
				if (other.team_id != null)
					return false;
			} else if (!team_id.equals(other.team_id))
				return false;
			if (year == null) {
				if (other.year != null)
					return false;
			} else if (!year.equals(other.year))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Draft [team_id=" + team_id + ", year=" + year + ", round=" + round + ", pick=" + pick + "]";
		}
	}
}
