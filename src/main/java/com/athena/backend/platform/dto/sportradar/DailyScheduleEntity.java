package com.athena.backend.platform.dto.sportradar;

import java.util.Date;
import java.util.List;

public final class DailyScheduleEntity {
	public Date generated_at;
	public String schema;
	public List<SportEvent> sport_events;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((generated_at == null) ? 0 : generated_at.hashCode());
		result = prime * result + ((schema == null) ? 0 : schema.hashCode());
		result = prime * result + ((sport_events == null) ? 0 : sport_events.hashCode());
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
		final DailyScheduleEntity other = (DailyScheduleEntity) obj;
		if (generated_at == null) {
			if (other.generated_at != null)
				return false;
		} else if (!generated_at.equals(other.generated_at))
			return false;
		if (schema == null) {
			if (other.schema != null)
				return false;
		} else if (!schema.equals(other.schema))
			return false;
		if (sport_events == null) {
			if (other.sport_events != null)
				return false;
		} else if (!sport_events.equals(other.sport_events))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "DailyScheduleEntity [generated_at=" + generated_at + ", schema=" + schema + ", sport_events="
				+ sport_events + "]";
	}
}
