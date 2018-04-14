package com.athena.backend.platform.dto.events;

import java.util.List;


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
	public static final class GameParticipantPlayer{
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
		public final boolean equals(Object obj) {
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
					+ ", reference=" + reference + "]";
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
