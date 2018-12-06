package com.athena.backend.platform.dto.users;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.collections.tuples.Tuple2;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SpecialPurchaseRequestDTO {
	@JsonProperty(required=true)
	public Type type;
	
	@JsonProperty(required=true)
	public List<Tuple2<com.athena.backend.platform.dto.users.PurchaseDTO.Type, Integer>> amount;
	
	@JsonProperty(required=true)
	public double money;
	
	@JsonProperty(required=true)
	public String transaction;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		long temp;
		temp = Double.doubleToLongBits(money);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
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
		SpecialPurchaseRequestDTO other = (SpecialPurchaseRequestDTO) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (Double.doubleToLongBits(money) != Double.doubleToLongBits(other.money))
			return false;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SpecialPurchaseRequestDTO [type=" + type + ", amount=" + amount + ", money=" + money + ", transaction="
				+ transaction + "]";
	}


	public static enum Type{
		HOT_PLAYER, DOUBLE_POWER, FREE_RUNS, MEGA_PACK
	}
}
