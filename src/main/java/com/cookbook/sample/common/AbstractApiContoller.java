package com.cookbook.sample.common;

import com.cookbook.sample.dto.BooleanResponse;

public abstract class AbstractApiContoller {

	public BooleanResponse respond(boolean success) {
		return respond(success, success ? "Operation success" : "Operation failed");
	}

	public BooleanResponse respond(boolean success, String message) {
		return new BooleanResponse(success, message);
	}

	public BooleanResponse success() {
		return respond(true);
	}

	public BooleanResponse failure() {
		return respond(false);
	}

	public BooleanResponse success(String message) {
		return respond(true, message);
	}

	public BooleanResponse failure(String message) {
		return respond(false, message);
	}

}
