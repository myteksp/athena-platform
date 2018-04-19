package com.vivala.analytics.client;

import com.vivala.analytics.client.AnalyticsClient.OnResponse;

public interface TimeEventBuilder {
	Event getEvent();
	TimeEventBuilder setPlatform(final String platform);
	TimeEventBuilder setUser(final String user);
	TimeEventBuilder setLoginType(final String loginType);
	TimeEventBuilder setCountry(final String country);
	TimeEventBuilder setCity(final String city);
	TimeEventBuilder setType(final String type);
	
	TimeEventBuilder addSubType(final String subType);
	TimeEventBuilder addStringParam(final String param);
	TimeEventBuilder addLongParam(final long param);
	TimeEventBuilder addDoubleParam(final double param);
	
	EventEnder send();
	EventEnder send(final EventReviewer reviewer);
	EventEnder send(final OnResponse ack);
	EventEnder send(final EventReviewer reviewer, final OnResponse ack);
}
