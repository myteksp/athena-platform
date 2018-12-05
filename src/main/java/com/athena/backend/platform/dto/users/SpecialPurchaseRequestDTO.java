package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SpecialPurchaseRequestDTO {
	@JsonProperty(required=true)
	public String userId;
	
	@JsonProperty(required=true)
	public Type type;
	
	@JsonProperty(required=true)
	public String gameId;
	
	@JsonProperty(required=false)
	public String playerId;
	
	@JsonProperty(required=true)
	public double money;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final SpecialPurchaseRequestDTO other = (SpecialPurchaseRequestDTO) obj;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
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
		return "SpecialPurchaseRequestDTO [userId=" + userId + ", type=" + type + ", gameId=" + gameId + ", playerId="
				+ playerId + ", money=" + money + "]";
	}


	public static enum Type{
		HOT_PLAYER, DOUBLE_POWER, FREE_RUNS, MEGA_PACK
	}
}
