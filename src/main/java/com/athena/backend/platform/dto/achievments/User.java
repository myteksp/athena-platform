package com.athena.backend.platform.dto.achievments;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.gf.collections.GfCollections;
import com.gf.util.string.JSON;

@JsonInclude(value=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class User extends HashMap<String, Object>{
	private static final long serialVersionUID = 3221820175990740115L;
	
	public static final String USER_ID = "id";
	public static final String USER_NAME = "name";
	public static final String USER_AVATAR = "image";
	
	
	public User(final String userId, final String userName, final String userAvatar, final Map<String, Object> data) {
		super( 5 + data.size() );
		this.put(USER_ID, userId);
		this.put(USER_NAME, userName);
		this.put(USER_AVATAR, userAvatar);
		GfCollections.asArrayCollection(data.entrySet())
		.forEach(e->this.put(e.getKey(), e.getValue()));
	}
	
	public User() {}
	
	public final String getUserId() {
		return (String)this.get(USER_ID);
	}
	public final String getUserName() {
		return (String)this.get(USER_NAME);
	}
	public final String getAvatarUrl() {
		return (String)this.get(USER_AVATAR);
	}
	
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
