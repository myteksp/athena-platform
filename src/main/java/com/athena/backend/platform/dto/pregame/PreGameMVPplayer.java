package com.athena.backend.platform.dto.pregame;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class PreGameMVPplayer {
	@JsonProperty(required=true)
	public String playerId;
	@JsonProperty(required=true)
	public String playerName;
	@JsonProperty(required=true)
	public double risk;
	@JsonProperty(required=true)
	public double win;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(risk);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(win);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final PreGameMVPplayer other = (PreGameMVPplayer) obj;
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
		if (Double.doubleToLongBits(risk) != Double.doubleToLongBits(other.risk))
			return false;
		if (Double.doubleToLongBits(win) != Double.doubleToLongBits(other.win))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PreGameMVPplayer [playerId=" + playerId + ", playerName=" + playerName + ", risk=" + risk + ", win="
				+ win + "]";
	}
}
