package com.vivala.analytics.client;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;
import com.gf.collections.GfMap;
import com.gf.http.GenericHttpEndpoint;
import com.gf.http.HttpEndpointCreator;
import com.gf.util.string.JSON;
import com.gf.util.string.MC;
import com.vivala.analytics.client.Event.Kind;

public final class AnalyticsClient implements Closeable{
	private final String projectId;
	private final String instanceId;
	private final HttpEndpointCreator httpEndpoint;
	private final GenericHttpEndpoint endpoint;
	private final GenericHttpEndpoint dataEndPoint;
	private final GenericHttpEndpoint scheduledEndPoint;


	public AnalyticsClient(final String projectId) {
		this.instanceId = projectId + "__" + UUID.randomUUID().toString();
		this.projectId = projectId;
		this.httpEndpoint = new HttpEndpointCreator();
		this.endpoint = this.httpEndpoint.getGenericEndPoint("https://vivala-analytics.herokuapp.com/events/");
		this.dataEndPoint = this.httpEndpoint.getGenericEndPoint("https://vivala-analytics.herokuapp.com/userData/");
		this.scheduledEndPoint = this.httpEndpoint.getGenericEndPoint("https://vivala-analytics.herokuapp.com/schedules/");
		instances.put(instanceId, this);
		synchronized (instances) {
			if (executor == null) {
				executor = Executors.newFixedThreadPool(3, new ThreadFactory() {
					@Override
					public final Thread newThread(final Runnable r) {
						final Thread t = new Thread(r);
						t.setName("AnalyticsThread-" + UUID.randomUUID().toString());
						return t;
					}
				});
			}
		}
	}

	@Override
	public final void close() throws IOException {
		instances.remove(instanceId);
		httpEndpoint.close();
		synchronized (instances) {
			if (instances.isEmpty()) {
				final ExecutorService e = executor;
				executor = null;
				if (e != null) {
					for(final Runnable r : e.shutdownNow()) {
						try {
							r.run();
						}catch(final Throwable t) {}
					}
				}
			}
		}
	}
	
	public final void updateUserData(final String userId, final Map<String, Object> params) {
		if (params.isEmpty())
			return;
		
		final AnalyticsUserData data = new AnalyticsUserData();
		data.user_id = userId;
		data.project_id = projectId;
		data.data = params;
		run(new Runnable() {
			@Override
			public final void run() {
				dataEndPoint.post("update", data, Response.class);
			}
		});
	}
	
