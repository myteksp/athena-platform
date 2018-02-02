package com.athena.backend.platform.dto.game;

import java.util.List;

public final class GameStatisticalData {
	public String gameId;
	public TeamStatisticalData home;
	public TeamStatisticalData away;
	
	
	public static final class TeamStatisticalData{
		public String teamId;
		public double winPrice;
		public double loosePrice;
		public List<PlayerStatisticalData> players;
	}
	
	public static final class PlayerStatisticalData{
		public String playerId;
		public double winPrice;
		public double loosePrice;
		public List<LocationStatisticalData> locations;
	}
	
	public static final class LocationStatisticalData{
		public GameLocation location;
		public double winPrice;
		public double loosePrice;
	}
}
