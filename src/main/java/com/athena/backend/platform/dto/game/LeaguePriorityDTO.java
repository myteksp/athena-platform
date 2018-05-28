package com.athena.backend.platform.dto.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class LeaguePriorityDTO {
	public final String league;
	public final int priority;
	
	public LeaguePriorityDTO(final String league, final int priority) {
		this.league = league;
		this.priority = priority;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((league == null) ? 0 : league.hashCode());
		result = prime * result + priority;
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
		final LeaguePriorityDTO other = (LeaguePriorityDTO) obj;
		if (league == null) {
			if (other.league != null)
				return false;
		} else if (!league.equals(other.league))
			return false;
		if (priority != other.priority)
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "LeaguePriorityDTO [league=" + league + ", priority=" + priority + "]";
	}
}
