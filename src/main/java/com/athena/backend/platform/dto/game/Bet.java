package com.athena.backend.platform.dto.game;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Bet {
	public String id;
	public String userId;
	public String gameId;
	public String title;
	public String commonId;
	public BetType type;
	public BetStatus status;
	public String teamId;
	public String playerId;
	public Integer stake;
	public Integer win;
	public Integer quarter;
	public GameLocation gameZone;
	public String teamName;
	public String playerName;
	public String playerNumber;
	public Long completionTime;
	public Long madeTime;
	public Integer points;
	public Boolean notified;
	public String clock;
	public List<BetBonus> bonuses;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonuses == null) ? 0 : bonuses.hashCode());
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
		result = prime * result + ((completionTime == null) ? 0 : completionTime.hashCode());
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((gameZone == null) ? 0 : gameZone.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((madeTime == null) ? 0 : madeTime.hashCode());
		result = prime * result + ((notified == null) ? 0 : notified.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ((playerNumber == null) ? 0 : playerNumber.hashCode());
		result = prime * result + ((points == null) ? 0 : points.hashCode());
		result = prime * result + ((quarter == null) ? 0 : quarter.hashCode());
		result = prime * result + ((stake == null) ? 0 : stake.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((teamId == null) ? 0 : teamId.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((win == null) ? 0 : win.hashCode());
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
		if (bonuses == null) {
			if (other.bonuses != null)
				return false;
		} else if (!bonuses.equals(other.bonuses))
			return false;
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
			return false;
		if (completionTime == null) {
			if (other.completionTime != null)
				return false;
		} else if (!completionTime.equals(other.completionTime))
			return false;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (gameZone != other.gameZone)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (madeTime == null) {
			if (other.madeTime != null)
				return false;
		} else if (!madeTime.equals(other.madeTime))
			return false;
		if (notified == null) {
			if (other.notified != null)
				return false;
		} else if (!notified.equals(other.notified))
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
		if (playerNumber == null) {
			if (other.playerNumber != null)
				return false;
		} else if (!playerNumber.equals(other.playerNumber))
			return false;
		if (points == null) {
			if (other.points != null)
				return false;
		} else if (!points.equals(other.points))
			return false;
		if (quarter == null) {
			if (other.quarter != null)
				return false;
		} else if (!quarter.equals(other.quarter))
			return false;
		if (stake == null) {
			if (other.stake != null)
				return false;
		} else if (!stake.equals(other.stake))
			return false;
		if (status != other.status)
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
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type != other.type)
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (win == null) {
			if (other.win != null)
				return false;
		} else if (!win.equals(other.win))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "Bet [id=" + id + ", userId=" + userId + ", gameId=" + gameId + ", title=" + title + ", commonId="
				+ commonId + ", type=" + type + ", status=" + status + ", teamId=" + teamId + ", playerId=" + playerId
				+ ", stake=" + stake + ", win=" + win + ", quarter=" + quarter + ", gameZone=" + gameZone
				+ ", teamName=" + teamName + ", playerName=" + playerName + ", playerNumber=" + playerNumber
				+ ", completionTime=" + completionTime + ", madeTime=" + madeTime + ", points=" + points + ", notified="
				+ notified + ", clock=" + clock + ", bonuses=" + bonuses + "]";
	}
}
