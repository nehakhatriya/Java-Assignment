package com.collection2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParkedCarListTest {

	CarOwnerDetails car1=new CarOwnerDetails("Neha","Maruti","MP0945",12345,"Indore");
	CarOwnerDetails car2=new CarOwnerDetails("Niki","Benz","MP0645",67859,"Delhi");
	CarOwnerDetails car3=new CarOwnerDetails("Jai","Volvo","MP0965",14565,"Mumbai");
	CarOwnerDetails car4=new CarOwnerDetails("Zayn","Volvo","MP895",14565,"Mumbai");
	
	ParkedCarList parked=new ParkedCarList();
	
	@BeforeEach
	void setCars() {
		parked.addCar(car1);
		parked.addCar(car2);
		parked.addCar(car3);
		
	}
	@Test
	@DisplayName("Parking cars")
	void test1() {
		assertEquals(3,parked.getCars().size());
		
	}
	@Test
	@DisplayName("Removing cars")
	void test2() {
	parked.removeCar(car2);
	assertEquals(2,parked.getCars().size());
	}

	@Test
	@DisplayName("Getting parked car location")
	void test3() {
	assertEquals("1F1S2",parked.getParkedLocation(car2));
	}
	
	@Test
	@DisplayName("Removing car and adding new car gets its parking slot")
	void test4() {
	parked.removeCar(car2);
	parked.addCar(car4);
	assertEquals("1F1S2",parked.getParkedLocation(car4));
	}
}
