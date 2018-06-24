package com.athena.backend.platform.dto.odds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class MarketsDTO {
	public String generated_at;
	public String schema;
	public Object sport_event;
}
