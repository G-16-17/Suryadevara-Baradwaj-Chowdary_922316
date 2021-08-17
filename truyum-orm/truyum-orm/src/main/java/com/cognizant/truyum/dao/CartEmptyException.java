package com.cognizant.truyum.dao;

import java.lang.Exception;

public class CartEmptyException extends Exception {

	public CartEmptyException() {
	}

	public CartEmptyException(String message) {
		super(message);
	}

	public CartEmptyException(Throwable cause) {
		super(cause);
	}

	public CartEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public CartEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
