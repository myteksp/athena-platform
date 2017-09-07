package com.athena.backend.platform.dto.sportradar.nba.pbp;

import java.util.List;

public final class PBPgamePeriod {
	public String type;
	public String id;
	public int number;
	public int sequence;
	public PBPgamePeriodScoring scoring;
	public List<PBPgameEvent> events;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((events == null) ? 0 : events.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + number;
		result = prime * result + ((scoring == null) ? 0 : scoring.hashCode());
		result = prime * result + sequence;
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
		final PBPgamePeriod other = (PBPgamePeriod) obj;
		if (events == null) {
			if (other.events != null)
				return false;
		} else if (!events.equals(other.events))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (number != other.number)
			return false;
		if (scoring == null) {
			if (other.scoring != null)
				return false;
		} else if (!scoring.equals(other.scoring))
			return false;
		if (sequence != other.sequence)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPgamePeriod [type=" + type + ", id=" + id + ", number=" + number + ", sequence=" + sequence
				+ ", scoring=" + scoring + ", events=" + events + "]";
	}
}
