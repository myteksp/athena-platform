package com.athena.backend.platform.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public final class DateParser {
	private static final DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	private static final DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
	private static final DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
	private static final DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd HH:mmZ");
	private static final DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	private static final DateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
	private static final DateFormat df7 = DateFormat.getDateInstance();
	
	
	public static final Date parse(final String str) {
		if (str == null)
			return new Date();
		
		try {
			return df1.parse(str);
		}catch(final Throwable t) {
			try {
				return df2.parse(str);
			}catch(final Throwable t1) {
				try {
					return df3.parse(str);
				}catch(final Throwable t2) {
					try {
						return df4.parse(str);
					}catch(final Throwable t3) {
						try {
							return df5.parse(str);
						}catch(final Throwable t4) {
							try {
								return df6.parse(str);
							}catch(final Throwable t5) {
								try {
									return df7.parse(str);
								}catch(final Throwable t6) {
									try {
										return new Date(Long.parseLong(str));
									}catch(final Throwable t7) {
										return new Date();
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