	public final TimeEventBuilder timeEvent(final String session, final String ip, final String type) {
		final Event _event = new Event();
		_event.project_id = projectId;
		_event.session_id = session;
		_event.ip = ip;
		_event.type = type;
		_event.kind = Kind.START;
		return new TimeEventBuilder() {
			private final Event event = _event;
			@Override
			public final TimeEventBuilder setUser(final String user) {event.user_id = user;return this;}
			@Override
			public final TimeEventBuilder setPlatform(final String platform) {event.platform = platform;return this;}
			@Override
			public final TimeEventBuilder setLoginType(final String loginType) {event.login_type = loginType;return this;}
			@Override
			public final TimeEventBuilder setType(final String type) {event.type = type;return this;}
			@Override
			public final TimeEventBuilder setGeo(final double lat, final double lon) {
				event.latitude = lat;
				event.longtitude = lon;
				return this;
			}
		
			@Override
			public final TimeEventBuilder addSubType(final String subType) {
				if (event.sub_type_1 == null) {
					event.sub_type_1 = subType;
					return this;
				}
				if (event.sub_type_2 == null) {
					event.sub_type_2 = subType;
					return this;
				}
				if (event.sub_type_3 == null) {
					event.sub_type_3 = subType;
					return this;
				}
				if (event.sub_type_4 == null) {
					event.sub_type_4 = subType;
					return this;
				}
				if (event.sub_type_5 == null) {
					event.sub_type_5 = subType;
					return this;
				}
				throw new RuntimeException("Maximum amount of subtypes (5) has been set.");
			}
			@Override
			public final TimeEventBuilder addStringParam(final String param) {
				if (event.param_1 == null) {
					event.param_1 = param;
					return this;
				}
				if (event.param_2 == null) {
					event.param_2 = param;
					return this;
				}
				if (event.param_3 == null) {
					event.param_3 = param;
					return this;
				}
				if (event.param_4 == null) {
					event.param_4 = param;
					return this;
				}
				if (event.param_5 == null) {
					event.param_5 = param;
					return this;
				}
				throw new RuntimeException("Maximum amount of string params (5) has been set.");
			}
			@Override
			public final TimeEventBuilder addLongParam(final long param) {
				if (event.long_param_1 == null) {
					event.long_param_1 = param;
					return this;
				}
				if (event.long_param_2 == null) {
					event.long_param_2 = param;
					return this;
				}
				if (event.long_param_3 == null) {
					event.long_param_3 = param;
					return this;
				}
				throw new RuntimeException("Maximum amount of long params (3) has been set.");
			}
			@Override
			public final TimeEventBuilder addDoubleParam(final double param) {
				if (event.double_param_1 == null) {
					event.double_param_1 = param;
					return this;
				}
				if (event.double_param_2 == null) {
					event.double_param_2 = param;
					return this;
				}
				if (event.double_param_3 == null) {
					event.double_param_3 = param;
					return this;
				}
				throw new RuntimeException("Maximum amount of double params (3) has been set.");
			}
			@Override
			public final TimeEventBuilder setCountry(final String country) {event.country = country;return this;}
			@Override
			public final TimeEventBuilder setCity(final String city) {event.city = city;return this;}
			@Override
			public final EventEnder send(final EventReviewer reviewer) {reviewer.review(event); return this.send();}
			@Override
			public final EventEnder send() {
				return new EventEnder() {
					private final AtomicBoolean set = new AtomicBoolean(false);
					private final AtomicBoolean isEnded = new AtomicBoolean(false);
					private volatile String eventId = null;
					private final EventIncrementer inc = sendEvent(event, new OnResponse() {
						@Override
						public final void onResponse(final String id) {
							eventId = event.id = id;
							set.set(true);
							if (isEnded.get()) {
								endEvent(id);
							}
						}
					});
					@Override
					public final void increment() {
						inc.increment();
					}
					
					@Override
					public final void end() {
						if (set.get()) {
							endEvent(eventId);
						} else {
							isEnded.set(true);
						}
					}
				};
			}
			@Override
			public final EventEnder send(final OnResponse ack) {
				return new EventEnder() {
					private final AtomicBoolean set = new AtomicBoolean(false);
					private final AtomicBoolean isEnded = new AtomicBoolean(false);
					private volatile String eventId = null;
					private final EventIncrementer inc = sendEvent(event, new OnResponse() {
						@Override
						public final void onResponse(final String id) {
							eventId = event.id = id;
							set.set(true);
							if (isEnded.get()) {
								endEvent(id);
							}
							ack.onResponse(id);
						}
					});
					@Override
					public final void increment() {
						inc.increment();
					}
					
					@Override
					public final void end() {
						if (set.get()) {
							endEvent(eventId);
						} else {
							isEnded.set(true);
						}
					}
				};
			}
			@Override
			public final EventEnder send(final EventReviewer reviewer, final OnResponse ack) {reviewer.review(event);return send(ack);}
			@Override
			public final Event getEvent() {return event;}
		};
	}

