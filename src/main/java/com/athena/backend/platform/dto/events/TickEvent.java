package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TickEvent {
	public long time;
	public Long number = null;
	
	public TickEvent(){}
	
	public TickEvent(final long time){
		this.time = time;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		TickEvent other = (TickEvent) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (time != other.time)
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "TickEvent [time=" + time + ", number=" + number + "]";
	}
}
