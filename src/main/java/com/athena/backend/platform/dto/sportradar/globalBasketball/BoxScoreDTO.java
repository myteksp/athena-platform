package com.athena.backend.platform.dto.sportradar.globalBasketball;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BoxScoreDTO {
	public String id;
	public String status;
	public String coverage;
	public boolean neutral_site;
	public String scheduled;
	public boolean conference_game;
	public int attendance;
	public int lead_changes;
	public int times_tied;
	public String clock;
	public int half;
	public boolean track_on_court;
	public String entry_mode;
	public String possession_arrow;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + attendance;
		result = prime * result + ((clock == null) ? 0 : clock.hashCode());
		result = prime * result + (conference_game ? 1231 : 1237);
		result = prime * result + ((coverage == null) ? 0 : coverage.hashCode());
		result = prime * result + ((entry_mode == null) ? 0 : entry_mode.hashCode());
		result = prime * result + half;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + lead_changes;
		result = prime * result + (neutral_site ? 1231 : 1237);
		result = prime * result + ((possession_arrow == null) ? 0 : possession_arrow.hashCode());
		result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + times_tied;
		result = prime * result + (track_on_court ? 1231 : 1237);
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
		final BoxScoreDTO other = (BoxScoreDTO) obj;
		if (attendance != other.attendance)
			return false;
		if (clock == null) {
			if (other.clock != null)
				return false;
		} else if (!clock.equals(other.clock))
			return false;
		if (conference_game != other.conference_game)
			return false;
		if (coverage == null) {
			if (other.coverage != null)
				return false;
		} else if (!coverage.equals(other.coverage))
			return false;
		if (entry_mode == null) {
			if (other.entry_mode != null)
				return false;
		} else if (!entry_mode.equals(other.entry_mode))
			return false;
		if (half != other.half)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lead_changes != other.lead_changes)
			return false;
		if (neutral_site != other.neutral_site)
			return false;
		if (possession_arrow == null) {
			if (other.possession_arrow != null)
				return false;
		} else if (!possession_arrow.equals(other.possession_arrow))
			return false;
		if (scheduled == null) {
			if (other.scheduled != null)
				return false;
		} else if (!scheduled.equals(other.scheduled))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (times_tied != other.times_tied)
			return false;
		if (track_on_court != other.track_on_court)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BoxScoreDTO [id=" + id + ", status=" + status + ", coverage=" + coverage + ", neutral_site="
				+ neutral_site + ", scheduled=" + scheduled + ", conference_game=" + conference_game + ", attendance="
				+ attendance + ", lead_changes=" + lead_changes + ", times_tied=" + times_tied + ", clock=" + clock
				+ ", half=" + half + ", track_on_court=" + track_on_court + ", entry_mode=" + entry_mode
				+ ", possession_arrow=" + possession_arrow + "]";
	}
}
