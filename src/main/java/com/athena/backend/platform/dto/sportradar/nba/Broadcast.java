package com.athena.backend.platform.dto.sportradar.nba;

public final class Broadcast {
	public String network;
	public String satellite;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((network == null) ? 0 : network.hashCode());
		result = prime * result + ((satellite == null) ? 0 : satellite.hashCode());
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
		final Broadcast other = (Broadcast) obj;
		if (network == null) {
			if (other.network != null)
				return false;
		} else if (!network.equals(other.network))
			return false;
		if (satellite == null) {
			if (other.satellite != null)
				return false;
		} else if (!satellite.equals(other.satellite))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "Broadcast [network=" + network + ", satellite=" + satellite + "]";
	}
}
