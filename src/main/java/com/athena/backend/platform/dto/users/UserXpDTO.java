package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(value=Include.NON_NULL)
public final class UserXpDTO {
	public final int xp;
	public final String title;
	public final int exchangeValue;
	public final long xp_left_before_next_title;

	public UserXpDTO(
			final int xp, 
			final String title,
			final int exchangeValue,
			final Long xp_left_before_next_title) {
		this.xp = xp;
		this.title = title;
		this.exchangeValue = exchangeValue;
		if (xp_left_before_next_title == null)
			this.xp_left_before_next_title = -1l;
		else
			this.xp_left_before_next_title = xp_left_before_next_title;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + exchangeValue;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + xp;
		result = prime * result + (int) (xp_left_before_next_title ^ (xp_left_before_next_title >>> 32));
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
		final UserXpDTO other = (UserXpDTO) obj;
		if (exchangeValue != other.exchangeValue)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (xp != other.xp)
			return false;
		if (xp_left_before_next_title != other.xp_left_before_next_title)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserXpDTO [xp=" + xp + ", title=" + title + ", exchangeValue=" + exchangeValue
				+ ", xp_left_before_next_title=" + xp_left_before_next_title + "]";
	}
}
