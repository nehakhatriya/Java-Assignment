package com.assigment6.java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {

	private String name;
	private LocalDate dob; 
    public Person(String n, int d, int m, int y)
	{ 
    	name=n;
    	dob=LocalDate.of(y,m,d);
	}
	public String getName() {
		return name;
	}
	
	public String getDob() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(dob);
	}
	
	private String getAge() {
		LocalDate currentDate= LocalDate.now();
		int days=currentDate.getDayOfMonth()-dob.getDayOfMonth();
		int months=currentDate.getMonthValue()-dob.getMonthValue();
		int years=currentDate.getYear()-dob.getYear();
		return ("Age: "+years+" years "+months+" months "+days+" days ");
	}
	public void display()
	{    System.out.println("Person details: ");
	     System.out.println("Name: "+name);
	     System.out.println("Date Of Birth: "+getDob());
	     System.out.println(getAge());
	}
	public String olderOne(Person p) //method to identify the older of the two persons.
	{   
		if(this.dob.isBefore(p.dob)) {
			Period period=Period.between(this.dob,p.dob);
			return (this.name+" is older than "+p.name+" by "+period.getYears()+" Years, "+period.getMonths()+" Months, "+period.getDays()+" Days");
		}
		
		else {
			Period period=Period.between(p.dob,this.dob);
			return (p.name+" is older than "+this.name+" by "+period.getYears()+" Years, "+period.getMonths()+" Months, "+period.getDays()+" Days");
		}

	}

}
