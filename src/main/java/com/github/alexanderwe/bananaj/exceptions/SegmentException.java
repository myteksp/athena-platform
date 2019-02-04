package com.github.alexanderwe.bananaj.exceptions;

/**
 * Created by alexanderweiss on 27.12.16.
 */
public class SegmentException extends Exception {
	private static final long serialVersionUID = 8957416940413157479L;

	public SegmentException() {
        super("A member can only be added to a static segment.");
    }

    public SegmentException(String message) {
        super(message);
    }

    public SegmentException(Throwable cause) {
        super(cause);
    }

    public SegmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public SegmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
