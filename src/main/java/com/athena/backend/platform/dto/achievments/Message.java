package com.athena.backend.platform.dto.achievments;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gf.util.string.JSON;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Message {
	private static final String charset = "UTF-8";
	private static final Encoder encoder = Base64.getUrlEncoder();
	private static final Decoder decoder = Base64.getUrlDecoder();
	
	@JsonProperty(required=true)
	public String id;
	
	@JsonProperty(required=true)
	public String userId;
	
	@JsonProperty(required=true)
	public Type type;
	
	@JsonProperty(required=false)
	public Status status;
	
	@JsonProperty(required=false)
	public String title;
	
	@JsonProperty(required=false)
	public String body;
	
	@JsonProperty(required=false)
	public Date sent;
	
	@JsonProperty(required=false)
	public Date opened;
	
	@JsonProperty(required=true)
	public long timeToLive;
	
	@JsonProperty(required=false)
	public String postBackUrl;
	
	@JsonProperty(required=false)
	public String deepLink;
	
	@JsonProperty(required=false)
	public List<String> errors;
	
	@JsonProperty(required=true)
	public volatile boolean encoded = false;

	public final Message encodeTitleAndBody() {
		if (encoded)
			return this;
		try {
			if (title != null) 
				title = encoder.encodeToString(title.getBytes(charset));
			if (body != null)
				body = encoder.encodeToString(body.getBytes(charset));
			encoded = true;
			return this;
		}catch(final Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public final Message decodeTitleAndBody() {
		if (!encoded)
			return this;
		try {
			if (title != null) 
				title = new String(decoder.decode(title), charset);
			if (body != null)
				body = new String(decoder.decode(body), charset);
			encoded = false;
			return this;
		}catch(final Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static enum Type{
		INBOX, PUSH, MAIL
	}
	public static enum Status{
		SENT, PENDING, OPENED, FAILED
	}

	
	@Override
	public final int hashCode() {
		return this.hashCode();
	}
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Message other = (Message) obj;
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
