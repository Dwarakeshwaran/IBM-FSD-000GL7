package com.practice;

public class MyDate {
	private int day;
	private int month;
	@SuppressWarnings("unused")
	private int year;
	
	public boolean getDay() {
		//System.out.println("Day : "+day);
		if(day>31) {
			System.out.println("Invalid Day");
			return false;
		}
		else
			return true;
	}
	
	public boolean getMonth() {
		//System.out.println("Month : "+month);
		if(month>13){
			System.out.println("Invalid Month");
			return false;
		}
		else
			return true;
	}

	public boolean getYear() {
		return true;
	}
	
	public void setDay(int d) {
			day = d; 	
	}
	
	public void setMonth(int m) {
	
			month = m;
		
	}

	public void setYear(int y) {
		year = y;
	}
}
