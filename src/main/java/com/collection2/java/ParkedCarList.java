package com.collection2.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkedCarList {

private Map<CarOwnerDetails,ParkingSLot> carsparked;
private ArrayList<ParkingSLot> slots=setSlots();

public ParkedCarList() {
	carsparked=new HashMap<CarOwnerDetails,ParkingSLot>();
}

public void addCar(CarOwnerDetails car) {
	ParkingSLot slot=getSlot();
	carsparked.put(car, slot);
}

public void removeCar(CarOwnerDetails car) {
	carsparked.get(car).setOccupied(false);
	carsparked.remove(car);
}

public void display() {
	for(CarOwnerDetails car:carsparked.keySet()) {
		System.out.println("Owner"+car.getOwerName()+"car"+car.getCarModel()+":"+"parkingslot"+carsparked.get(car).getParrkingSlot()+"isoccupied"+carsparked.get(car).isOccupied());
	}
}

public String getParkedLocation(CarOwnerDetails car) {
	return carsparked.get(car).getParrkingSlot();
}
public Map<CarOwnerDetails,ParkingSLot> getCars(){
	return carsparked;
}
public ArrayList<ParkingSLot> setSlots(){
	ArrayList<ParkingSLot> slot=new ArrayList<ParkingSLot>();
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=4;j++) {
			for(int k=1;k<=20;k++) {
				ParkingSLot s=new ParkingSLot(i+"F"+j+"S"+k,false);
				slot.add(s);
			}
		}
	}
	return slot;
}


public ParkingSLot getSlot() {
	
	for(int i=0;i<slots.size();i++) {
		if(slots.get(i).isOccupied()== false) {
			slots.get(i).setOccupied(true);;
			return slots.get(i);
		}
	}
    return null;
}
}
  