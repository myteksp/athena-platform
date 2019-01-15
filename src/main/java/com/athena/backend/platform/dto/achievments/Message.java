package com.athena.backend.platform.dto.achievments;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.gf.util.string.JSON;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Message {
	private static final String charset = "UTF-8";
	private static final Encoder encoder = Base64.getUrlEncoder();
	private static final Decoder decoder = Base64.getUrlDecoder();

	public String id;
	public String userId;
	public Type type;
	public Status status;
	public String title;
	public String body;
	public Date sent;
	public Date opened;
	public String postBackUrl;
	public String deepLink;
	public List<String> errors;
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
