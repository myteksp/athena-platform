package com.athena.backend.platform.dto.users;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.util.string.JSON;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PurchasedBonusDTO {
	public String id;
	public String purchaseId;
	public String userId;
	public Status status;
	public int clock;
	public String gameId;
	public String playerId;
	public PurchaseDTO.Type type;
	public int remainigActiveSeconds;
	
	public Date activatedAt;
	public Date endedAt;
	
	
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
		final PurchasedBonusDTO other = (PurchasedBonusDTO) obj;
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



	public static enum Status{
		ACTIVE, ENDED
	}
}
