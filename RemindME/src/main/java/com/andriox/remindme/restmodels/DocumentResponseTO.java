package com.andriox.remindme.restmodels;

import org.springframework.stereotype.Component;

@Component
public class DocumentResponseTO {

	private String message;

	public DocumentResponseTO() {

	}

	public DocumentResponseTO(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
