package com.common;

public enum Arabic {
	ONE(1), FIVE(5), TEN(10), FIFTY(50), HUNDRED(100), FIVEHUNDRED(500), THOUSAND(1000);

	Arabic(int arabic) {
		value = arabic;
	}

	private int value;

	public int getValue() {
		return value;
	}

}