package com.athena.backend.platform.dto.sportradar.globalBasketball;

import java.util.Date;


public final class Season {
	public String id;
	public String name;
	public Date start_date;
	public Date end_date;
	public String year;
	public String tournament_id;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + ((tournament_id == null) ? 0 : tournament_id.hashCode());
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
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
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
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		if (tournament_id == null) {
			if (other.tournament_id != null)
				return false;
		} else if (!tournament_id.equals(other.tournament_id))
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
		return "Season [id=" + id + ", name=" + name + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", year=" + year + ", tournament_id=" + tournament_id + "]";
	}
}
