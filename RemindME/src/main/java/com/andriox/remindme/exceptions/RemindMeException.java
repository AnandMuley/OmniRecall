package com.andriox.remindme.exceptions;

public class RemindMeException extends Exception {

	private static final long serialVersionUID = 1638667496875958289L;

	public RemindMeException(String message, Throwable th) {
		super(message, th);
	}

}
