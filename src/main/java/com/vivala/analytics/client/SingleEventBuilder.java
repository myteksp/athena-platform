package com.vivala.analytics.client;

import com.vivala.analytics.client.AnalyticsClient.OnResponse;

public interface SingleEventBuilder {
	Event getEvent();
	SingleEventBuilder setPlatform(final String platform);
	SingleEventBuilder setUser(final String user);
	SingleEventBuilder setLoginType(final String loginType);
	SingleEventBuilder setCountry(final String country);
	SingleEventBuilder setCity(final String city);
	SingleEventBuilder setType(final String type);
	SingleEventBuilder setGeo(final double lat, final double lon);
	
	SingleEventBuilder addSubType(final String subType);
	SingleEventBuilder addStringParam(final String param);
	SingleEventBuilder addLongParam(final long param);
	SingleEventBuilder addDoubleParam(final double param);
	
	EventIncrementer send();
	EventIncrementer send(final EventReviewer reviewer);
	EventIncrementer send(final OnResponse ack);
	EventIncrementer send(final EventReviewer reviewer, final OnResponse ack);
}
