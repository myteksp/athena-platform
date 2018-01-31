package com.athena.backend.platform.dto.time;

import java.util.Date;

import com.athena.backend.platform.utils.TimeUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TimeEntity {
	public int year;
	public int month;
	public int day;
	public int weekDay;
	public int hour;
	public int minute;
	public int second;
	public int millisecond;
	public long timestamp;
	
	public TimeEntity(){}
	
	public TimeEntity(final long time){
		TimeUtil.convert(time, this);
	}
	
	public TimeEntity(final Date date){
		TimeUtil.convert(date, this);
	}
	
	public final TimeEntity previousDay() {
		return backward(86400000);
	}
	
	public final TimeEntity nextDay() {
		return forward(86400000);
	}
	
	public final TimeEntity backward(final long amount) {
		return new TimeEntity(this.timestamp - amount);
	}
	
	public final TimeEntity forward(final long amount) {
		return new TimeEntity(this.timestamp + amount);
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + hour;
		result = prime * result + millisecond;
		result = prime * result + minute;
		result = prime * result + month;
		result = prime * result + second;
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		result = prime * result + weekDay;
		result = prime * result + year;
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
		final TimeEntity other = (TimeEntity) obj;
		if (day != other.day)
			return false;
		if (hour != other.hour)
			return false;
		if (millisecond != other.millisecond)
			return false;
		if (minute != other.minute)
			return false;
		if (month != other.month)
			return false;
		if (second != other.second)
			return false;
		if (timestamp != other.timestamp)
			return false;
		if (weekDay != other.weekDay)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "TimeEntity [year=" + year + ", month=" + month + ", day=" + day + ", weekDay=" + weekDay + ", hour="
				+ hour + ", minute=" + minute + ", second=" + second + ", millisecond=" + millisecond + ", timestamp="
				+ timestamp + "]";
	}
}
