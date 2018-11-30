package com.athena.backend.platform.dto.users;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.util.string.JSON;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PurchaseDTO {
	public String id;
	public Type type;
	public String userId;
	public int amount;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final PurchaseDTO other = (PurchaseDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}

	public static enum Type{
		HOT_PLAYER, DOUBLE_POWER, FREE_RUNS
	}
}
