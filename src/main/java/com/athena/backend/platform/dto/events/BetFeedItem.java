package com.athena.backend.platform.dto.events;

import com.athena.backend.platform.dto.game.BetType;
import com.athena.backend.platform.dto.game.GameLocation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BetFeedItem {
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
	public String userAvatarUrl;


	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((gameZone == null) ? 0 : gameZone.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userAvatarUrl == null) ? 0 : userAvatarUrl.hashCode());
		result = prime * result + ((userFullName == null) ? 0 : userFullName.hashCode());
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
		final BetFeedItem other = (BetFeedItem) obj;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (gameZone != other.gameZone)
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (teamId == null) {
			if (other.teamId != null)
				return false;
		} else if (!teamId.equals(other.teamId))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (type != other.type)
			return false;
		if (userAvatarUrl == null) {
			if (other.userAvatarUrl != null)
				return false;
		} else if (!userAvatarUrl.equals(other.userAvatarUrl))
			return false;
		if (userFullName == null) {
			if (other.userFullName != null)
				return false;
		} else if (!userFullName.equals(other.userFullName))
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
		return "BetFeedItem [userId=" + userId + ", gameId=" + gameId + ", teamId=" + teamId + ", type=" + type
				+ ", teamName=" + teamName + ", playerId=" + playerId + ", userFullName=" + userFullName + ", gameZone="
				+ gameZone + ", playerName=" + playerName + ", userAvatarUrl=" + userAvatarUrl + "]";
	}
}
