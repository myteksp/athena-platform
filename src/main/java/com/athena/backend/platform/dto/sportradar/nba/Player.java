package com.athena.backend.platform.dto.sportradar.nba;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Player {
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
	public Draft draft;
	public List<Injury> injuries;

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
		result = prime * result + ((injuries == null) ? 0 : injuries.hashCode());
		result = prime * result + ((jersey_number == null) ? 0 : jersey_number.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((primary_position == null) ? 0 : primary_position.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		final Player other = (Player) obj;
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
		if (injuries == null) {
			if (other.injuries != null)
				return false;
		} else if (!injuries.equals(other.injuries))
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
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
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
		return "Player [id=" + id + ", status=" + status + ", full_name=" + full_name + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", abbr_name=" + abbr_name + ", height=" + height + ", weight=" + weight
				+ ", position=" + position + ", primary_position=" + primary_position + ", jersey_number="
				+ jersey_number + ", experience=" + experience + ", birth_place=" + birth_place + ", birthdate="
				+ birthdate + ", updated=" + updated + ", reference=" + reference + ", draft=" + draft + ", injuries="
				+ injuries + "]";
	}

	
	
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Injury{
		public String id;
		public String comment;
		public String desc;
		public String status;
		public String start_date;
		public String update_date;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((comment == null) ? 0 : comment.hashCode());
			result = prime * result + ((desc == null) ? 0 : desc.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			result = prime * result + ((update_date == null) ? 0 : update_date.hashCode());
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
			final Injury other = (Injury) obj;
			if (comment == null) {
				if (other.comment != null)
					return false;
			} else if (!comment.equals(other.comment))
				return false;
			if (desc == null) {
				if (other.desc != null)
					return false;
			} else if (!desc.equals(other.desc))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (start_date == null) {
				if (other.start_date != null)
					return false;
			} else if (!start_date.equals(other.start_date))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (update_date == null) {
				if (other.update_date != null)
					return false;
			} else if (!update_date.equals(other.update_date))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Injury [id=" + id + ", comment=" + comment + ", desc=" + desc + ", status=" + status
					+ ", start_date=" + start_date + ", update_date=" + update_date + "]";
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
