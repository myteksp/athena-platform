package com.athena.backend.platform.dto.sportradar.nba.pbp;

public final class PBPplayer {
	public String id;
	public String full_name;
	public String jersey_number;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jersey_number == null) ? 0 : jersey_number.hashCode());
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
		final PBPplayer other = (PBPplayer) obj;
		if (full_name == null) {
			if (other.full_name != null)
				return false;
		} else if (!full_name.equals(other.full_name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jersey_number == null) {
			if (other.jersey_number != null)
				return false;
		} else if (!jersey_number.equals(other.jersey_number))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPplayer [id=" + id + ", full_name=" + full_name + ", jersey_number=" + jersey_number + "]";
	}
}
