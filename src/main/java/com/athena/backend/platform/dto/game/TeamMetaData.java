package com.athena.backend.platform.dto.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TeamMetaData {
	@JsonProperty(required=true)
	public String id;
	
	@JsonProperty(required=true)
	public String color;
	
	@JsonProperty(required=true)
	public String logo;
	
	@JsonProperty(required=true)
	public String shirtColor;
	
	@JsonProperty(required=true)
	public String teamPoster;
	
	@JsonProperty(required=true)
	public String name;
	
	@JsonProperty(required=false)
	public String teamPosterURL;
	
	@JsonProperty(required=false)
	public Double brightnessThreshold;
	
	@JsonProperty(required=false)
	public Double colorBrightness;
	
	@JsonProperty(required=false)
	public Double shirtColorBrightness;
	
	@JsonProperty(required=false)
	public String colorBrightnessTarget;
	
	@JsonProperty(required=false)
	public String shirtColorBrightnessTarget;
	
	
	
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		final TeamMetaData other = (TeamMetaData) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TeamMetaData [id=" + id + ", color=" + color + ", logo=" + logo + ", shirtColor=" + shirtColor
				+ ", teamPoster=" + teamPoster + ", name=" + name + ", teamPosterURL=" + teamPosterURL
				+ ", brightnessThreshold=" + brightnessThreshold + ", colorBrightness=" + colorBrightness
				+ ", shirtColorBrightness=" + shirtColorBrightness + ", colorBrightnessTarget=" + colorBrightnessTarget
				+ ", shirtColorBrightnessTarget=" + shirtColorBrightnessTarget + "]";
	}
	public final TeamMetaData copy() {
		final TeamMetaData res = new TeamMetaData();
		res.id = this.id;
		res.color = this.color;
		res.logo = this.logo;
		res.shirtColor = this.shirtColor;
		res.teamPoster = this.teamPoster;
		res.name = this.name;
		res.brightnessThreshold = this.brightnessThreshold;
		res.colorBrightness = this.colorBrightness;
		res.shirtColorBrightness = this.shirtColorBrightness;
		res.colorBrightnessTarget = this.colorBrightnessTarget;
		res.shirtColorBrightnessTarget = this.shirtColorBrightnessTarget;
		res.teamPosterURL = this.teamPosterURL;
		return res;
	}
}
