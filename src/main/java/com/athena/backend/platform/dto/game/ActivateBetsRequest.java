package com.athena.backend.platform.dto.game;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ActivateBetsRequest extends ArrayList<String> implements List<String>{
	private static final long serialVersionUID = 4531702044731689064L;
}
