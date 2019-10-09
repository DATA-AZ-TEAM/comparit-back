package com.pepit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DataProvidedException extends BusinessException {

	public DataProvidedException(String message) {
		super(message);
	}

	public DataProvidedException() {
		super();
	}

}