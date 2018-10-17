package com.athena.backend.platform.dto.events;

import java.util.List;

import com.athena.backend.platform.dto.sportradar.globalBasketball.PlayerProfile;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class NativeGameEvent extends BaseNativeEvent{
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
		final NativeGameEvent other = (NativeGameEvent) obj;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "NativeGameEvent [payload=" + payload + "]";
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Payload{
		public Game game;
		public Event event;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((game == null) ? 0 : game.hashCode());
			result = prime * result + ((event == null) ? 0 : event.hashCode());
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
			if (event == null) {
				if (other.event != null)
					return false;
			} else if (!event.equals(other.event))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Payload [game=" + game + ", event=" + event + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Event{
		public String id;
		public String event_type;
		public Integer number;
		public String clock;
		public String updated;
		public String description;
		public Attribution attribution;
		public Location location;
		public Possession possession;
		public Period period;
		public GameParticipants on_court;
		public List<Statistics> statistics;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((attribution == null) ? 0 : attribution.hashCode());
			result = prime * result + ((clock == null) ? 0 : clock.hashCode());
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((event_type == null) ? 0 : event_type.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((location == null) ? 0 : location.hashCode());
			result = prime * result + ((number == null) ? 0 : number.hashCode());
			result = prime * result + ((on_court == null) ? 0 : on_court.hashCode());
			result = prime * result + ((period == null) ? 0 : period.hashCode());
			result = prime * result + ((possession == null) ? 0 : possession.hashCode());
			result = prime * result + ((statistics == null) ? 0 : statistics.hashCode());
			result = prime * result + ((updated == null) ? 0 : updated.hashCode());
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
			final Event other = (Event) obj;
			if (attribution == null) {
				if (other.attribution != null)
					return false;
			} else if (!attribution.equals(other.attribution))
				return false;
			if (clock == null) {
				if (other.clock != null)
					return false;
			} else if (!clock.equals(other.clock))
				return false;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (event_type == null) {
				if (other.event_type != null)
					return false;
			} else if (!event_type.equals(other.event_type))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (location == null) {
				if (other.location != null)
					return false;
			} else if (!location.equals(other.location))
				return false;
			if (number == null) {
				if (other.number != null)
					return false;
			} else if (!number.equals(other.number))
				return false;
			if (on_court == null) {
				if (other.on_court != null)
					return false;
			} else if (!on_court.equals(other.on_court))
				return false;
			if (period == null) {
				if (other.period != null)
					return false;
			} else if (!period.equals(other.period))
				return false;
			if (possession == null) {
				if (other.possession != null)
					return false;
			} else if (!possession.equals(other.possession))
				return false;
			if (statistics == null) {
				if (other.statistics != null)
					return false;
			} else if (!statistics.equals(other.statistics))
				return false;
			if (updated == null) {
				if (other.updated != null)
					return false;
			} else if (!updated.equals(other.updated))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Event [id=" + id + ", event_type=" + event_type + ", number=" + number + ", clock=" + clock
					+ ", updated=" + updated + ", description=" + description + ", attribution=" + attribution
					+ ", location=" + location + ", possession=" + possession + ", period=" + period + ", on_court="
					+ on_court + ", statistics=" + statistics + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Statistics{
		public Boolean made;
		public Integer points;
		public String shot_type;
		public String type;
		public String rebound_type;
		public StatisticsTeam team;
		public StatisticsPlayer player;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((made == null) ? 0 : made.hashCode());
			result = prime * result + ((player == null) ? 0 : player.hashCode());
			result = prime * result + ((points == null) ? 0 : points.hashCode());
			result = prime * result + ((rebound_type == null) ? 0 : rebound_type.hashCode());
			result = prime * result + ((shot_type == null) ? 0 : shot_type.hashCode());
			result = prime * result + ((team == null) ? 0 : team.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			final Statistics other = (Statistics) obj;
			if (made == null) {
				if (other.made != null)
					return false;
			} else if (!made.equals(other.made))
				return false;
			if (player == null) {
				if (other.player != null)
					return false;
			} else if (!player.equals(other.player))
				return false;
			if (points == null) {
				if (other.points != null)
					return false;
			} else if (!points.equals(other.points))
				return false;
			if (rebound_type == null) {
				if (other.rebound_type != null)
					return false;
			} else if (!rebound_type.equals(other.rebound_type))
				return false;
			if (shot_type == null) {
				if (other.shot_type != null)
					return false;
			} else if (!shot_type.equals(other.shot_type))
				return false;
			if (team == null) {
				if (other.team != null)
					return false;
			} else if (!team.equals(other.team))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Statistics [made=" + made + ", points=" + points + ", shot_type=" + shot_type + ", type=" + type
					+ ", rebound_type=" + rebound_type + ", team=" + team + ", player=" + player + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class StatisticsPlayer{
		public String id;
		public String full_name;
		public String jersey_number;
		public String reference;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((jersey_number == null) ? 0 : jersey_number.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
			final StatisticsPlayer other = (StatisticsPlayer) obj;
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
			if (reference == null) {
				if (other.reference != null)
					return false;
			} else if (!reference.equals(other.reference))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "StatisticsPlayer [id=" + id + ", full_name=" + full_name + ", jersey_number=" + jersey_number
					+ ", reference=" + reference + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class StatisticsTeam{
		public String id;
		public String name;
		public String market;
		public String reference;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
			final StatisticsTeam other = (StatisticsTeam) obj;
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
			return true;
		}
		@Override
		public final String toString() {
			return "StatisticsTeam [id=" + id + ", name=" + name + ", market=" + market + ", reference=" + reference
					+ "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class GameParticipants{
		public GameParticipantTeam home;
		public GameParticipantTeam away;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((away == null) ? 0 : away.hashCode());
			result = prime * result + ((home == null) ? 0 : home.hashCode());
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
			final GameParticipants other = (GameParticipants) obj;
			if (away == null) {
				if (other.away != null)
					return false;
			} else if (!away.equals(other.away))
				return false;
			if (home == null) {
				if (other.home != null)
					return false;
			} else if (!home.equals(other.home))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "GameParticipants [home=" + home + ", away=" + away + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class GameParticipantTeam{
		public String id;
		public String name;
		public String market;
		public String reference;
		public List<GameParticipantPlayer> players;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((players == null) ? 0 : players.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
			final GameParticipantTeam other = (GameParticipantTeam) obj;
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
			if (players == null) {
				if (other.players != null)
					return false;
			} else if (!players.equals(other.players))
				return false;
			if (reference == null) {
				if (other.reference != null)
					return false;
			} else if (!reference.equals(other.reference))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "GameParticipantTeam [id=" + id + ", name=" + name + ", market=" + market + ", reference="
					+ reference + ", players=" + players + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class League{
		public String id;
		public String name;
		public String alias;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((alias == null) ? 0 : alias.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			final League other = (League) obj;
			if (alias == null) {
				if (other.alias != null)
					return false;
			} else if (!alias.equals(other.alias))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "League [id=" + id + ", name=" + name + ", alias=" + alias + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Draft{
		public String team_id;
		public String year;
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
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Season{
		public String id;
		public int year;
		public String type;
		public List<Team> teams;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class PlayerStats{
		public String id;
		public String status;
		public String full_name;
		public String first_name;
		public String last_name;
		public String abbr_name;
		public int height;
		public int weight;
		public String position;
		public String primary_position;
		public String jersey_number;
		public String experience;
		public String college;
		public String birth_place;
		public String birthdate;
		public String updated;
		public String sr_id;
		public String reference;
		public League league;
		public Team team;
		public Draft draft;
		public List<Season> seasons;
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
			final PlayerStats other = (PlayerStats) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "PlayerStats [id=" + id + ", status=" + status + ", full_name=" + full_name + ", first_name="
					+ first_name + ", last_name=" + last_name + ", abbr_name=" + abbr_name + ", height=" + height
					+ ", weight=" + weight + ", position=" + position + ", primary_position=" + primary_position
					+ ", jersey_number=" + jersey_number + ", experience=" + experience + ", college=" + college
					+ ", birth_place=" + birth_place + ", birthdate=" + birthdate + ", updated=" + updated + ", sr_id="
					+ sr_id + ", reference=" + reference + ", league=" + league + ", team=" + team + ", draft=" + draft
					+ ", seasons=" + seasons + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class GameParticipantPlayer{
		public String id;
		public String full_name;
		public String jersey_number;
		public String reference;
		public PlayerProfile full_profile;
		
		public PlayerStats stats;
		
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
			result = prime * result + ((full_profile == null) ? 0 : full_profile.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((jersey_number == null) ? 0 : jersey_number.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
			final GameParticipantPlayer other = (GameParticipantPlayer) obj;
			if (full_name == null) {
				if (other.full_name != null)
					return false;
			} else if (!full_name.equals(other.full_name))
				return false;
			if (full_profile == null) {
				if (other.full_profile != null)
					return false;
			} else if (!full_profile.equals(other.full_profile))
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
			if (reference == null) {
				if (other.reference != null)
					return false;
			} else if (!reference.equals(other.reference))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "GameParticipantPlayer [id=" + id + ", full_name=" + full_name + ", jersey_number=" + jersey_number
					+ ", reference=" + reference + ", full_profile=" + full_profile + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Period{
		public String id;
		public Integer number;
		public Integer sequence;
		public String type;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((number == null) ? 0 : number.hashCode());
			result = prime * result + ((sequence == null) ? 0 : sequence.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}
		@Override
		public final boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final Period other = (Period) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (number == null) {
				if (other.number != null)
					return false;
			} else if (!number.equals(other.number))
				return false;
			if (sequence == null) {
				if (other.sequence != null)
					return false;
			} else if (!sequence.equals(other.sequence))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Period [id=" + id + ", number=" + number + ", sequence=" + sequence + ", type=" + type + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Possession{
		public String id;
		public String name;
		public String market;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			final Possession other = (Possession) obj;
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
			return true;
		}
		@Override
		public final String toString() {
			return "Possession [id=" + id + ", name=" + name + ", market=" + market + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Attribution{
		public String id;
		public String name;
		public String market;
		public String reference;
		public String team_basket;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((reference == null) ? 0 : reference.hashCode());
			result = prime * result + ((team_basket == null) ? 0 : team_basket.hashCode());
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
			final Attribution other = (Attribution) obj;
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
			if (team_basket == null) {
				if (other.team_basket != null)
					return false;
			} else if (!team_basket.equals(other.team_basket))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Attribution [id=" + id + ", name=" + name + ", market=" + market + ", reference=" + reference
					+ ", team_basket=" + team_basket + "]";
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Location{
		public Integer coord_x;
		public Integer coord_y;
		public String action_area;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((action_area == null) ? 0 : action_area.hashCode());
			result = prime * result + ((coord_x == null) ? 0 : coord_x.hashCode());
			result = prime * result + ((coord_y == null) ? 0 : coord_y.hashCode());
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
			final Location other = (Location) obj;
			if (action_area == null) {
				if (other.action_area != null)
					return false;
			} else if (!action_area.equals(other.action_area))
				return false;
			if (coord_x == null) {
				if (other.coord_x != null)
					return false;
			} else if (!coord_x.equals(other.coord_x))
				return false;
			if (coord_y == null) {
				if (other.coord_y != null)
					return false;
			} else if (!coord_y.equals(other.coord_y))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Location [coord_x=" + coord_x + ", coord_y=" + coord_y + ", action_area=" + action_area + "]";
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
	public static final class TeamTotal{
		public int games_played;
		public int games_started;
		public double minutes;
		public int field_goals_made;
		public int field_goals_att;
		public double field_goals_pct;
		public int two_points_made;
		public int two_points_att;
		public double two_points_pct;
		public int three_points_made;
		public int three_points_att;
		public double three_points_pct;
		public int blocked_att;
		public int free_throws_made;
		public int free_throws_att;
		public double free_throws_pct;
		public int offensive_rebounds;
		public int defensive_rebounds;
		public int rebounds;
		public int assists;
		public int turnovers;
		public double assists_turnover_ratio;
		public int steals;
		public int blocks;
		public int personal_fouls;
		public int tech_fouls;
		public int points;
		public int flagrant_fouls;
		public int ejections;
		public int foulouts;
		public double true_shooting_att;
		public double true_shooting_pct;
		public int efficiency;
		public int points_off_turnovers;
		public int points_in_paint;
		public int points_in_paint_made;
		public int points_in_paint_att;
		public double points_in_paint_pct;
		public double effective_fg_pct;
		public int double_doubles;
		public int triple_doubles;
		public int fouls_drawn;
		public int offensive_fouls;
		public int fast_break_pts;
		public int fast_break_att;
		public int fast_break_made;
		public int fast_break_pct;
		public int coach_ejections;
		public double second_chance_pct;
		public int second_chance_pts;
		public int second_chance_att;
		public int second_chance_made;
		public int minus;
		public int plus;
		public int coach_tech_fouls;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + assists;
			long temp;
			temp = Double.doubleToLongBits(assists_turnover_ratio);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + blocked_att;
			result = prime * result + blocks;
			result = prime * result + coach_ejections;
			result = prime * result + coach_tech_fouls;
			result = prime * result + defensive_rebounds;
			result = prime * result + double_doubles;
			temp = Double.doubleToLongBits(effective_fg_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + efficiency;
			result = prime * result + ejections;
			result = prime * result + fast_break_att;
			result = prime * result + fast_break_made;
			result = prime * result + fast_break_pct;
			result = prime * result + fast_break_pts;
			result = prime * result + field_goals_att;
			result = prime * result + field_goals_made;
			temp = Double.doubleToLongBits(field_goals_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + flagrant_fouls;
			result = prime * result + foulouts;
			result = prime * result + fouls_drawn;
			result = prime * result + free_throws_att;
			result = prime * result + free_throws_made;
			temp = Double.doubleToLongBits(free_throws_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + games_played;
			result = prime * result + games_started;
			result = prime * result + minus;
			temp = Double.doubleToLongBits(minutes);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + offensive_fouls;
			result = prime * result + offensive_rebounds;
			result = prime * result + personal_fouls;
			result = prime * result + plus;
			result = prime * result + points;
			result = prime * result + points_in_paint;
			result = prime * result + points_in_paint_att;
			result = prime * result + points_in_paint_made;
			temp = Double.doubleToLongBits(points_in_paint_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + points_off_turnovers;
			result = prime * result + rebounds;
			result = prime * result + second_chance_att;
			result = prime * result + second_chance_made;
			temp = Double.doubleToLongBits(second_chance_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + second_chance_pts;
			result = prime * result + steals;
			result = prime * result + tech_fouls;
			result = prime * result + three_points_att;
			result = prime * result + three_points_made;
			temp = Double.doubleToLongBits(three_points_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + triple_doubles;
			temp = Double.doubleToLongBits(true_shooting_att);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(true_shooting_pct);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + turnovers;
			result = prime * result + two_points_att;
			result = prime * result + two_points_made;
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
			final TeamTotal other = (TeamTotal) obj;
			if (assists != other.assists)
				return false;
			if (Double.doubleToLongBits(assists_turnover_ratio) != Double
					.doubleToLongBits(other.assists_turnover_ratio))
				return false;
			if (blocked_att != other.blocked_att)
				return false;
			if (blocks != other.blocks)
				return false;
			if (coach_ejections != other.coach_ejections)
				return false;
			if (coach_tech_fouls != other.coach_tech_fouls)
				return false;
			if (defensive_rebounds != other.defensive_rebounds)
				return false;
			if (double_doubles != other.double_doubles)
				return false;
			if (Double.doubleToLongBits(effective_fg_pct) != Double.doubleToLongBits(other.effective_fg_pct))
				return false;
			if (efficiency != other.efficiency)
				return false;
			if (ejections != other.ejections)
				return false;
			if (fast_break_att != other.fast_break_att)
				return false;
			if (fast_break_made != other.fast_break_made)
				return false;
			if (fast_break_pct != other.fast_break_pct)
				return false;
			if (fast_break_pts != other.fast_break_pts)
				return false;
			if (field_goals_att != other.field_goals_att)
				return false;
			if (field_goals_made != other.field_goals_made)
				return false;
			if (Double.doubleToLongBits(field_goals_pct) != Double.doubleToLongBits(other.field_goals_pct))
				return false;
			if (flagrant_fouls != other.flagrant_fouls)
				return false;
			if (foulouts != other.foulouts)
				return false;
			if (fouls_drawn != other.fouls_drawn)
				return false;
			if (free_throws_att != other.free_throws_att)
				return false;
			if (free_throws_made != other.free_throws_made)
				return false;
			if (Double.doubleToLongBits(free_throws_pct) != Double.doubleToLongBits(other.free_throws_pct))
				return false;
			if (games_played != other.games_played)
				return false;
			if (games_started != other.games_started)
				return false;
			if (minus != other.minus)
				return false;
			if (Double.doubleToLongBits(minutes) != Double.doubleToLongBits(other.minutes))
				return false;
			if (offensive_fouls != other.offensive_fouls)
				return false;
			if (offensive_rebounds != other.offensive_rebounds)
				return false;
			if (personal_fouls != other.personal_fouls)
				return false;
			if (plus != other.plus)
				return false;
			if (points != other.points)
				return false;
			if (points_in_paint != other.points_in_paint)
				return false;
			if (points_in_paint_att != other.points_in_paint_att)
				return false;
			if (points_in_paint_made != other.points_in_paint_made)
				return false;
			if (Double.doubleToLongBits(points_in_paint_pct) != Double.doubleToLongBits(other.points_in_paint_pct))
				return false;
			if (points_off_turnovers != other.points_off_turnovers)
				return false;
			if (rebounds != other.rebounds)
				return false;
			if (second_chance_att != other.second_chance_att)
				return false;
			if (second_chance_made != other.second_chance_made)
				return false;
			if (Double.doubleToLongBits(second_chance_pct) != Double.doubleToLongBits(other.second_chance_pct))
				return false;
			if (second_chance_pts != other.second_chance_pts)
				return false;
			if (steals != other.steals)
				return false;
			if (tech_fouls != other.tech_fouls)
				return false;
			if (three_points_att != other.three_points_att)
				return false;
			if (three_points_made != other.three_points_made)
				return false;
			if (Double.doubleToLongBits(three_points_pct) != Double.doubleToLongBits(other.three_points_pct))
				return false;
			if (triple_doubles != other.triple_doubles)
				return false;
			if (Double.doubleToLongBits(true_shooting_att) != Double.doubleToLongBits(other.true_shooting_att))
				return false;
			if (Double.doubleToLongBits(true_shooting_pct) != Double.doubleToLongBits(other.true_shooting_pct))
				return false;
			if (turnovers != other.turnovers)
				return false;
			if (two_points_att != other.two_points_att)
				return false;
			if (two_points_made != other.two_points_made)
				return false;
			if (Double.doubleToLongBits(two_points_pct) != Double.doubleToLongBits(other.two_points_pct))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "TeamTotal [games_played=" + games_played + ", games_started=" + games_started + ", minutes="
					+ minutes + ", field_goals_made=" + field_goals_made + ", field_goals_att=" + field_goals_att
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
	public static final class TeamAvarage{
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
			final TeamAvarage other = (TeamAvarage) obj;
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
			return "TeamAvarage [minutes=" + minutes + ", points=" + points + ", off_rebounds=" + off_rebounds
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
	public static final class Team{
		public String id;
		public String name;
		public String market;
		public String alias;
		public String reference;
		public Integer points;
		public Boolean bonus;
		public Integer remaining_timeouts;
		public String sr_id;
		public TeamTotal total;
		public TeamAvarage average;
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
			final Team other = (Team) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Team [id=" + id + ", name=" + name + ", market=" + market + ", alias=" + alias + ", reference="
					+ reference + ", points=" + points + ", bonus=" + bonus + ", remaining_timeouts="
					+ remaining_timeouts + ", sr_id=" + sr_id + "]";
		}
	}
}
