package com.common;

public enum Roman {
	I("I"), V("V"), X("X"), L("L"), C("C"), D("D"), M("M");

	Roman(String romam) {
		value = romam;
	}

	private String value;

	public String getValue() {
		return value;
	}
}