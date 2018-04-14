package com.athena.backend.platform.dto.events;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class NativeStatisticsEvent extends BaseNativeEvent{
	public Payload payload;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		return result;
	}
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		final NativeStatisticsEvent other = (NativeStatisticsEvent) obj;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "NativeStatisticsEvent [payload=" + payload + "]";
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Payload{
		public Game game;
		public Player player;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((game == null) ? 0 : game.hashCode());
			result = prime * result + ((player == null) ? 0 : player.hashCode());
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
			final Payload other = (Payload) obj;
			if (game == null) {
				if (other.game != null)
					return false;
			} else if (!game.equals(other.game))
				return false;
			if (player == null) {
				if (other.player != null)
					return false;
			} else if (!player.equals(other.player))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Payload [game=" + game + ", player=" + player + "]";
		}
	}
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Player{
		public String id;
		public String full_name;
		public String first_name;
		public String last_name;
		public String position;
		public String primary_position;
		public String jersey_number;
		public String reference;
		public PlayerStats statistics;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
			result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((jersey_number == null) ? 0 : jersey_number.hashCode());
			result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
			result = prime * result + ((position == null) ? 0 : position.hashCode());
			result = prime * result + ((primary_position == null) ? 0 : primary_position.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
			result = prime * result + ((statistics == null) ? 0 : statistics.hashCode());
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
			final Player other = (Player) obj;
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
			if (statistics == null) {
				if (other.statistics != null)
					return false;
			} else if (!statistics.equals(other.statistics))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Player [id=" + id + ", full_name=" + full_name + ", first_name=" + first_name + ", last_name="
					+ last_name + ", position=" + position + ", primary_position=" + primary_position
					+ ", jersey_number=" + jersey_number + ", reference=" + reference + ", statistics=" + statistics
					+ "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class PlayerStats{
		public String minutes;
		public Integer field_goals_made;
		public Integer field_goals_att;
		public Double field_goals_pct;
		public Integer effective_fg_pct;
		public Integer three_points_made;
		public Integer three_points_att;
		public Double three_points_pct;
		public Integer two_points_made;
		public Integer two_points_att;
		public Double two_points_pct;
		public Integer blocked_att;
		public Integer free_throws_made;
		public Integer free_throws_att;
		public Double free_throws_pct;
		public Integer offensive_rebounds;
		public Integer defensive_rebounds;
		public Integer rebounds;
		public Integer assists;
		public Integer turnovers;
		public Integer steals;
		public Integer blocks;
		public Integer assists_turnover_ratio;
		public Integer fouls_drawn;
		public Integer personal_fouls;
		public Integer offensive_fouls;
		public Integer tech_fouls;
		public Integer flagrant_fouls;
		public Integer pls_min;
		public Integer points;
		public Integer points_off_turnovers;
		public Integer points_in_paint;
		public Integer points_in_paint_att;
		public Integer points_in_paint_made;
		public Double points_in_paint_pct;
		public Boolean double_double;
		public Boolean triple_double;
		public Integer efficiency;
		public Double efficiency_game_score;
		public Double true_shooting_att;
		public Integer true_shooting_pct;
		public Integer second_chance_pts;
		public Integer fast_break_pts;
		public Integer fast_break_att;
		public Integer fast_break_made;
		public Double fast_break_pct;
		public Integer second_chance_att;
		public Integer second_chance_made;
		public Double second_chance_pct;
		public Integer minus;
		public Integer plus;
		public Double defensive_rebounds_pct;
		public Double offensive_rebounds_pct;
		public Double rebounds_pct;
		public Double steals_pct;
		public Double turnovers_pct;
		public Integer coach_tech_fouls;
		public Integer coach_ejections;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((assists == null) ? 0 : assists.hashCode());
			result = prime * result + ((assists_turnover_ratio == null) ? 0 : assists_turnover_ratio.hashCode());
			result = prime * result + ((blocked_att == null) ? 0 : blocked_att.hashCode());
			result = prime * result + ((blocks == null) ? 0 : blocks.hashCode());
			result = prime * result + ((coach_ejections == null) ? 0 : coach_ejections.hashCode());
			result = prime * result + ((coach_tech_fouls == null) ? 0 : coach_tech_fouls.hashCode());
			result = prime * result + ((defensive_rebounds == null) ? 0 : defensive_rebounds.hashCode());
			result = prime * result + ((defensive_rebounds_pct == null) ? 0 : defensive_rebounds_pct.hashCode());
			result = prime * result + ((double_double == null) ? 0 : double_double.hashCode());
			result = prime * result + ((effective_fg_pct == null) ? 0 : effective_fg_pct.hashCode());
			result = prime * result + ((efficiency == null) ? 0 : efficiency.hashCode());
			result = prime * result + ((efficiency_game_score == null) ? 0 : efficiency_game_score.hashCode());
			result = prime * result + ((fast_break_att == null) ? 0 : fast_break_att.hashCode());
			result = prime * result + ((fast_break_made == null) ? 0 : fast_break_made.hashCode());
			result = prime * result + ((fast_break_pct == null) ? 0 : fast_break_pct.hashCode());
			result = prime * result + ((fast_break_pts == null) ? 0 : fast_break_pts.hashCode());
			result = prime * result + ((field_goals_att == null) ? 0 : field_goals_att.hashCode());
			result = prime * result + ((field_goals_made == null) ? 0 : field_goals_made.hashCode());
			result = prime * result + ((field_goals_pct == null) ? 0 : field_goals_pct.hashCode());
			result = prime * result + ((flagrant_fouls == null) ? 0 : flagrant_fouls.hashCode());
			result = prime * result + ((fouls_drawn == null) ? 0 : fouls_drawn.hashCode());
			result = prime * result + ((free_throws_att == null) ? 0 : free_throws_att.hashCode());
			result = prime * result + ((free_throws_made == null) ? 0 : free_throws_made.hashCode());
			result = prime * result + ((free_throws_pct == null) ? 0 : free_throws_pct.hashCode());
			result = prime * result + ((minus == null) ? 0 : minus.hashCode());
			result = prime * result + ((minutes == null) ? 0 : minutes.hashCode());
			result = prime * result + ((offensive_fouls == null) ? 0 : offensive_fouls.hashCode());
			result = prime * result + ((offensive_rebounds == null) ? 0 : offensive_rebounds.hashCode());
			result = prime * result + ((offensive_rebounds_pct == null) ? 0 : offensive_rebounds_pct.hashCode());
			result = prime * result + ((personal_fouls == null) ? 0 : personal_fouls.hashCode());
			result = prime * result + ((pls_min == null) ? 0 : pls_min.hashCode());
			result = prime * result + ((plus == null) ? 0 : plus.hashCode());
			result = prime * result + ((points == null) ? 0 : points.hashCode());
			result = prime * result + ((points_in_paint == null) ? 0 : points_in_paint.hashCode());
			result = prime * result + ((points_in_paint_att == null) ? 0 : points_in_paint_att.hashCode());
			result = prime * result + ((points_in_paint_made == null) ? 0 : points_in_paint_made.hashCode());
			result = prime * result + ((points_in_paint_pct == null) ? 0 : points_in_paint_pct.hashCode());
			result = prime * result + ((points_off_turnovers == null) ? 0 : points_off_turnovers.hashCode());
			result = prime * result + ((rebounds == null) ? 0 : rebounds.hashCode());
			result = prime * result + ((rebounds_pct == null) ? 0 : rebounds_pct.hashCode());
			result = prime * result + ((second_chance_att == null) ? 0 : second_chance_att.hashCode());
			result = prime * result + ((second_chance_made == null) ? 0 : second_chance_made.hashCode());
			result = prime * result + ((second_chance_pct == null) ? 0 : second_chance_pct.hashCode());
			result = prime * result + ((second_chance_pts == null) ? 0 : second_chance_pts.hashCode());
			result = prime * result + ((steals == null) ? 0 : steals.hashCode());
			result = prime * result + ((steals_pct == null) ? 0 : steals_pct.hashCode());
			result = prime * result + ((tech_fouls == null) ? 0 : tech_fouls.hashCode());
			result = prime * result + ((three_points_att == null) ? 0 : three_points_att.hashCode());
			result = prime * result + ((three_points_made == null) ? 0 : three_points_made.hashCode());
			result = prime * result + ((three_points_pct == null) ? 0 : three_points_pct.hashCode());
			result = prime * result + ((triple_double == null) ? 0 : triple_double.hashCode());
			result = prime * result + ((true_shooting_att == null) ? 0 : true_shooting_att.hashCode());
			result = prime * result + ((true_shooting_pct == null) ? 0 : true_shooting_pct.hashCode());
			result = prime * result + ((turnovers == null) ? 0 : turnovers.hashCode());
			result = prime * result + ((turnovers_pct == null) ? 0 : turnovers_pct.hashCode());
			result = prime * result + ((two_points_att == null) ? 0 : two_points_att.hashCode());
			result = prime * result + ((two_points_made == null) ? 0 : two_points_made.hashCode());
			result = prime * result + ((two_points_pct == null) ? 0 : two_points_pct.hashCode());
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
			final PlayerStats other = (PlayerStats) obj;
			if (assists == null) {
				if (other.assists != null)
					return false;
			} else if (!assists.equals(other.assists))
				return false;
			if (assists_turnover_ratio == null) {
				if (other.assists_turnover_ratio != null)
					return false;
			} else if (!assists_turnover_ratio.equals(other.assists_turnover_ratio))
				return false;
			if (blocked_att == null) {
				if (other.blocked_att != null)
					return false;
			} else if (!blocked_att.equals(other.blocked_att))
				return false;
			if (blocks == null) {
				if (other.blocks != null)
					return false;
			} else if (!blocks.equals(other.blocks))
				return false;
			if (coach_ejections == null) {
				if (other.coach_ejections != null)
					return false;
			} else if (!coach_ejections.equals(other.coach_ejections))
				return false;
			if (coach_tech_fouls == null) {
				if (other.coach_tech_fouls != null)
					return false;
			} else if (!coach_tech_fouls.equals(other.coach_tech_fouls))
				return false;
			if (defensive_rebounds == null) {
				if (other.defensive_rebounds != null)
					return false;
			} else if (!defensive_rebounds.equals(other.defensive_rebounds))
				return false;
			if (defensive_rebounds_pct == null) {
				if (other.defensive_rebounds_pct != null)
					return false;
			} else if (!defensive_rebounds_pct.equals(other.defensive_rebounds_pct))
				return false;
			if (double_double == null) {
				if (other.double_double != null)
					return false;
			} else if (!double_double.equals(other.double_double))
				return false;
			if (effective_fg_pct == null) {
				if (other.effective_fg_pct != null)
					return false;
			} else if (!effective_fg_pct.equals(other.effective_fg_pct))
				return false;
			if (efficiency == null) {
				if (other.efficiency != null)
					return false;
			} else if (!efficiency.equals(other.efficiency))
				return false;
			if (efficiency_game_score == null) {
				if (other.efficiency_game_score != null)
					return false;
			} else if (!efficiency_game_score.equals(other.efficiency_game_score))
				return false;
			if (fast_break_att == null) {
				if (other.fast_break_att != null)
					return false;
			} else if (!fast_break_att.equals(other.fast_break_att))
				return false;
			if (fast_break_made == null) {
				if (other.fast_break_made != null)
					return false;
			} else if (!fast_break_made.equals(other.fast_break_made))
				return false;
			if (fast_break_pct == null) {
				if (other.fast_break_pct != null)
					return false;
			} else if (!fast_break_pct.equals(other.fast_break_pct))
				return false;
			if (fast_break_pts == null) {
				if (other.fast_break_pts != null)
					return false;
			} else if (!fast_break_pts.equals(other.fast_break_pts))
				return false;
			if (field_goals_att == null) {
				if (other.field_goals_att != null)
					return false;
			} else if (!field_goals_att.equals(other.field_goals_att))
				return false;
			if (field_goals_made == null) {
				if (other.field_goals_made != null)
					return false;
			} else if (!field_goals_made.equals(other.field_goals_made))
				return false;
			if (field_goals_pct == null) {
				if (other.field_goals_pct != null)
					return false;
			} else if (!field_goals_pct.equals(other.field_goals_pct))
				return false;
			if (flagrant_fouls == null) {
				if (other.flagrant_fouls != null)
					return false;
			} else if (!flagrant_fouls.equals(other.flagrant_fouls))
				return false;
			if (fouls_drawn == null) {
				if (other.fouls_drawn != null)
					return false;
			} else if (!fouls_drawn.equals(other.fouls_drawn))
				return false;
			if (free_throws_att == null) {
				if (other.free_throws_att != null)
					return false;
			} else if (!free_throws_att.equals(other.free_throws_att))
				return false;
			if (free_throws_made == null) {
				if (other.free_throws_made != null)
					return false;
			} else if (!free_throws_made.equals(other.free_throws_made))
				return false;
			if (free_throws_pct == null) {
				if (other.free_throws_pct != null)
					return false;
			} else if (!free_throws_pct.equals(other.free_throws_pct))
				return false;
			if (minus == null) {
				if (other.minus != null)
					return false;
			} else if (!minus.equals(other.minus))
				return false;
			if (minutes == null) {
				if (other.minutes != null)
					return false;
			} else if (!minutes.equals(other.minutes))
				return false;
			if (offensive_fouls == null) {
				if (other.offensive_fouls != null)
					return false;
			} else if (!offensive_fouls.equals(other.offensive_fouls))
				return false;
			if (offensive_rebounds == null) {
				if (other.offensive_rebounds != null)
					return false;
			} else if (!offensive_rebounds.equals(other.offensive_rebounds))
				return false;
			if (offensive_rebounds_pct == null) {
				if (other.offensive_rebounds_pct != null)
					return false;
			} else if (!offensive_rebounds_pct.equals(other.offensive_rebounds_pct))
				return false;
			if (personal_fouls == null) {
				if (other.personal_fouls != null)
					return false;
			} else if (!personal_fouls.equals(other.personal_fouls))
				return false;
			if (pls_min == null) {
				if (other.pls_min != null)
					return false;
			} else if (!pls_min.equals(other.pls_min))
				return false;
			if (plus == null) {
				if (other.plus != null)
					return false;
			} else if (!plus.equals(other.plus))
				return false;
			if (points == null) {
				if (other.points != null)
					return false;
			} else if (!points.equals(other.points))
				return false;
			if (points_in_paint == null) {
				if (other.points_in_paint != null)
					return false;
			} else if (!points_in_paint.equals(other.points_in_paint))
				return false;
			if (points_in_paint_att == null) {
				if (other.points_in_paint_att != null)
					return false;
			} else if (!points_in_paint_att.equals(other.points_in_paint_att))
				return false;
			if (points_in_paint_made == null) {
				if (other.points_in_paint_made != null)
					return false;
			} else if (!points_in_paint_made.equals(other.points_in_paint_made))
				return false;
			if (points_in_paint_pct == null) {
				if (other.points_in_paint_pct != null)
					return false;
			} else if (!points_in_paint_pct.equals(other.points_in_paint_pct))
				return false;
			if (points_off_turnovers == null) {
				if (other.points_off_turnovers != null)
					return false;
			} else if (!points_off_turnovers.equals(other.points_off_turnovers))
				return false;
			if (rebounds == null) {
				if (other.rebounds != null)
					return false;
			} else if (!rebounds.equals(other.rebounds))
				return false;
			if (rebounds_pct == null) {
				if (other.rebounds_pct != null)
					return false;
			} else if (!rebounds_pct.equals(other.rebounds_pct))
				return false;
			if (second_chance_att == null) {
				if (other.second_chance_att != null)
					return false;
			} else if (!second_chance_att.equals(other.second_chance_att))
				return false;
			if (second_chance_made == null) {
				if (other.second_chance_made != null)
					return false;
			} else if (!second_chance_made.equals(other.second_chance_made))
				return false;
			if (second_chance_pct == null) {
				if (other.second_chance_pct != null)
					return false;
			} else if (!second_chance_pct.equals(other.second_chance_pct))
				return false;
			if (second_chance_pts == null) {
				if (other.second_chance_pts != null)
					return false;
			} else if (!second_chance_pts.equals(other.second_chance_pts))
				return false;
			if (steals == null) {
				if (other.steals != null)
					return false;
			} else if (!steals.equals(other.steals))
				return false;
			if (steals_pct == null) {
				if (other.steals_pct != null)
					return false;
			} else if (!steals_pct.equals(other.steals_pct))
				return false;
			if (tech_fouls == null) {
				if (other.tech_fouls != null)
					return false;
			} else if (!tech_fouls.equals(other.tech_fouls))
				return false;
			if (three_points_att == null) {
				if (other.three_points_att != null)
					return false;
			} else if (!three_points_att.equals(other.three_points_att))
				return false;
			if (three_points_made == null) {
				if (other.three_points_made != null)
					return false;
			} else if (!three_points_made.equals(other.three_points_made))
				return false;
			if (three_points_pct == null) {
				if (other.three_points_pct != null)
					return false;
			} else if (!three_points_pct.equals(other.three_points_pct))
				return false;
			if (triple_double == null) {
				if (other.triple_double != null)
					return false;
			} else if (!triple_double.equals(other.triple_double))
				return false;
			if (true_shooting_att == null) {
				if (other.true_shooting_att != null)
					return false;
			} else if (!true_shooting_att.equals(other.true_shooting_att))
				return false;
			if (true_shooting_pct == null) {
				if (other.true_shooting_pct != null)
					return false;
			} else if (!true_shooting_pct.equals(other.true_shooting_pct))
				return false;
			if (turnovers == null) {
				if (other.turnovers != null)
					return false;
			} else if (!turnovers.equals(other.turnovers))
				return false;
			if (turnovers_pct == null) {
				if (other.turnovers_pct != null)
					return false;
			} else if (!turnovers_pct.equals(other.turnovers_pct))
				return false;
			if (two_points_att == null) {
				if (other.two_points_att != null)
					return false;
			} else if (!two_points_att.equals(other.two_points_att))
				return false;
			if (two_points_made == null) {
				if (other.two_points_made != null)
					return false;
			} else if (!two_points_made.equals(other.two_points_made))
				return false;
			if (two_points_pct == null) {
				if (other.two_points_pct != null)
					return false;
			} else if (!two_points_pct.equals(other.two_points_pct))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "PlayerStats [minutes=" + minutes + ", field_goals_made=" + field_goals_made + ", field_goals_att="
					+ field_goals_att + ", field_goals_pct=" + field_goals_pct + ", effective_fg_pct="
					+ effective_fg_pct + ", three_points_made=" + three_points_made + ", three_points_att="
					+ three_points_att + ", three_points_pct=" + three_points_pct + ", two_points_made="
					+ two_points_made + ", two_points_att=" + two_points_att + ", two_points_pct=" + two_points_pct
					+ ", blocked_att=" + blocked_att + ", free_throws_made=" + free_throws_made + ", free_throws_att="
					+ free_throws_att + ", free_throws_pct=" + free_throws_pct + ", offensive_rebounds="
					+ offensive_rebounds + ", defensive_rebounds=" + defensive_rebounds + ", rebounds=" + rebounds
					+ ", assists=" + assists + ", turnovers=" + turnovers + ", steals=" + steals + ", blocks=" + blocks
					+ ", assists_turnover_ratio=" + assists_turnover_ratio + ", fouls_drawn=" + fouls_drawn
					+ ", personal_fouls=" + personal_fouls + ", offensive_fouls=" + offensive_fouls + ", tech_fouls="
					+ tech_fouls + ", flagrant_fouls=" + flagrant_fouls + ", pls_min=" + pls_min + ", points=" + points
					+ ", points_off_turnovers=" + points_off_turnovers + ", points_in_paint=" + points_in_paint
					+ ", points_in_paint_att=" + points_in_paint_att + ", points_in_paint_made=" + points_in_paint_made
					+ ", points_in_paint_pct=" + points_in_paint_pct + ", double_double=" + double_double
					+ ", triple_double=" + triple_double + ", efficiency=" + efficiency + ", efficiency_game_score="
					+ efficiency_game_score + ", true_shooting_att=" + true_shooting_att + ", true_shooting_pct="
					+ true_shooting_pct + ", second_chance_pts=" + second_chance_pts + ", fast_break_pts="
					+ fast_break_pts + ", fast_break_att=" + fast_break_att + ", fast_break_made=" + fast_break_made
					+ ", fast_break_pct=" + fast_break_pct + ", second_chance_att=" + second_chance_att
					+ ", second_chance_made=" + second_chance_made + ", second_chance_pct=" + second_chance_pct
					+ ", minus=" + minus + ", plus=" + plus + ", defensive_rebounds_pct=" + defensive_rebounds_pct
					+ ", offensive_rebounds_pct=" + offensive_rebounds_pct + ", rebounds_pct=" + rebounds_pct
					+ ", steals_pct=" + steals_pct + ", turnovers_pct=" + turnovers_pct + ", coach_tech_fouls="
					+ coach_tech_fouls + ", coach_ejections=" + coach_ejections + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Game{
		public String id;
		public String status;
		public String coverage;
		public String reference;
		public String scheduled;
		public Team home;
		public Team away;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((away == null) ? 0 : away.hashCode());
			result = prime * result + ((coverage == null) ? 0 : coverage.hashCode());
			result = prime * result + ((home == null) ? 0 : home.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
			result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
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
			final Game other = (Game) obj;
			if (away == null) {
				if (other.away != null)
					return false;
			} else if (!away.equals(other.away))
				return false;
			if (coverage == null) {
				if (other.coverage != null)
					return false;
			} else if (!coverage.equals(other.coverage))
				return false;
			if (home == null) {
				if (other.home != null)
					return false;
			} else if (!home.equals(other.home))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (reference == null) {
				if (other.reference != null)
					return false;
			} else if (!reference.equals(other.reference))
				return false;
			if (scheduled == null) {
				if (other.scheduled != null)
					return false;
			} else if (!scheduled.equals(other.scheduled))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Game [id=" + id + ", status=" + status + ", coverage=" + coverage + ", reference=" + reference
					+ ", scheduled=" + scheduled + ", home=" + home + ", away=" + away + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Team{
		public String id;
		public String name;
		public String market;
		public String reference;
		public Integer points;
		public Boolean bonus;
		public Integer remaining_timeouts;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((points == null) ? 0 : points.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
			result = prime * result + ((remaining_timeouts == null) ? 0 : remaining_timeouts.hashCode());
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
			if (bonus == null) {
				if (other.bonus != null)
					return false;
			} else if (!bonus.equals(other.bonus))
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
			if (points == null) {
				if (other.points != null)
					return false;
			} else if (!points.equals(other.points))
				return false;
			if (reference == null) {
				if (other.reference != null)
					return false;
			} else if (!reference.equals(other.reference))
				return false;
			if (remaining_timeouts == null) {
				if (other.remaining_timeouts != null)
					return false;
			} else if (!remaining_timeouts.equals(other.remaining_timeouts))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Team [id=" + id + ", name=" + name + ", market=" + market + ", reference=" + reference + ", points="
					+ points + ", bonus=" + bonus + ", remaining_timeouts=" + remaining_timeouts + "]";
		}
	}
}
