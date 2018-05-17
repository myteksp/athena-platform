package com.athena.backend.platform.dto.events;


import com.athena.backend.platform.dto.game.BetType;
import com.athena.backend.platform.dto.game.GameLocation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BetFeedItem {
	@JsonProperty(required=true)
	public String commonId;
	
	@JsonProperty(required=true)
	public String userId;
	
	@JsonProperty(required=true)
	public String gameId;
	
	@JsonProperty(required=true)
	public String teamId;
	
	@JsonProperty(required=true)
	public BetType type;
	
	@JsonProperty(required=true)
	public String teamName;
	
	@JsonProperty(required=false)
	public String playerId;
	
	@JsonProperty(required=false)
	public String userFullName;
	
	@JsonProperty(required=false)
	public GameLocation gameZone;
	
	@JsonProperty(required=false)
	public String playerName;
	
	@JsonProperty(required=false)
	public String playerNumber;
	
	@JsonProperty(required=false)
	public String userAvatarUrl;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
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
		final BetFeedItem other = (BetFeedItem) obj;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "BetFeedItem [commonId=" + commonId + ", userId=" + userId + ", gameId=" + gameId + ", teamId=" + teamId
				+ ", type=" + type + ", teamName=" + teamName + ", playerId=" + playerId + ", userFullName="
				+ userFullName + ", gameZone=" + gameZone + ", playerName=" + playerName + ", playerNumber="
				+ playerNumber + ", userAvatarUrl=" + userAvatarUrl + "]";
	}
}
