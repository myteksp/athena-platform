package com.athena.backend.platform.dto.game;

import java.util.List;

import com.athena.backend.platform.dto.game.BetBonus.BetBonusType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.collections.GfCollections;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BetsBundle {
	public final String commonId;
	public final List<Bet> bets;
	public final int totalBonusAmount;
	public final BetBonusType bonusType;

	public BetsBundle(
			final String commonId, 
			final List<Bet> bets) {
		this.commonId = commonId;
		this.bets = GfCollections.wrapAsCollection(bets)
				.map(b->{
					switch(b.status) {
					case COMPLETED_WIN:
						b.win = b.win - b.stake;
						return b;
					default:
						return b;
					}
				});
		int amount = 0;
		int amountMax = 0;
		BetBonusType type = null;
		for(final Bet bet : bets) {
			if (bet.bonuses != null) {
				for(final BetBonus bon : bet.bonuses) {
					amount += bon.amount;
					if (bon.amount > amountMax) {
						amountMax = bon.amount;
						type = bon.type;
					}
				}
			}
		}
		this.totalBonusAmount = amount;
		this.bonusType = type;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bets == null) ? 0 : bets.hashCode());
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
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
		final BetsBundle other = (BetsBundle) obj;
		if (bets == null) {
			if (other.bets != null)
				return false;
		} else if (!bets.equals(other.bets))
			return false;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BetsBundle [commonId=" + commonId + ", bets=" + bets + "]";
	}
}
