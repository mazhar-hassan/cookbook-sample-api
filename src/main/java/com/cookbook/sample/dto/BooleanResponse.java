package com.cookbook.sample.dto;

import com.cookbook.sample.common.Transferable;

public class BooleanResponse implements Transferable {
	private boolean success;
	private String message;

	public BooleanResponse() {
		super();
	}

	public BooleanResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
