package com.datetime.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DayforDate {

	private static String getDay(String day, int dayofweek) {
		switch (day.toUpperCase()) {
		case "SUNDAY":
			return getDayy(1 + dayofweek);
		case "MONDAY":
			return getDayy(2 + dayofweek);
		case "TUESDAY":
			return getDayy(3 + dayofweek);
		case "WEDNESDAY":
			return getDayy(4 + dayofweek);
		case "THURSDAY":
			return getDayy(5 + dayofweek);
		case "FRIDAY":
			return getDayy(6 + dayofweek);
		case "SATURDAY":
			return getDayy(7);
		default:
			return "Invalid day";
		}
	}

	private static String getDayy(int val) {

		switch (val % 7) {
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";
		case 3:
			return "TUESDAY";
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THURSDAY";
		case 6:
			return "FRIDAY";
		case 7:
			return "SATURDAY";
		default:
			return "null";
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Date in format `DD/MM/YYYY` : ");
		try {
			String dt = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(dt, formatter);
			int dayofyear = date.getDayOfYear();
			int dayofweek = dayofyear;
			while (dayofweek > 7) {
				dayofweek %= 7;
			}
			System.out.print("Day on 1st January: ");
			String day = sc.nextLine();
			String dayy = getDay(day, dayofweek - 1);
			System.out.println(dayy);
		} catch (DateTimeParseException e) {
			System.out.print("Entered date is not in a valid format.\n Please enter date in dd/mm/yyyy format");
		}
	}
}
