package com.athena.backend.platform.dto.achievments;

import com.athena.backend.platform.dto.events.NativeGameEvent.GameParticipantPlayer;
import com.athena.backend.platform.dto.sportradar.nba.Game;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SmartPush {
	@JsonProperty(required=true)
	public String id;
	
	@JsonProperty(required=true)
	public Type type;
	
	@JsonProperty(required=true)
	public String userId;
	
	@JsonProperty(required=false)
	public String gameId;
	
	@JsonProperty(required=false)
	public String playerId;
	
	@JsonProperty(required=false)
	public Game game;
	
	@JsonProperty(required=false)
	public GameParticipantPlayer player; 
	
	public static enum Type{
		MAKE_PRE_GAME, CREATE_GROUP, INVITE_FRIEND, SET_HOT_PLAYER
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((game == null) ? 0 : game.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final SmartPush other = (SmartPush) obj;
		if (game == null) {
			if (other.game != null)
				return false;
		} else if (!game.equals(other.game))
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (player == null) {
			if (other.player != null)
				return false;
		} else if (!player.equals(other.player))
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (type != other.type)
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
		return "SmartPush [id=" + id + ", type=" + type + ", userId=" + userId + ", gameId=" + gameId + ", playerId="
				+ playerId + ", game=" + game + ", player=" + player + "]";
	}
}
