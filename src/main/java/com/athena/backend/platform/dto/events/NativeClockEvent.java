package com.athena.backend.platform.dto.events;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class NativeClockEvent extends BaseNativeEvent{
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
		final NativeClockEvent other = (NativeClockEvent) obj;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "NativeClockEvent [payload=" + payload + "]";
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Payload{
		public Game game;
		public Clocks clocks;
		public Period period;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((clocks == null) ? 0 : clocks.hashCode());
			result = prime * result + ((game == null) ? 0 : game.hashCode());
			result = prime * result + ((period == null) ? 0 : period.hashCode());
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
			if (clocks == null) {
				if (other.clocks != null)
					return false;
			} else if (!clocks.equals(other.clocks))
				return false;
			if (game == null) {
				if (other.game != null)
					return false;
			} else if (!game.equals(other.game))
				return false;
			if (period == null) {
				if (other.period != null)
					return false;
			} else if (!period.equals(other.period))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Payload [game=" + game + ", clocks=" + clocks + ", period=" + period + "]";
		}
	}
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Period{
		public String id;
		public Integer sequence;
		public Integer number;
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
		public final boolean equals(final Object obj) {
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
			return "Period [id=" + id + ", sequence=" + sequence + ", number=" + number + ", type=" + type + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Clocks{
		public String game;
		public Boolean running;
		public String shot;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((game == null) ? 0 : game.hashCode());
			result = prime * result + ((running == null) ? 0 : running.hashCode());
			result = prime * result + ((shot == null) ? 0 : shot.hashCode());
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
			final Clocks other = (Clocks) obj;
			if (game == null) {
				if (other.game != null)
					return false;
			} else if (!game.equals(other.game))
				return false;
			if (running == null) {
				if (other.running != null)
					return false;
			} else if (!running.equals(other.running))
				return false;
			if (shot == null) {
				if (other.shot != null)
					return false;
			} else if (!shot.equals(other.shot))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Clocks [game=" + game + ", running=" + running + ", shot=" + shot + "]";
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
		public Integer remaining_timeouts;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
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
			return "Team [name=" + name + ", market=" + market + ", reference=" + reference + ", id=" + id + ", points="
					+ points + ", remaining_timeouts=" + remaining_timeouts + "]";
		}
	}
}
