package com.athena.backend.platform.dto.events;

public final class EventDeliveredNotification {
	public String eventId;
	public long timeStamp;
	
	public EventDeliveredNotification(){}
	
	public EventDeliveredNotification(final String eventId, final long timeStamp){
		this.eventId = eventId;
		this.timeStamp = timeStamp;
	}
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + (int) (timeStamp ^ (timeStamp >>> 32));
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
		final EventDeliveredNotification other = (EventDeliveredNotification) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (timeStamp != other.timeStamp)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "EventDeliveredNotification [eventId=" + eventId + ", timeStamp=" + timeStamp + "]";
	}
}
