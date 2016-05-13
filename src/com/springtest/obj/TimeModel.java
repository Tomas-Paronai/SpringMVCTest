package com.springtest.obj;

import java.util.Date;

public class TimeModel {
	
	private String clock;
	private String date;
	

	public TimeModel(Date date){
		long millis = date.getTime();
		long seconds = millis / 1000;
		
		long minutes = seconds / 60;
		seconds -= minutes * 60;
		
		long hours = minutes / 60;
		minutes -= hours * 60;
		
		clock = hours + ":" + minutes + ":" +seconds;
	}

	public String getClock() {
		return clock;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
