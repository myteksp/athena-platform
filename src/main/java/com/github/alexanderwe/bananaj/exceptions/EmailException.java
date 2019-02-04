/**
 * @author alexanderweiss
 * @date 05.12.2015
 */
package com.github.alexanderwe.bananaj.exceptions;

public class EmailException extends Exception {
	private static final long serialVersionUID = -980183252796168989L;

	public EmailException()  {
		super("Invalid email address.");
	}

	public EmailException(String message) {
		super("Invalid email address: " + message);
	}

	public EmailException(Throwable cause) {
		super(cause);
	}

	public EmailException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
