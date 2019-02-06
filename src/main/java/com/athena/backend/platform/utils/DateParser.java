package com.athena.backend.platform.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;


public final class DateParser {
	private static final DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	private static final DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
	private static final DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
	private static final DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd HH:mmZ");
	private static final DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	private static final DateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
	private static final DateFormat df7 = DateFormat.getDateInstance();
	
	public static final class ParseError extends RuntimeException{
		private static final long serialVersionUID = -7404723144765327740L;
		private final GfCollection<Throwable> errors;
		
		public ParseError(final GfCollection<Throwable> errors) {
			this.errors = errors;
		}
		
		public final List<Throwable> getErrors(){
			return errors;
		}
	}
	
	public static final Date parseWithThrow(final String str) {
		final GfCollection<Throwable> errors = GfCollections.asLinkedCollection();
		try {
			return df1.parse(str);
		}catch(final Throwable t) {
			errors.add(t);
			try {
				return df2.parse(str);
			}catch(final Throwable t1) {
				errors.add(t1);
				try {
					return df3.parse(str);
				}catch(final Throwable t2) {
					errors.add(t2);
					try {
						return df4.parse(str);
					}catch(final Throwable t3) {
						errors.add(t3);
						try {
							return df5.parse(str);
						}catch(final Throwable t4) {
							errors.add(t4);
							try {
								return df6.parse(str);
							}catch(final Throwable t5) {
								errors.add(t5);
								try {
									return df7.parse(str);
								}catch(final Throwable t6) {
									errors.add(t6);
									try {
										return new Date(Long.parseLong(str));
									}catch(final Throwable t7) {
										errors.add(t7);
										throw new ParseError(errors);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
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
