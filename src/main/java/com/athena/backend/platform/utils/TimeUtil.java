package com.athena.backend.platform.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.athena.backend.platform.dto.time.TimeEntity;

public final class TimeUtil {
	
	public static final String formatTime(final Date time) {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").format(time);
	}

	public static final String formatTime(final long time) {
		return formatTime(new Date(time));
	}
	
	public final String formatTime(final TimeEntity time) {
		return formatTime(time.timestamp);
	}
	
	public static final String formatDay(final int dayOrMonth){
		final int abs = Math.abs(dayOrMonth);
		if (abs > 31)
			throw new RuntimeException("Illigal date format.");
		
		if (abs < 10)
			return "0" + Integer.toString(abs);
		return Integer.toString(abs);
	}
	
	public static final String formatMonth(final int dayOrMonth){
		final int abs = Math.abs(dayOrMonth) + 1;
		if (abs > 12)
			throw new RuntimeException("Illigal date format.");
		
		if (abs < 10)
			return "0" + Integer.toString(abs);
		return Integer.toString(abs);
	}
	
	public static final TimeEntity convert(final long milliseconds, final TimeEntity target){
		return convert(new Date(milliseconds), target);
	}
	
	public static final TimeEntity convert(final Date date, final TimeEntity target){
		populate(date, target);
		return target;
	}
	
	public static final TimeEntity convert(final long milliseconds){
		return convert(new Date(milliseconds));
	}
	
	public static final TimeEntity convert(final Date date){
		final TimeEntity res = new TimeEntity();
		populate(date, res);
		return res;
	}
	
	private static final void populate(final Date date, final TimeEntity target){
		final Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		target.year = calendar.get(Calendar.YEAR);
		target.month = calendar.get(Calendar.MONTH);
		target.day = calendar.get(Calendar.DAY_OF_MONTH);
		target.weekDay = calendar.get(Calendar.DAY_OF_WEEK);
		target.hour = calendar.get(Calendar.HOUR_OF_DAY);
		target.minute = calendar.get(Calendar.MINUTE);
		target.second = calendar.get(Calendar.SECOND);
		target.millisecond = calendar.get(Calendar.MILLISECOND);
		target.timestamp = date.getTime();
		target.date = date;
	}
}
