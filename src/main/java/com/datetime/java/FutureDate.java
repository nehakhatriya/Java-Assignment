package com.datetime.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class Datee{
	private LocalDate date;
	public boolean getDate(String dt) {
    try {			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    date=LocalDate.parse(dt,formatter);
			return true;
		}
		catch (DateTimeParseException e) {
			System.out.print("Entered date is not in a valid format.\n Please enter date in dd/mm/yyyy format");
			return false;
		}
	}
	void getNewDate(int daysToAdd) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate newdate=date.plusDays(daysToAdd);
		System.out.print("Future Date : "+formatter.format(newdate));
		
	}
}
public class FutureDate {

	public static void main(String[] args) {
		System.out.print(" Enter the date in (dd/mm/yyyy) format: ");
		Scanner sc=new Scanner(System.in);
		String dt=sc.nextLine();
		Datee date=new Datee();
		boolean b=date.getDate(dt);
		if(b) {			
			System.out.println("Entered Date: "+dt);
			System.out.print("Enter number of days after which future date is to be found: ");
			int daysToAdd=sc.nextInt();
			date.getNewDate(daysToAdd);
		}
		
	}

}

