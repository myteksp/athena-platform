package com.athena.backend.platform.dto.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RangeDTO {
	public String id;
	public int pageCount;
	public int pageSize;
	public long totalCount;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + pageCount;
		result = prime * result + pageSize;
		result = prime * result + (int) (totalCount ^ (totalCount >>> 32));
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
		final RangeDTO other = (RangeDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (pageSize != other.pageSize)
			return false;
		if (totalCount != other.totalCount)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "RangeDTO [id=" + id + ", pageCount=" + pageCount + ", pageSize=" + pageSize + ", totalCount="
				+ totalCount + "]";
	}
}
