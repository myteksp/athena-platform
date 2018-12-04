package com.athena.backend.platform.dto.users;

import com.athena.backend.platform.dto.users.PurchaseDTO.Type;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RecievedBonusFromSpecialPurchaseDTO {
	public String id;
	public String userId;
	public String associatedBetId;
	public Type type;
	public int amount;
	public String gameId;
	public boolean addedToRank;
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
		final RecievedBonusFromSpecialPurchaseDTO other = (RecievedBonusFromSpecialPurchaseDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "RecievedBonusFromSpecialPurchaseDTO [id=" + id + ", userId=" + userId + ", associatedBetId="
				+ associatedBetId + ", type=" + type + ", amount=" + amount + ", gameId=" + gameId + ", addedToRank="
				+ addedToRank + "]";
	}
}
