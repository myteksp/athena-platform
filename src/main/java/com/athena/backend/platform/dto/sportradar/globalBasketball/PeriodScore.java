package com.athena.backend.platform.dto.sportradar.globalBasketball;


public final class PeriodScore {
	public int home_score;
	public int away_score;
	public String type;
	public int number;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + away_score;
		result = prime * result + home_score;
		result = prime * result + number;
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
		final PeriodScore other = (PeriodScore) obj;
		if (away_score != other.away_score)
			return false;
		if (home_score != other.home_score)
			return false;
		if (number != other.number)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PeriodScore [home_score=" + home_score + ", away_score=" + away_score + ", type=" + type
				+ ", number=" + number + "]";
	}
}
