package com.athena.backend.platform.dto.users.groups;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class InviteToGroupLinkDTO {
	@JsonProperty(required=true)
	public final String url;
	
	public InviteToGroupLinkDTO(final String url) {
		this.url = url;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		final InviteToGroupLinkDTO other = (InviteToGroupLinkDTO) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "InviteToGroupLinkDTO [imageUrl=" + url + "]";
	}
}
