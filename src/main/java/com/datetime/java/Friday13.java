package com.datetime.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Friday13 {

	private static ArrayList<LocalDate> fridays=new ArrayList<LocalDate>();
	public static void main(String[] args) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate firstDate=LocalDate.parse("01/01/2000",formatter);
		LocalDate lastDate=LocalDate.parse("31/12/2999",formatter);
		
		while(firstDate.isBefore(lastDate))
		{
			if(firstDate.getDayOfWeek()==DayOfWeek.FRIDAY && firstDate.getDayOfMonth()==13) {
				fridays.add(firstDate);
			}
			firstDate=firstDate.plusDays(1);
		}
		fridays.forEach(System.out::println);
	}
}
