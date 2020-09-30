package com.collection2.java;

public class ParkingSLot {

	private String parkingSlot;
	private boolean isOccupied;
	
	
	public ParkingSLot(String parkingSlot, boolean isOccupied) {
		super();
		this.parkingSlot = parkingSlot;
		this.isOccupied = isOccupied;
	}
	
	public String getParrkingSlot() {
		return parkingSlot;
	}
	public void setParrkingSlot(String parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
}
