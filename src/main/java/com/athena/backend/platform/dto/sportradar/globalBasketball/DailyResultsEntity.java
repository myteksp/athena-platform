package com.athena.backend.platform.dto.sportradar.globalBasketball;
import java.util.Date;
import java.util.List;

public final class DailyResultsEntity {
	public Date generated_at;
	public String schema;
	public List<EventAndStatus> results;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((generated_at == null) ? 0 : generated_at.hashCode());
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		result = prime * result + ((schema == null) ? 0 : schema.hashCode());
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
		final DailyResultsEntity other = (DailyResultsEntity) obj;
		if (generated_at == null) {
			if (other.generated_at != null)
				return false;
		} else if (!generated_at.equals(other.generated_at))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		if (schema == null) {
			if (other.schema != null)
				return false;
		} else if (!schema.equals(other.schema))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "DailyResultsEntity [generated_at=" + generated_at + ", schema=" + schema + ", results=" + results + "]";
	}
}
