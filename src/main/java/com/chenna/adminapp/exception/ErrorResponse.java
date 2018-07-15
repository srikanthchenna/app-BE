package com.chenna.adminapp.exception;

public class ErrorResponse {

	private String message;
	private Throwable exception;

	public ErrorResponse(Throwable exception) {
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getException() {
		return exception;
	}

	public void setException(Throwable exception) {
		this.exception = exception;
	}

}
