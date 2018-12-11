package com.athena.backend.platform.dto.users;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.collections.tuples.MutableTuple3;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SpecialPurchaseDescriptorDTO {
	public SpecialPurchaseRequestDTO.Type type;
	public double price;
	public List<MutableTuple3<PurchaseDTO.Type, Integer, Integer>> amounts;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amounts == null) ? 0 : amounts.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final SpecialPurchaseDescriptorDTO other = (SpecialPurchaseDescriptorDTO) obj;
		if (amounts == null) {
			if (other.amounts != null)
				return false;
		} else if (!amounts.equals(other.amounts))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SpecialPurchaseDescriptorDTO [type=" + type + ", price=" + price + ", amounts=" + amounts + "]";
	}
}
