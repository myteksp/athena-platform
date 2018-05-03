package com.athena.backend.platform.dto.game;

import java.util.List;

import com.athena.backend.platform.dto.game.BetBonus.BetBonusType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class BetsBundle {
	public final String commonId;
	public final List<Bet> bets;
	public final int totalBonusAmount;
	public final int nettoProfit;
	public final BetBonusType bonusType;
	

	public BetsBundle(
			final String commonId, 
			final List<Bet> bets) {
		this.commonId = commonId;
		this.bets = bets;
		int bonusAmount = 0;
		int amountMax = 0;
		int profit = 0;
		BetBonusType type = null;
		for(final Bet bet : bets) {
			if (bet.bonuses != null) {
				for(final BetBonus bon : bet.bonuses) {
					bonusAmount += bon.amount;
					if (bon.amount > amountMax) {
						amountMax = bon.amount;
						type = bon.type;
					}
				}
			}
			bet.win -= bet.stake;
			switch (bet.status) {
			case COMPLETED_FAIL:
				profit -= bet.stake;
				break;
			case COMPLETED_WIN:
				profit += bet.win;
				break;
			default:
				break;
			
			}
		}
		this.nettoProfit = profit + bonusAmount;
		this.totalBonusAmount = bonusAmount;
		this.bonusType = type;
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bets == null) ? 0 : bets.hashCode());
		result = prime * result + ((bonusType == null) ? 0 : bonusType.hashCode());
		result = prime * result + ((commonId == null) ? 0 : commonId.hashCode());
		result = prime * result + nettoProfit;
		result = prime * result + totalBonusAmount;
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
		if (bonusType != other.bonusType)
			return false;
		if (commonId == null) {
			if (other.commonId != null)
				return false;
		} else if (!commonId.equals(other.commonId))
			return false;
		if (nettoProfit != other.nettoProfit)
			return false;
		if (totalBonusAmount != other.totalBonusAmount)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "BetsBundle [commonId=" + commonId + ", bets=" + bets + ", totalBonusAmount=" + totalBonusAmount
				+ ", nettoProfit=" + nettoProfit + ", bonusType=" + bonusType + "]";
	}
}
