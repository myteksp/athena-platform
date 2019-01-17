package com.athena.backend.platform.dto.achievments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessagingCampaign {
	
	@JsonProperty(required=false)
	public String id;
	
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
	public Long sent;
	
	@JsonProperty(required=false)
	public Long pending;
	
	@JsonProperty(required=false)
	public Long opened;
	
	@JsonProperty(required=false)
	public Long failed;
	
	@JsonProperty(required=false)
	public Long scheduledCount;
	
	public static enum Type{
		REACTIVE, INSTANT
	}
	
	public static enum Status{
		ACTIVE, INACTIVE
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((failed == null) ? 0 : failed.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((messageBody == null) ? 0 : messageBody.hashCode());
		result = prime * result + ((messageBodyType == null) ? 0 : messageBodyType.hashCode());
		result = prime * result + (int) (messageTimeToLive ^ (messageTimeToLive >>> 32));
		result = prime * result + ((messageTitle == null) ? 0 : messageTitle.hashCode());
		result = prime * result + ((messageType == null) ? 0 : messageType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((opened == null) ? 0 : opened.hashCode());
		result = prime * result + ((pending == null) ? 0 : pending.hashCode());
		result = prime * result + ((scheduledCount == null) ? 0 : scheduledCount.hashCode());
		result = prime * result + ((sent == null) ? 0 : sent.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		final MessagingCampaign other = (MessagingCampaign) obj;
		if (failed == null) {
			if (other.failed != null)
				return false;
		} else if (!failed.equals(other.failed))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (messageBody == null) {
			if (other.messageBody != null)
				return false;
		} else if (!messageBody.equals(other.messageBody))
			return false;
		if (messageBodyType != other.messageBodyType)
			return false;
		if (messageTimeToLive != other.messageTimeToLive)
			return false;
		if (messageTitle == null) {
			if (other.messageTitle != null)
				return false;
		} else if (!messageTitle.equals(other.messageTitle))
			return false;
		if (messageType != other.messageType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (opened == null) {
			if (other.opened != null)
				return false;
		} else if (!opened.equals(other.opened))
			return false;
		if (pending == null) {
			if (other.pending != null)
				return false;
		} else if (!pending.equals(other.pending))
			return false;
		if (scheduledCount == null) {
			if (other.scheduledCount != null)
				return false;
		} else if (!scheduledCount.equals(other.scheduledCount))
			return false;
		if (sent == null) {
			if (other.sent != null)
				return false;
		} else if (!sent.equals(other.sent))
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MessagingCampaign [id=" + id + ", name=" + name + ", type=" + type + ", status=" + status
				+ ", messageType=" + messageType + ", messageBodyType=" + messageBodyType + ", messageTitle="
				+ messageTitle + ", messageBody=" + messageBody + ", messageTimeToLive=" + messageTimeToLive + ", sent="
				+ sent + ", pending=" + pending + ", opened=" + opened + ", failed=" + failed + ", scheduledCount="
				+ scheduledCount + "]";
	}
}
