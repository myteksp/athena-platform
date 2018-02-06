package com.athena.backend.platform.dto.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Bet {
	public String id;
	public String userId;
	public String gameId;
	public String commonId;
	public BetType type;
	public BetStatus status;
	public String teamId;
	public String playerId;
	public Integer stake;
	public Integer win;
	public Integer x;
	public Integer y;
	public Long completionTime;
	public Integer points;
	public Boolean notified;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final Bet other = (Bet) obj;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
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
		return "Bet [id=" + id + ", userId=" + userId + ", gameId=" + gameId + ", commonId=" + commonId + ", type="
				+ type + ", status=" + status + ", teamId=" + teamId + ", playerId=" + playerId + ", stake=" + stake
				+ ", win=" + win + ", x=" + x + ", y=" + y + ", completionTime=" + completionTime + ", points=" + points
				+ ", notified=" + notified + "]";
	}
}
