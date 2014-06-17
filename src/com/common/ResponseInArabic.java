package com.common;

import com.exceptions.NonValidRomanException;

public class ResponseInArabic {

	private int arabic;
	private NonValidRomanException exception;

	public ResponseInArabic(int arabic, NonValidRomanException exception) {
		super();
		this.arabic = arabic;
		this.exception = exception;
	}

	public int getArabic() {
		return arabic;
	}

	public void setArabic(int arabic) {
		this.arabic = arabic;
	}

	public NonValidRomanException getException() {
		return exception;
	}

	public void setException(NonValidRomanException exception) {
		this.exception = exception;
	}

}
