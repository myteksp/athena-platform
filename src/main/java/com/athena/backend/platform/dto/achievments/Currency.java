package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Objects;

@JsonInclude(value=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Currency {
	public String name;
	public CurrencyType type;
	public int amount;
	public Integer amount_received;
	public Double multiplier;
	
	public Currency() {}
	
	public Currency(final int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Currency currency = (Currency) o;
		return amount == currency.amount &&
				Objects.equals(name, currency.name) &&
				type == currency.type &&
				Objects.equals(amount_received, currency.amount_received) &&
				Objects.equals(multiplier, currency.multiplier);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, amount, amount_received, multiplier);
	}

	@Override
	public String toString() {
		return "Currency{" +
				"name='" + name + '\'' +
				", type=" + type +
				", amount=" + amount +
				", amount_received=" + amount_received +
				", multiplier=" + multiplier +
				'}';
	}
}
