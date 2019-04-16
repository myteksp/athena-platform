package com.vivala.data.transformers;

public final class AppLaunchDescriptor {
	public final String user_id;
	public final String country;
	public final String city;
	public final String platform;
	public final long time;
	
	public AppLaunchDescriptor(final String user_id, final String country, final String city, final String platform, final long time) {
		this.user_id = user_id;
		this.country = country;
		this.city = city;
		this.platform = platform;
		this.time = time;
	}
}
