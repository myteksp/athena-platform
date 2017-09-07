package com.athena.backend.platform.dto.sportradar.nba.pbp;

import java.util.Date;
import java.util.List;

public final class PBPgameEvent {
	public String id;
	public String event_type;
	public String clock;
	public Date updated;
	public String description;
	public PBPgameEventAttribution attribution;
	public PBPgameEventLocation location;
	public PBPgameEventPossession possession;
	public List<PBPgameEventStatistics> statistics;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribution == null) ? 0 : attribution.hashCode());
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((event_type == null) ? 0 : event_type.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((possession == null) ? 0 : possession.hashCode());
		result = prime * result + ((statistics == null) ? 0 : statistics.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
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
		final PBPgameEvent other = (PBPgameEvent) obj;
		if (attribution == null) {
			if (other.attribution != null)
				return false;
		} else if (!attribution.equals(other.attribution))
			return false;
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (event_type == null) {
			if (other.event_type != null)
				return false;
		} else if (!event_type.equals(other.event_type))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (possession == null) {
			if (other.possession != null)
				return false;
		} else if (!possession.equals(other.possession))
			return false;
		if (statistics == null) {
			if (other.statistics != null)
				return false;
		} else if (!statistics.equals(other.statistics))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPgameEvent [id=" + id + ", event_type=" + event_type + ", clock=" + clock + ", updated=" + updated
				+ ", description=" + description + ", attribution=" + attribution + ", location=" + location
				+ ", possession=" + possession + ", statistics=" + statistics + "]";
	}
}
