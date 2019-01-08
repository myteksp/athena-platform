package com.athena.backend.platform.dto.users;

import com.athena.backend.platform.dto.users.PurchaseDTO.Type;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.util.string.JSON;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RecievedBonusFromSpecialPurchaseDTO {
	public String id;
	public String userId;
	public String actiavtedItemId;
	public String associatedBetId;
	public Type type;
	public int amount;
	public String gameId;
	public String inGameTime;
	public long created;
	public boolean addedToRank;
	public String playerName;
	public String playerJersey;
	@Override
	public final int hashCode() {
		return this.toString().hashCode();
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
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
