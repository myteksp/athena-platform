package com.athena.backend.platform.dto.odds;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class MarketsDTO {
	public String generated_at;
	public String schema;
	public sport_event sport_event;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((generated_at == null) ? 0 : generated_at.hashCode());
		result = prime * result + ((schema == null) ? 0 : schema.hashCode());
		result = prime * result + ((sport_event == null) ? 0 : sport_event.hashCode());
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
		final MarketsDTO other = (MarketsDTO) obj;
		if (generated_at == null) {
			if (other.generated_at != null)
				return false;
		} else if (!generated_at.equals(other.generated_at))
			return false;
		if (schema == null) {
			if (other.schema != null)
				return false;
		} else if (!schema.equals(other.schema))
			return false;
		if (sport_event == null) {
			if (other.sport_event != null)
				return false;
		} else if (!sport_event.equals(other.sport_event))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MarketsDTO [generated_at=" + generated_at + ", schema=" + schema + ", sport_event=" + sport_event + "]";
	}


	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class sport_event{
		public String id;
		public String scheduled;
		public String start_time_tbd;
		public String status;
		public String uuids;
		public tournament_round tournament_round;
		public season season;
		public tournament tournament;
		public List<competitor> competitors;
		public venue venue;
		public List<market> markets;
		public String markets_last_updated;
		public consensus consensus;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((competitors == null) ? 0 : competitors.hashCode());
			result = prime * result + ((consensus == null) ? 0 : consensus.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((markets == null) ? 0 : markets.hashCode());
			result = prime * result + ((markets_last_updated == null) ? 0 : markets_last_updated.hashCode());
			result = prime * result + ((scheduled == null) ? 0 : scheduled.hashCode());
			result = prime * result + ((season == null) ? 0 : season.hashCode());
			result = prime * result + ((start_time_tbd == null) ? 0 : start_time_tbd.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			result = prime * result + ((tournament == null) ? 0 : tournament.hashCode());
			result = prime * result + ((tournament_round == null) ? 0 : tournament_round.hashCode());
			result = prime * result + ((uuids == null) ? 0 : uuids.hashCode());
			result = prime * result + ((venue == null) ? 0 : venue.hashCode());
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
			final sport_event other = (sport_event) obj;
			if (competitors == null) {
				if (other.competitors != null)
					return false;
			} else if (!competitors.equals(other.competitors))
				return false;
			if (consensus == null) {
				if (other.consensus != null)
					return false;
			} else if (!consensus.equals(other.consensus))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (markets == null) {
				if (other.markets != null)
					return false;
			} else if (!markets.equals(other.markets))
				return false;
			if (markets_last_updated == null) {
				if (other.markets_last_updated != null)
					return false;
			} else if (!markets_last_updated.equals(other.markets_last_updated))
				return false;
			if (scheduled == null) {
				if (other.scheduled != null)
					return false;
			} else if (!scheduled.equals(other.scheduled))
				return false;
			if (season == null) {
				if (other.season != null)
					return false;
			} else if (!season.equals(other.season))
				return false;
			if (start_time_tbd == null) {
				if (other.start_time_tbd != null)
					return false;
			} else if (!start_time_tbd.equals(other.start_time_tbd))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (tournament == null) {
				if (other.tournament != null)
					return false;
			} else if (!tournament.equals(other.tournament))
				return false;
			if (tournament_round == null) {
				if (other.tournament_round != null)
					return false;
			} else if (!tournament_round.equals(other.tournament_round))
				return false;
			if (uuids == null) {
				if (other.uuids != null)
					return false;
			} else if (!uuids.equals(other.uuids))
				return false;
			if (venue == null) {
				if (other.venue != null)
					return false;
			} else if (!venue.equals(other.venue))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "sport_event [id=" + id + ", scheduled=" + scheduled + ", start_time_tbd=" + start_time_tbd
					+ ", status=" + status + ", uuids=" + uuids + ", tournament_round=" + tournament_round + ", season="
					+ season + ", tournament=" + tournament + ", competitors=" + competitors + ", venue=" + venue
					+ ", markets=" + markets + ", markets_last_updated=" + markets_last_updated + ", consensus="
					+ consensus + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class consensus{
		public List<line> lines;

		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((lines == null) ? 0 : lines.hashCode());
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
			final consensus other = (consensus) obj;
			if (lines == null) {
				if (other.lines != null)
					return false;
			} else if (!lines.equals(other.lines))
				return false;
			return true;
		}

		@Override
		public final String toString() {
			return "consensus [lines=" + lines + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class line{
		public String name;
		public List<outcome> outcomes;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((outcomes == null) ? 0 : outcomes.hashCode());
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
			final line other = (line) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (outcomes == null) {
				if (other.outcomes != null)
					return false;
			} else if (!outcomes.equals(other.outcomes))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "line [name=" + name + ", outcomes=" + outcomes + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class market{
		public int odds_type_id;
		public String name;
		public String group_name;
		public List<book> books;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((books == null) ? 0 : books.hashCode());
			result = prime * result + ((group_name == null) ? 0 : group_name.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + odds_type_id;
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
			final market other = (market) obj;
			if (books == null) {
				if (other.books != null)
					return false;
			} else if (!books.equals(other.books))
				return false;
			if (group_name == null) {
				if (other.group_name != null)
					return false;
			} else if (!group_name.equals(other.group_name))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (odds_type_id != other.odds_type_id)
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "market [odds_type_id=" + odds_type_id + ", name=" + name + ", group_name=" + group_name + ", books="
					+ books + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class book{
		public String id;
		public String name;
		public List<outcome> outcomes;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((outcomes == null) ? 0 : outcomes.hashCode());
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
			final book other = (book) obj;
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
			if (outcomes == null) {
				if (other.outcomes != null)
					return false;
			} else if (!outcomes.equals(other.outcomes))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "book [id=" + id + ", name=" + name + ", outcomes=" + outcomes + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class outcome{
		public int odds_field_id;
		public String outcome_id;
		public String type;
		public String odds;
		public String total;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((odds == null) ? 0 : odds.hashCode());
			result = prime * result + odds_field_id;
			result = prime * result + ((outcome_id == null) ? 0 : outcome_id.hashCode());
			result = prime * result + ((total == null) ? 0 : total.hashCode());
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
			final outcome other = (outcome) obj;
			if (odds == null) {
				if (other.odds != null)
					return false;
			} else if (!odds.equals(other.odds))
				return false;
			if (odds_field_id != other.odds_field_id)
				return false;
			if (outcome_id == null) {
				if (other.outcome_id != null)
					return false;
			} else if (!outcome_id.equals(other.outcome_id))
				return false;
			if (total == null) {
				if (other.total != null)
					return false;
			} else if (!total.equals(other.total))
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
			return "outcome [odds_field_id=" + odds_field_id + ", outcome_id=" + outcome_id + ", type=" + type
					+ ", odds=" + odds + ", total=" + total + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class venue{
		public String id;
		public String name;
		public String capacity;
		public String city_name;
		public String country_name;
		public String map_coordinates;
		public String country_code;
		public String uuids;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
			result = prime * result + ((city_name == null) ? 0 : city_name.hashCode());
			result = prime * result + ((country_code == null) ? 0 : country_code.hashCode());
			result = prime * result + ((country_name == null) ? 0 : country_name.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((map_coordinates == null) ? 0 : map_coordinates.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((uuids == null) ? 0 : uuids.hashCode());
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
			final venue other = (venue) obj;
			if (capacity == null) {
				if (other.capacity != null)
					return false;
			} else if (!capacity.equals(other.capacity))
				return false;
			if (city_name == null) {
				if (other.city_name != null)
					return false;
			} else if (!city_name.equals(other.city_name))
				return false;
			if (country_code == null) {
				if (other.country_code != null)
					return false;
			} else if (!country_code.equals(other.country_code))
				return false;
			if (country_name == null) {
				if (other.country_name != null)
					return false;
			} else if (!country_name.equals(other.country_name))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (map_coordinates == null) {
				if (other.map_coordinates != null)
					return false;
			} else if (!map_coordinates.equals(other.map_coordinates))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (uuids == null) {
				if (other.uuids != null)
					return false;
			} else if (!uuids.equals(other.uuids))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "venue [id=" + id + ", name=" + name + ", capacity=" + capacity + ", city_name=" + city_name
					+ ", country_name=" + country_name + ", map_coordinates=" + map_coordinates + ", country_code="
					+ country_code + ", uuids=" + uuids + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class competitor{
		public String id;
		public String name;
		public String country;
		public String country_code;
		public String abbreviation;
		public String qualifier;
		public int rotation_number;
		public String uuids;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((abbreviation == null) ? 0 : abbreviation.hashCode());
			result = prime * result + ((country == null) ? 0 : country.hashCode());
			result = prime * result + ((country_code == null) ? 0 : country_code.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((qualifier == null) ? 0 : qualifier.hashCode());
			result = prime * result + rotation_number;
			result = prime * result + ((uuids == null) ? 0 : uuids.hashCode());
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
			final competitor other = (competitor) obj;
			if (abbreviation == null) {
				if (other.abbreviation != null)
					return false;
			} else if (!abbreviation.equals(other.abbreviation))
				return false;
			if (country == null) {
				if (other.country != null)
					return false;
			} else if (!country.equals(other.country))
				return false;
			if (country_code == null) {
				if (other.country_code != null)
					return false;
			} else if (!country_code.equals(other.country_code))
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
			if (qualifier == null) {
				if (other.qualifier != null)
					return false;
			} else if (!qualifier.equals(other.qualifier))
				return false;
			if (rotation_number != other.rotation_number)
				return false;
			if (uuids == null) {
				if (other.uuids != null)
					return false;
			} else if (!uuids.equals(other.uuids))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "competitor [id=" + id + ", name=" + name + ", country=" + country + ", country_code=" + country_code
					+ ", abbreviation=" + abbreviation + ", qualifier=" + qualifier + ", rotation_number="
					+ rotation_number + ", uuids=" + uuids + "]";
		}
	}
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class tournament{
		public String id;
		public String name;
		public String uuids;
		public sport sport;
		public category category;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((category == null) ? 0 : category.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((sport == null) ? 0 : sport.hashCode());
			result = prime * result + ((uuids == null) ? 0 : uuids.hashCode());
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
			final tournament other = (tournament) obj;
			if (category == null) {
				if (other.category != null)
					return false;
			} else if (!category.equals(other.category))
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
			if (sport == null) {
				if (other.sport != null)
					return false;
			} else if (!sport.equals(other.sport))
				return false;
			if (uuids == null) {
				if (other.uuids != null)
					return false;
			} else if (!uuids.equals(other.uuids))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "tournament [id=" + id + ", name=" + name + ", uuids=" + uuids + ", sport=" + sport + ", category="
					+ category + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class sport{
		public String id;
		public String name;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
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
			final sport other = (sport) obj;
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
			return "sport [id=" + id + ", name=" + name + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class category{
		public String id;
		public String name;
		public String country_code;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((country_code == null) ? 0 : country_code.hashCode());
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
			final category other = (category) obj;
			if (country_code == null) {
				if (other.country_code != null)
					return false;
			} else if (!country_code.equals(other.country_code))
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
			return "category [id=" + id + ", name=" + name + ", country_code=" + country_code + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class season{
		public String id;
		public String name;
		public String start_date;
		public String end_date;
		public String year;
		public String tournament_id;
		public String uuids;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
			result = prime * result + ((tournament_id == null) ? 0 : tournament_id.hashCode());
			result = prime * result + ((uuids == null) ? 0 : uuids.hashCode());
			result = prime * result + ((year == null) ? 0 : year.hashCode());
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
			final season other = (season) obj;
			if (end_date == null) {
				if (other.end_date != null)
					return false;
			} else if (!end_date.equals(other.end_date))
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
			if (start_date == null) {
				if (other.start_date != null)
					return false;
			} else if (!start_date.equals(other.start_date))
				return false;
			if (tournament_id == null) {
				if (other.tournament_id != null)
					return false;
			} else if (!tournament_id.equals(other.tournament_id))
				return false;
			if (uuids == null) {
				if (other.uuids != null)
					return false;
			} else if (!uuids.equals(other.uuids))
				return false;
			if (year == null) {
				if (other.year != null)
					return false;
			} else if (!year.equals(other.year))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "season [id=" + id + ", name=" + name + ", start_date=" + start_date + ", end_date=" + end_date
					+ ", year=" + year + ", tournament_id=" + tournament_id + ", uuids=" + uuids + "]";
		}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class tournament_round {
		public String type;
		public int number;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
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
			final tournament_round other = (tournament_round) obj;
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
			return "tournament_round [type=" + type + ", number=" + number + "]";
		}
	}
}