	public final SingleEventBuilder event(final String session, final String ip, final String type) {
		final Event _event = new Event();
		_event.project_id = projectId;
		_event.session_id = session;
		_event.ip = ip;
		_event.type = type;
		_event.kind = Kind.SINGLE;
		return new SingleEventBuilder() {
			private final Event event = _event;
			@Override
			public final SingleEventBuilder setUser(final String user) {event.user_id = user;return this;}
			@Override
			public final SingleEventBuilder setPlatform(final String platform) {event.platform = platform;return this;}
			@Override
			public final SingleEventBuilder setLoginType(final String loginType) {event.login_type = loginType;return this;}
			@Override
			public final SingleEventBuilder setType(final String type) {event.type = type;return this;}
			@Override
			public final SingleEventBuilder setGeo(final double lat, final double lon) {
				event.latitude = lat;
				event.longtitude = lon;
				return this;
			}
			@Override
			public final SingleEventBuilder addSubType(final String subType) {
				if (event.sub_type_1 == null) {
					event.sub_type_1 = subType;
					return this;
				}
				if (event.sub_type_2 == null) {
					event.sub_type_2 = subType;
					return this;
				}
				if (event.sub_type_3 == null) {
					event.sub_type_3 = subType;
					return this;
				}
				if (event.sub_type_4 == null) {
					event.sub_type_4 = subType;
					return this;
				}
				if (event.sub_type_5 == null) {
					event.sub_type_5 = subType;
					return this;
				}
				throw new RuntimeException("Maximum amount of subtypes (5) has been set.");
			}
			@Override
			public final SingleEventBuilder addStringParam(final String param) {
				if (event.param_1 == null) {
					event.param_1 = param;
					return this;
				}
				if (event.param_2 == null) {
					event.param_2 = param;
					return this;
				}
				if (event.param_3 == null) {
					event.param_3 = param;
					return this;
				}
				if (event.param_4 == null) {
					event.param_4 = param;
					return this;
				}
				if (event.param_5 == null) {
					event.param_5 = param;
					return this;
				}
				throw new RuntimeException("Maximum amount of string params (5) has been set.");
			}
			@Override
			public final SingleEventBuilder addLongParam(final long param) {
				if (event.long_param_1 == null) {
					event.long_param_1 = param;
					return this;
				}
				if (event.long_param_2 == null) {
					event.long_param_2 = param;
					return this;
				}
				if (event.long_param_3 == null) {
					event.long_param_3 = param;
					return this;
				}
				throw new RuntimeException("Maximum amount of long params (3) has been set.");
			}
			@Override
			public final SingleEventBuilder addDoubleParam(final double param) {
				if (event.double_param_1 == null) {
					event.double_param_1 = param;
					return this;
				}
				if (event.double_param_2 == null) {
					event.double_param_2 = param;
					return this;
				}
				if (event.double_param_3 == null) {
					event.double_param_3 = param;
					return this;
				}
				throw new RuntimeException("Maximum amount of double params (3) has been set.");
			}
			@Override
			public final SingleEventBuilder setCountry(final String country) {event.country = country;return this;}
			@Override
			public final SingleEventBuilder setCity(final String city) {event.city = city;return this;}
			@Override
			public final EventIncrementer send(final EventReviewer reviewer) {reviewer.review(event); return this.send();}
			@Override
			public final EventIncrementer send() {return sendEvent(event, new OnResponse() {@Override public final void onResponse(final String id) {}});}
			@Override
			public final EventIncrementer send(final OnResponse ack) {return sendEvent(event, ack);}
			@Override
			public final EventIncrementer send(final EventReviewer reviewer, final OnResponse ack) {reviewer.review(event);return sendEvent(event, ack);}
			@Override
			public final Event getEvent() {return event;}
			@Override
			public final void sendAsync() {sendEvent(event);}
		};
	}
	
	
	public final void updateScheduledItem(final long scheduled, final String type, final String id, final String name, final String param) {
		run(new Runnable() {
			@Override
			public final void run() {
				final ScheduledItem item = new ScheduledItem();
				item.id = id;
				item.type = type;
				item.itemId = id;
				item.itemName = name;
				item.itemParam = param;
				item.scheduled = scheduled;
				item.project = projectId;
				updateScheduledItem(item);
			}
		});
	}
	
	public final Event update(final Event event) {
		return update(GfCollections.asLinkedCollection(event)).findFirst();
	}
	
	public final GfCollection<Event> update(final List<Event> events) {
		final GfMap<String, GfCollection<Response>> responses = GfCollections.wrapAsCollection(endpoint.post("update", GfCollections.wrapAsCollection(events).map(e->ensure(e)), _responseList.class))
				.groupBy(r->r.id);
		return GfCollections.wrapAsCollection(events)
				.flatMap(e->{
					if (responses.containsKey(e.id)) {
						return GfCollections.asLinkedCollection(e);
					}else {
						System.out.println("FAILED TO UPDATE EVENT: " + JSON.toJson(e));
						return GfCollections.asLinkedCollection();
					}
				});
	}
	public static final class _responseList extends ArrayList<Response> implements List<Response>{
		private static final long serialVersionUID = -870089679582249124L;
	}
	
	public final GfCollection<Event> getEvents(final List<String> eventIds) {
		return GfCollections.wrapAsCollection(endpoint.get("getbyId?" + GfCollections.wrapAsCollection(eventIds).map(id->"id=" + id).join("&"), _eventsList.class));
	}
	
