package com.datetime.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args){
		
		try {
					
			Scanner sc=new Scanner(System.in);
			System.out.print("/Enter any date in 8 digits (ddmmyyyy) format: ");
			String dt=sc.nextLine();
			if(dt.length()!=8) {
				throw new Exception("Wrong input");
			}
			String datee=""+dt.charAt(0)+dt.charAt(1)+"/"+dt.charAt(2)+dt.charAt(3)+"/"+dt.charAt(4)+dt.charAt(5)+dt.charAt(6)+dt.charAt(7);
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date=LocalDate.parse(datee.trim(),formatter);
			System.out.println("Date in dd/mm/yyyy format = "+datee);
			if(date.getDayOfMonth()>10)
				System.out.println("Date in dd, month name, yyyy format = "+date.getDayOfMonth()+" "+date.getMonth()+", "+date.getYear());
			else
				System.out.println("Date in dd, month name, yyyy format = "+"0"+date.getDayOfMonth()+" "+date.getMonth()+", "+date.getYear()); 
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}

}
}
