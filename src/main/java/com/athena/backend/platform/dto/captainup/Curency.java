package com.athena.backend.platform.dto.captainup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Curency {
	public String name;
	public int amount;
	public int amount_received;
	public double multiplier;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + amount_received;
		long temp;
		temp = Double.doubleToLongBits(multiplier);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		final Curency other = (Curency) obj;
		if (amount != other.amount)
			return false;
		if (amount_received != other.amount_received)
			return false;
		if (Double.doubleToLongBits(multiplier) != Double.doubleToLongBits(other.multiplier))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "Curency [name=" + name + ", amount=" + amount + ", amount_received=" + amount_received + ", multiplier="
				+ multiplier + "]";
	}
}
