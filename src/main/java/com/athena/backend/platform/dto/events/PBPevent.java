package com.athena.backend.platform.dto.events;

import com.athena.backend.platform.dto.sportradar.nba.Game;
import com.athena.backend.platform.dto.sportradar.nba.pbp.PBPgame;

public final class PBPevent {
	public PBPeventType type;
	public Game game; 
	public PBPgame pbp;
	
	public PBPevent(){}
	
	public PBPevent(
			final PBPeventType type,
			final Game game,
			final PBPgame pbp){
		this.type = type;
		this.game = game;
		this.pbp = pbp;
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((game == null) ? 0 : game.hashCode());
		result = prime * result + ((pbp == null) ? 0 : pbp.hashCode());
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
		final PBPevent other = (PBPevent) obj;
		if (game == null) {
			if (other.game != null)
				return false;
		} else if (!game.equals(other.game))
			return false;
		if (pbp == null) {
			if (other.pbp != null)
				return false;
		} else if (!pbp.equals(other.pbp))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PBPevent [type=" + type + ", game=" + game + ", pbp=" + pbp + "]";
	}
}
