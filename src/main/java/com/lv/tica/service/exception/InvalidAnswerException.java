package com.lv.tica.service.exception;

public class InvalidAnswerException extends Exception {

	private static final long serialVersionUID = -7737804958847820056L;
	
	public InvalidAnswerException() {
		super();
	}

	public InvalidAnswerException(String message) {
		super(message);
	}
	
	public InvalidAnswerException(Throwable t) {
		super(t);
	}
	
}
