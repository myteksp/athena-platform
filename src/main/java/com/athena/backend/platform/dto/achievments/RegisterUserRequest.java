package com.athena.backend.platform.dto.achievments;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RegisterUserRequest {
	public User user;
	public String secret;
	public RegisterUserRequest(final String secret, final String userId, final String userName, final String userAvatar, final Map<String, Object> data) {
		this.secret = secret;
		this.user = new User(userId, userName, userAvatar, data);
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((secret == null) ? 0 : secret.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		final RegisterUserRequest other = (RegisterUserRequest) obj;
		if (secret == null) {
			if (other.secret != null)
				return false;
		} else if (!secret.equals(other.secret))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "RegisterUserRequest [user=" + user + ", secret=" + secret + "]";
	}
}
