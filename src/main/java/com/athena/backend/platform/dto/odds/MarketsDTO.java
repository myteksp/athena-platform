package com.athena.backend.platform.dto.odds;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class MarketsDTO {
	public String generated_at;
	public String schema;
	public sport_event sport_event;
	
	
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
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class consensus{
		public List<line> lines;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class line{
		public String name;
		public List<outcome> outcomes;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class market{
		public int odds_type_id;
		public String name;
		public String group_name;
		public List<book> books;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class book{
		public String id;
		public String name;
		public List<outcome> outcomes;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class outcome{
		public int odds_field_id;
		public String outcome_id;
		public String type;
		public String odds;
		public String total;
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
	}
	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class tournament{
		public String id;
		public String name;
		public String uuids;
		public sport sport;
		public category category;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class sport{
		public String id;
		public String name;
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class category{
		public String id;
		public String name;
		public String country_code;
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
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class tournament_round {
		public String type;
		public int number;
	}
}
