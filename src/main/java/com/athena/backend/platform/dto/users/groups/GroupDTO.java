package com.athena.backend.platform.dto.users.groups;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class GroupDTO {
	@JsonProperty(required=true)
	public String groupId;
	
	@JsonProperty(required=true)
	public String adminId;
	
	@JsonProperty(required=true)
	public String pictureUrl;
	
	@JsonProperty(required=true)
	public String groupName;
	
	@JsonProperty(required=true)
	public long creationTime;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
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
		final GroupDTO other = (GroupDTO) obj;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GroupDTO [groupId=" + groupId + ", adminId=" + adminId + ", pictureUrl=" + pictureUrl + ", groupName="
				+ groupName + ", creationTime=" + creationTime + "]";
	}
}
