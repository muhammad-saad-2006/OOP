package com.Library.Date;

public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		setDay(day);
		setMonth(month);
		setYear(year);		
	}
	public Date(Date other){
		setDay(other.day);
		setMonth(other.month);
		setYear(other.year);		
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Date other = (Date) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;  
	}
	
	public void setDay(int day){
		if(day < 1 || day > 31){
			System.out.println("Wrong credentials for day");
			return;
		}
		else
			this.day = day;
	}
	public int getDay(){
		return day;
	}

	public void setMonth(int month){
		if(month < 1 || month > 12){
			System.out.println("Wrong credentials for month");
			return;
		}
		else
			this.month = month;
	}
	public int getMonth(){
		return month;
	}

	public void setYear(int year){
		this.year = year;
	}
	public int getYear(){
		return year;
	}

	@Override
	public String toString() {
    		return String.format("%02d-%02d-%04d", day, month, year);
	}

}