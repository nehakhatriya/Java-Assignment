package com.datetime.java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAlive {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter date in dd/MM/yyyy format : ");
    String dt=sc.nextLine();
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date=LocalDate.parse(dt,formatter);
    Period period=Period.between(date, LocalDate.now());
    System.out.print(period.getYears()+" "+period.getMonths()+" "+period.getDays());

	}

}
