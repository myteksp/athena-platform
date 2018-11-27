package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Currency {
	public String name;
	public int amount;
	public Integer amount_received;
	public Double multiplier;
	
	public Currency() {}
	
	public Currency(final int amount) {
		this.amount = amount;
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((amount_received == null) ? 0 : amount_received.hashCode());
		result = prime * result + ((multiplier == null) ? 0 : multiplier.hashCode());
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
		final Currency other = (Currency) obj;
		if (amount != other.amount)
			return false;
		if (amount_received == null) {
			if (other.amount_received != null)
				return false;
		} else if (!amount_received.equals(other.amount_received))
			return false;
		if (multiplier == null) {
			if (other.multiplier != null)
				return false;
		} else if (!multiplier.equals(other.multiplier))
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
		return "Currency [name=" + name + ", amount=" + amount + ", amount_received=" + amount_received
				+ ", multiplier=" + multiplier + "]";
	}
}
