package com.athena.backend.platform.dto.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserBalanceUpdateDTO {
	public int delta;
	public double actualMoneyAmount;
	public String currency;
	public String platform;
	public String optionalTransactionInfo;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(actualMoneyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + delta;
		result = prime * result + ((optionalTransactionInfo == null) ? 0 : optionalTransactionInfo.hashCode());
		result = prime * result + ((platform == null) ? 0 : platform.hashCode());
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
		final UserBalanceUpdateDTO other = (UserBalanceUpdateDTO) obj;
		if (Double.doubleToLongBits(actualMoneyAmount) != Double.doubleToLongBits(other.actualMoneyAmount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (delta != other.delta)
			return false;
		if (optionalTransactionInfo == null) {
			if (other.optionalTransactionInfo != null)
				return false;
		} else if (!optionalTransactionInfo.equals(other.optionalTransactionInfo))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "UserBalanceUpdateDTO [delta=" + delta + ", actualMoneyAmount=" + actualMoneyAmount + ", currency="
				+ currency + ", platform=" + platform + ", optionalTransactionInfo=" + optionalTransactionInfo + "]";
	}
}
