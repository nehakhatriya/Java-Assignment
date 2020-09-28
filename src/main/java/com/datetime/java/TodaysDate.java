package com.datetime.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TodaysDate {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print(formatter.format(date));
		DayOfWeek day=date.getDayOfWeek();
		Month month=date.getMonth();
		int dt=date.getDayOfMonth();
		int year=date.getYear();
		System.out.print(day+", "+month+" "+dt+", "+year);
		

	}

}
