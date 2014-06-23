package com.andriox.remindme.restmodels;


public class ResponseTO {

	private String message;
	private Object responseBody;

	public ResponseTO() {

	}

	public ResponseTO(String message, Object responseBody) {
		this.message = message;
		this.responseBody = responseBody;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}

	@Override
	public String toString() {
		return "ResponseTO [message=" + message + ", responseBody="
				+ responseBody + "]";
	}

}