	public final GfCollection<Event> listAll(final int page, final int size) {
		return GfCollections.wrapAsCollection(endpoint.get(MC.fmt("listAll?page=${0}&size=${1}", page, size), _eventsList.class));
	}
	
	public final GfCollection<Event> listAll(final String country, final int page, final int size) {
		return GfCollections.wrapAsCollection(endpoint.get(MC.fmt("listAllByCountry?country=${2}&page=${0}&size=${1}", page, size, country), _eventsList.class));
	}
	
	public static final class _eventsList extends ArrayList<Event> implements List<Event>{
		private static final long serialVersionUID = 1180624203516037788L;
	}
	
	private final String updateScheduledItem(final ScheduledItem item) {
		return scheduledEndPoint.post("update", item, Response.class).id;
	}
	
	private final void sendEvent(final Event event) {
		if (event.project_id == null)
			throw new RuntimeException("project_id can't be null");
		if (event.type == null)
			throw new RuntimeException("type can't be null");
		event.id = null;
		run(new Runnable() {
			@Override
			public final void run() {
				endpoint.post("eventAsync", ensure(event), Response.class);
			}
		});
	}

	private final EventIncrementer sendEvent(final Event event, final OnResponse handler) {
		if (event.project_id == null)
			throw new RuntimeException("project_id can't be null");
		if (event.type == null)
			throw new RuntimeException("type can't be null");
		
		event.id = null;
		final AtomicBoolean set = new AtomicBoolean(false);
		final AtomicLong counter = new AtomicLong(0);
		run(new Runnable() {
			@Override
			public final void run() {
				final String id = endpoint.post("event", ensure(event), Response.class).id;
				event.id = id;
				set.set(true);
				final long count = counter.getAndSet(0);
				for (long i = 0; i < count; i++) {
					AnalyticsClient.this.increment(id);
				}
				handler.onResponse(id);
			}
		});
		return new EventIncrementer() {
			@Override
			public final EventIncrementer increment() {
				if (set.get()) {
					AnalyticsClient.this.increment(event.id);
				} else {
					counter.incrementAndGet();
				}
				return this;
			}
		};
	}
	
	private static final Event ensure(final Event event) {
		if (event.double_param_1 != null) {
			if (event.double_param_1.isInfinite() || event.double_param_1.isNaN()) {
				event.double_param_1 = null;
			}
		}
		if (event.double_param_2 != null) {
			if (event.double_param_2.isInfinite() || event.double_param_2.isNaN()) {
				event.double_param_2 = null;
			}
		}
		if (event.double_param_3 != null) {
			if (event.double_param_3.isInfinite() || event.double_param_3.isNaN()) {
				event.double_param_3 = null;
			}
		}
		if (event.latitude != null) {
			if (event.latitude.isInfinite() || event.latitude.isNaN()) {
				event.latitude = null;
			}
		}
		if (event.longtitude != null) {
			if (event.longtitude.isInfinite() || event.longtitude.isNaN()) {
				event.longtitude = null;
			}
		}
		return event;
	}

	private final void endEvent(final String eventId) {
		run(new Runnable() {
			@Override
			public final void run() {
				endpoint.get("end?id=" + eventId, Response.class);
			}
		});
	}

	private final void increment(final String eventId) {
		run(new Runnable() {
			@Override
			public final void run() {
				endpoint.get("increment?id=" + eventId, Response.class);
			}
		});
	}


	private static final void run(final Runnable r) {
		final ExecutorService e = executor;
		if (e == null)
			throw new RuntimeException("Executor is down.");
		e.execute(new Runnable() {
			private final Runnable runable = r;
			@Override
			public final void run() {
				try {
					runable.run();
				}catch(final Throwable t) {
					t.printStackTrace();
				}
			}
		});
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instanceId == null) ? 0 : instanceId.hashCode());
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
		final AnalyticsClient other = (AnalyticsClient) obj;
		if (instanceId == null) {
			if (other.instanceId != null)
				return false;
		} else if (!instanceId.equals(other.instanceId))
			return false;
		return true;
	}

	@Override
	public final String toString() {
		return "AnalyticsClient [instanceId=" + instanceId + "]";
	}

	public static interface OnResponse{
		void onResponse(final String id);
	}

	private static final ConcurrentHashMap<String, AnalyticsClient> instances = new ConcurrentHashMap<String, AnalyticsClient>();
	private static volatile ExecutorService executor = null;
}
