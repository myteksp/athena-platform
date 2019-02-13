package com.athena.backend.platform.dto.achievments;

import com.athena.backend.platform.dto.events.NativeGameEvent.GameParticipantPlayer;
import com.athena.backend.platform.dto.pregame.PreGameBetData;
import com.athena.backend.platform.dto.sportradar.nba.Game;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.util.string.JSON;

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
	public PreGameBetData pregameData;
	
	@JsonProperty(required=false)
	public GameParticipantPlayer player; 
	
	public static enum Type{
		MAKE_PRE_GAME, CREATE_GROUP, INVITE_FRIEND, SET_HOT_PLAYER
	}

	@Override
	public final int hashCode() {
		return this.toString().hashCode();
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
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
