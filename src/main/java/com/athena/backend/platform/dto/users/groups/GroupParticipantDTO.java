package com.athena.backend.platform.dto.users.groups;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class GroupParticipantDTO {
	
	@JsonProperty(required=true)
	public String userId;
	
	@JsonProperty(required=true)
	public String groupId;
	
	@JsonProperty(required=true)
	public long joined;
	
	@JsonProperty(required=true)
	public int earnedTotal;
	
	@JsonProperty(required=true)
	public int lostTotal;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		final GroupParticipantDTO other = (GroupParticipantDTO) obj;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GroupParticipantDTO [userId=" + userId + ", groupId=" + groupId + ", joined=" + joined
				+ ", earnedTotal=" + earnedTotal + ", lostTotal=" + lostTotal + "]";
	}
}
