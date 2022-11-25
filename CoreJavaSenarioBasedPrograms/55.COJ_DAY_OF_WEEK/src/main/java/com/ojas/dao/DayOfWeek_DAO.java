package com.ojas.dao;

public interface DayOfWeek_DAO {

	public String getNextDay(String dayName);
	public String getPrevious(String dayName);
	public String addToCurrentDay(int noOfDays,String dayName);
	
}
