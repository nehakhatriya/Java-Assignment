package com.collection1.java;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Car {

	private LocalDate make;
	private String model;
	private int year;
	private double price;
	
	public Car(LocalDate make,String model,int year,double price) {
		this.make=make;
		this.model=model;
		this.price=price;
		this.year=year;
	}

	public LocalDate getMake() {
		return make;
	}

	public void setMake(LocalDate make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
