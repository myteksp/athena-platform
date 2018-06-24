package com.athena.backend.platform.dto.odds;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gf.collections.GfCollections;
import com.gf.util.string.Splitter;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TournamentMappingDTO {
	public String generated_at;
	public String schema;
	public List<Mapping> tournament_mappings;
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((generated_at == null) ? 0 : generated_at.hashCode());
		result = prime * result + ((schema == null) ? 0 : schema.hashCode());
		result = prime * result + ((tournament_mappings == null) ? 0 : tournament_mappings.hashCode());
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
		final TournamentMappingDTO other = (TournamentMappingDTO) obj;
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
		if (tournament_mappings == null) {
			if (other.tournament_mappings != null)
				return false;
		} else if (!tournament_mappings.equals(other.tournament_mappings))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TournamentMappingDTO [generated_at=" + generated_at + ", schema=" + schema + ", tournament_mappings="
				+ tournament_mappings + "]";
	}
	//=================================Internal=================================
	public static final class Mapping{
		public String us_id;
		public String id;
		
		public final String getNumber() {
			return GfCollections.asArrayCollection(Splitter.split(id, ':')).findLast();
		}
		
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((us_id == null) ? 0 : us_id.hashCode());
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
			final Mapping other = (Mapping) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (us_id == null) {
				if (other.us_id != null)
					return false;
			} else if (!us_id.equals(other.us_id))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Mapping [us_id=" + us_id + ", id=" + id + "]";
		}
	}
}
