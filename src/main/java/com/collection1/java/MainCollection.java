package com.collection1.java;

import java.time.LocalDate;
import java.util.Set;

public class MainCollection {

	public static void main(String[] args) {
		
		GeneralizedSet<Car> cars=new GeneralizedSet<Car>();
		Car Maruti=new Car(LocalDate.of(1998,02,02),"Ciaz",1980,400000);
		Car Benz=new Car(LocalDate.of(2001,02,02),"Benz",1980,400000);
		Car Porshe=new Car(LocalDate.of(1997,02,02),"Porshe",1980,400000);
		cars.addItems(Maruti);
		cars.addItems(Benz);
		cars.addItems(Porshe);
		Set<Car> carss=cars.getItems();
		for(Car i:carss) {
			System.out.println(i.getModel());
		}
	}
}
