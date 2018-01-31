package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TickEvent {
	public long time;
	
	public TickEvent(){}
	
	public TickEvent(final long time){
		this.time = time;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (time ^ (time >>> 32));
		return result;
	}
	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TickEvent other = (TickEvent) obj;
		if (time != other.time)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TickEvent [time=" + time + "]";
	}
}
