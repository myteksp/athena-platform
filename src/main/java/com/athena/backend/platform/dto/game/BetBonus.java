package com.athena.backend.platform.dto.game;

public final class BetBonus {
	public int amount;
	public BetBonusType type;
	
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
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
		final BetBonus other = (BetBonus) obj;
		if (amount != other.amount)
			return false;
		if (type != other.type)
			return false;
		return true;
	}


	public static enum BetBonusType{
		FULL_BET_WIN, GUESSED_TWO_OF_THREE, CORRECT_POINTING, ALL_THREE_WRONG, DOUBLE_POWER
	}
}
