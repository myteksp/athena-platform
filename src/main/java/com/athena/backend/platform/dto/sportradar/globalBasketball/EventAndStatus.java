package com.athena.backend.platform.dto.sportradar.globalBasketball;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventAndStatus {
	public SportEvent sport_event;
	public SportEvenStatus sport_event_status;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sport_event == null) ? 0 : sport_event.hashCode());
		result = prime * result + ((sport_event_status == null) ? 0 : sport_event_status.hashCode());
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
		final EventAndStatus other = (EventAndStatus) obj;
		if (sport_event == null) {
			if (other.sport_event != null)
				return false;
		} else if (!sport_event.equals(other.sport_event))
			return false;
		if (sport_event_status == null) {
			if (other.sport_event_status != null)
				return false;
		} else if (!sport_event_status.equals(other.sport_event_status))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "EventAndStatus [sport_event=" + sport_event + ", sport_event_status=" + sport_event_status + "]";
	}
}
