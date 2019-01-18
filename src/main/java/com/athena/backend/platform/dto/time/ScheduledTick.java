package com.athena.backend.platform.dto.time;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ScheduledTick {
	public long time;
	public long previousTime;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (previousTime ^ (previousTime >>> 32));
		result = prime * result + (int) (time ^ (time >>> 32));
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
		final ScheduledTick other = (ScheduledTick) obj;
		if (previousTime != other.previousTime)
			return false;
		if (time != other.time)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "ScheduledTick [time=" + time + ", previousTime=" + previousTime + "]";
	}
}
