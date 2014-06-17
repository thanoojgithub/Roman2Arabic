package com.exceptions;

public class NonValidRomanException extends Exception {

	private static final long serialVersionUID = 33253695328326497L;

	public NonValidRomanException(String msg) {
		super(msg);
	}

}
