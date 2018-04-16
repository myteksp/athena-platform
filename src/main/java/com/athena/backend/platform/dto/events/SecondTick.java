package com.athena.backend.platform.dto.events;

import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SecondTick {
	@JsonProperty(required=true)
	public long nano_off;
	
	@JsonProperty(required=true)
	public long time;
	
	public SecondTick(final long nano_off, final long time) {
		this.nano_off = nano_off;
		this.time = time;
	}
	
	public SecondTick() {}
	
	public final long offsetToMilliseconds() {
		return TimeUnit.MILLISECONDS.convert(nano_off, TimeUnit.NANOSECONDS);
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (nano_off ^ (nano_off >>> 32));
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
		final SecondTick other = (SecondTick) obj;
		if (nano_off != other.nano_off)
			return false;
		if (time != other.time)
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "SecondTick [nano_off=" + nano_off + ", time=" + time + "]";
	}
}
