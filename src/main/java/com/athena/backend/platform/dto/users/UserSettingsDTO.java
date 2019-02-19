package com.athena.backend.platform.dto.users;

import com.gf.util.string.JSON;

public final class UserSettingsDTO {
	public HomeSceenWidget homeWidget;
	public String homeWidgetParam;
	public String homeWidgetImageUrl;
	
	public static enum HomeSceenWidget{
		MINIGAME, APP_PAGE
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
		final UserSettingsDTO other = (UserSettingsDTO) obj;
		return this.toString().equals(other.toString());
	}
	@Override
	public final String toString() {
		return JSON.toJson(this);
	}
}
