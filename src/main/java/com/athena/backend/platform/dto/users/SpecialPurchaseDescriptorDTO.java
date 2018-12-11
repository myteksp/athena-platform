package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SpecialPurchaseDescriptorDTO {
	public SpecialPurchaseRequestDTO.Type type;
	public int amount;
	public Integer gain;
	public Integer minutes;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((gain == null) ? 0 : gain.hashCode());
		result = prime * result + ((minutes == null) ? 0 : minutes.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		final SpecialPurchaseDescriptorDTO other = (SpecialPurchaseDescriptorDTO) obj;
		if (amount != other.amount)
			return false;
		if (gain == null) {
			if (other.gain != null)
				return false;
		} else if (!gain.equals(other.gain))
			return false;
		if (minutes == null) {
			if (other.minutes != null)
				return false;
		} else if (!minutes.equals(other.minutes))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SpecialPurchaseDescriptorDTO [type=" + type + ", amount=" + amount + ", gain=" + gain + ", minutes="
				+ minutes + "]";
	}
}
