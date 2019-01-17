package com.athena.backend.platform.dto.achievments;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.util.string.JSON;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessagingCampaign {

	@JsonProperty(required=false)
	public String id;

	@JsonProperty(required=false)
	public String application;

	@JsonProperty(required=true)
	public String name;

	@JsonProperty(required=true)
	public Type type;

	@JsonProperty(required=true)
	public Status status;

	@JsonProperty(required=true)
	public Message.Type messageType;

	@JsonProperty(required=true)
	public Message.BodyType messageBodyType;

	@JsonProperty(required=true)
	public String messageTitle;

	@JsonProperty(required=true)
	public String messageBody;

	@JsonProperty(required=true)
	public long messageTimeToLive;

	@JsonProperty(required=false)
	public String segmentationScript;

	@JsonProperty(required=false)
	public String reactiveScript;

	@JsonProperty(required=false)
	public List<String> userId;


	@JsonProperty(required=false)
	public Long sent;

	@JsonProperty(required=false)
	public Long pending;

	@JsonProperty(required=false)
	public Long opened;

	@JsonProperty(required=false)
	public Long failed;

	@JsonProperty(required=false)
	public Long scheduledCount;

	@JsonProperty(required=false)
	public Long created;

	@JsonProperty(required=false)
	public Long edited;

	@JsonProperty(required=false)
	public Long targetAudience;
	
	@JsonProperty(required=false)
	public String lastError;

	public static enum Type{
		REACTIVE, INSTANT, USER
	}

	public static enum Status{
		ACTIVE, INACTIVE
	}

	@Override
	public final int hashCode() {
		return this.toString().hashCode();
	}
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final MessagingCampaign other = (MessagingCampaign) obj;
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
