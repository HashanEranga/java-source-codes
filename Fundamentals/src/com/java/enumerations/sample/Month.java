package com.java.enumerations.sample;

public enum Month {
	
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(31), JULY(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	private int daysAmount;
	
	private Month(int daysAmount) {
		this.daysAmount = daysAmount;
	}
	
	public int getDaysAmount() {
		return this.daysAmount;
	}

}
