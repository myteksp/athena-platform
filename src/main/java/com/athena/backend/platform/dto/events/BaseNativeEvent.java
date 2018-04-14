package com.athena.backend.platform.dto.events;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseNativeEvent {
	public String locale;
	public Metadata metadata;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ((metadata == null) ? 0 : metadata.hashCode());
		return result;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final BaseNativeEvent other = (BaseNativeEvent) obj;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (metadata == null) {
			if (other.metadata != null)
				return false;
		} else if (!metadata.equals(other.metadata))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BaseNativeEvent [locale=" + locale + ", metadata=" + metadata + "]";
	}

	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static final class Metadata{
		public String league;
		public String match;
		public String status;
		public String team;
		public String players;
		public String event_type;
		public String event_category;
		public String locale;
		public String operation;
		public String version;
		@Override
		public final int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((event_category == null) ? 0 : event_category.hashCode());
			result = prime * result + ((event_type == null) ? 0 : event_type.hashCode());
			result = prime * result + ((league == null) ? 0 : league.hashCode());
			result = prime * result + ((locale == null) ? 0 : locale.hashCode());
			result = prime * result + ((match == null) ? 0 : match.hashCode());
			result = prime * result + ((operation == null) ? 0 : operation.hashCode());
			result = prime * result + ((players == null) ? 0 : players.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			result = prime * result + ((team == null) ? 0 : team.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
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
			final Metadata other = (Metadata) obj;
			if (event_category == null) {
				if (other.event_category != null)
					return false;
			} else if (!event_category.equals(other.event_category))
				return false;
			if (event_type == null) {
				if (other.event_type != null)
					return false;
			} else if (!event_type.equals(other.event_type))
				return false;
			if (league == null) {
				if (other.league != null)
					return false;
			} else if (!league.equals(other.league))
				return false;
			if (locale == null) {
				if (other.locale != null)
					return false;
			} else if (!locale.equals(other.locale))
				return false;
			if (match == null) {
				if (other.match != null)
					return false;
			} else if (!match.equals(other.match))
				return false;
			if (operation == null) {
				if (other.operation != null)
					return false;
			} else if (!operation.equals(other.operation))
				return false;
			if (players == null) {
				if (other.players != null)
					return false;
			} else if (!players.equals(other.players))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (team == null) {
				if (other.team != null)
					return false;
			} else if (!team.equals(other.team))
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}
		@Override
		public final String toString() {
			return "Metadata [league=" + league + ", match=" + match + ", status=" + status + ", team=" + team
					+ ", players=" + players + ", event_type=" + event_type + ", event_category=" + event_category
					+ ", locale=" + locale + ", operation=" + operation + ", version=" + version + "]";
		}
	}
}