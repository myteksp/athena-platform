package com.athena.backend.platform.dto.sportradar.globalBasketball;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SportEvenStatus {
	public String status;
	public String match_status;
	public int home_score;
	public int away_score;
	public String winner_id;
	public List<PeriodScore> period_scores;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + away_score;
		result = prime * result + home_score;
		result = prime * result + ((match_status == null) ? 0 : match_status.hashCode());
		result = prime * result + ((period_scores == null) ? 0 : period_scores.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((winner_id == null) ? 0 : winner_id.hashCode());
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
		final SportEvenStatus other = (SportEvenStatus) obj;
		if (away_score != other.away_score)
			return false;
		if (home_score != other.home_score)
			return false;
		if (match_status == null) {
			if (other.match_status != null)
				return false;
		} else if (!match_status.equals(other.match_status))
			return false;
		if (period_scores == null) {
			if (other.period_scores != null)
				return false;
		} else if (!period_scores.equals(other.period_scores))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (winner_id == null) {
			if (other.winner_id != null)
				return false;
		} else if (!winner_id.equals(other.winner_id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "SportEvenStatus [status=" + status + ", match_status=" + match_status + ", home_score=" + home_score
				+ ", away_score=" + away_score + ", winner_id=" + winner_id + ", period_scores=" + period_scores
				+ "]";
	}
}
