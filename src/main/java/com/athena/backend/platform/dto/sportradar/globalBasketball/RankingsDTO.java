package com.athena.backend.platform.dto.sportradar.globalBasketball;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class RankingsDTO {
	public Poll poll;
	public int year;
	public String week;
	public String effective_time;
	public List<Ranking> rankings;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((effective_time == null) ? 0 : effective_time.hashCode());
		result = prime * result + ((poll == null) ? 0 : poll.hashCode());
		result = prime * result + ((rankings == null) ? 0 : rankings.hashCode());
		result = prime * result + ((week == null) ? 0 : week.hashCode());
		result = prime * result + year;
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
		final RankingsDTO other = (RankingsDTO) obj;
		if (effective_time == null) {
			if (other.effective_time != null)
				return false;
		} else if (!effective_time.equals(other.effective_time))
			return false;
		if (poll == null) {
			if (other.poll != null)
				return false;
		} else if (!poll.equals(other.poll))
			return false;
		if (rankings == null) {
			if (other.rankings != null)
				return false;
		} else if (!rankings.equals(other.rankings))
			return false;
		if (week == null) {
			if (other.week != null)
				return false;
		} else if (!week.equals(other.week))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "RankingsDTO [poll=" + poll + ", year=" + year + ", week=" + week + ", effective_time=" + effective_time
				+ ", rankings=" + rankings + "]";
	}


	//==========INNER CLASSES==========
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Ranking{
		public String id;
		public String name;
		public String market;
		public int rank;
		public int wins;
		public int losses;
		public int prev_rank;
		public int points;
		public int fp_votes;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + fp_votes;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + losses;
			result = prime * result + ((market == null) ? 0 : market.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + points;
			result = prime * result + prev_rank;
			result = prime * result + rank;
			result = prime * result + wins;
			return result;
		}
		@Override
		public final boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final Ranking other = (Ranking) obj;
			if (fp_votes != other.fp_votes)
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (losses != other.losses)
				return false;
			if (market == null) {
				if (other.market != null)
					return false;
			} else if (!market.equals(other.market))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (points != other.points)
				return false;
			if (prev_rank != other.prev_rank)
				return false;
			if (rank != other.rank)
				return false;
			if (wins != other.wins)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Ranking [id=" + id + ", name=" + name + ", market=" + market + ", rank=" + rank + ", wins=" + wins
					+ ", losses=" + losses + ", prev_rank=" + prev_rank + ", points=" + points + ", fp_votes="
					+ fp_votes + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Poll{
		public String id;
		public String alias;
		public String name;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((alias == null) ? 0 : alias.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			final Poll other = (Poll) obj;
			if (alias == null) {
				if (other.alias != null)
					return false;
			} else if (!alias.equals(other.alias))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Poll [id=" + id + ", alias=" + alias + ", name=" + name + "]";
		}
	}
}
