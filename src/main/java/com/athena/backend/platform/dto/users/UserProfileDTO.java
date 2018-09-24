package com.athena.backend.platform.dto.users;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserProfileDTO {
	public String avatarUrl;
	public String name;
	public LoginType loginType;
	public String shareUrl;
	public String title;
	
	public Gender gender;
	public BirthDay birthDay;
	public String favoriteTeamId;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avatarUrl == null) ? 0 : avatarUrl.hashCode());
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
		result = prime * result + ((favoriteTeamId == null) ? 0 : favoriteTeamId.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((loginType == null) ? 0 : loginType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((shareUrl == null) ? 0 : shareUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		final UserProfileDTO other = (UserProfileDTO) obj;
		if (avatarUrl == null) {
			if (other.avatarUrl != null)
				return false;
		} else if (!avatarUrl.equals(other.avatarUrl))
			return false;
		if (birthDay == null) {
			if (other.birthDay != null)
				return false;
		} else if (!birthDay.equals(other.birthDay))
			return false;
		if (favoriteTeamId == null) {
			if (other.favoriteTeamId != null)
				return false;
		} else if (!favoriteTeamId.equals(other.favoriteTeamId))
			return false;
		if (gender != other.gender)
			return false;
		if (loginType != other.loginType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (shareUrl == null) {
			if (other.shareUrl != null)
				return false;
		} else if (!shareUrl.equals(other.shareUrl))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserProfileDTO [avatarUrl=" + avatarUrl + ", name=" + name + ", loginType=" + loginType + ", shareUrl="
				+ shareUrl + ", title=" + title + ", gender=" + gender + ", birthDay=" + birthDay + ", favoriteTeamId="
				+ favoriteTeamId + "]";
	}



	public static enum Gender{
		MALE, FEMALE, NEUTRAL
	}
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class BirthDay{
		public int year;
		public int month;
		public int day;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + day;
			result = prime * result + month;
			result = prime * result + year;
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
			final BirthDay other = (BirthDay) obj;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "BirthDay [year=" + year + ", month=" + month + ", day=" + day + "]";
		}
	}
}
