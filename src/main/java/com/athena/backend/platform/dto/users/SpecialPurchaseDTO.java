package com.athena.backend.platform.dto.users;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SpecialPurchaseDTO {
	public String id;
	public Type type;
	public String userId;
	public int amount;
	public List<ActivePurchaseDTO> active;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final SpecialPurchaseDTO other = (SpecialPurchaseDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SpecialPurchaseDTO [id=" + id + ", type=" + type + ", userId=" + userId + ", amount=" + amount
				+ ", active=" + active + "]";
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class ActivePurchaseDTO {
		public Type type;
		public int clock;
		public String gameId;
		public String playerId;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + clock;
			result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
			result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			final ActivePurchaseDTO other = (ActivePurchaseDTO) obj;
			if (clock != other.clock)
				return false;
			if (gameId == null) {
				if (other.gameId != null)
					return false;
			} else if (!gameId.equals(other.gameId))
				return false;
			if (playerId == null) {
				if (other.playerId != null)
					return false;
			} else if (!playerId.equals(other.playerId))
				return false;
			if (type != other.type)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "ActivePurchaseDTO [type=" + type + ", clock=" + clock + ", gameId=" + gameId + ", playerId="
					+ playerId + "]";
		}
	}
	public static enum Type{
		HOT_PLAYER, DOUBLE_POWER, FREE_RUNS
	}
}
