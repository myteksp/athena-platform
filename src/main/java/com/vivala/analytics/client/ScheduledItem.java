package com.vivala.analytics.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public final class ScheduledItem {
	@JsonProperty(required=false)
	public String id;
	@JsonProperty(required=true)
	public String type;
	@JsonProperty(required=true)
	public String project;
	@JsonProperty(required=true)
	public String itemId;
	@JsonProperty(required=true)
	public String itemName;
	@JsonProperty(required=true)
	public String itemParam;
	@JsonProperty(required=true)
	public long scheduled;
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemParam == null) ? 0 : itemParam.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + (int) (scheduled ^ (scheduled >>> 32));
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
		final ScheduledItem other = (ScheduledItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemParam == null) {
			if (other.itemParam != null)
				return false;
		} else if (!itemParam.equals(other.itemParam))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (scheduled != other.scheduled)
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
		return "ScheduledItem [id=" + id + ", type=" + type + ", project=" + project + ", itemId=" + itemId
				+ ", itemName=" + itemName + ", itemParam=" + itemParam + ", scheduled=" + scheduled + "]";
	}
}
