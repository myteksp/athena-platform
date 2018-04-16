package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SecondTick {
	@JsonProperty(required=true)
	public long nano_off;
	@JsonProperty(required=true)
	public long time_milis;
	
	public SecondTick(final long nano_off, final long time_milis) {
		this.nano_off = nano_off;
		this.time_milis = time_milis;
	}
	
	public SecondTick() {}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (nano_off ^ (nano_off >>> 32));
		result = prime * result + (int) (time_milis ^ (time_milis >>> 32));
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
		if (time_milis != other.time_milis)
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "SecondTick [nano_off=" + nano_off + ", time_milis=" + time_milis + "]";
	}
}
