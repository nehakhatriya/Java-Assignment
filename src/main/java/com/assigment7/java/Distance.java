package com.assigment7.java;

class DistanceDemo{
	int Feet;
	float inches;
	
	void set(int Feet, float inches) {
		this.Feet=Feet;
		this.inches=inches;
	}

	public int getFeet() {
		return Feet;
	}

	public float getInches() {
		return inches;
	}
	
	public void display() {
		System.out.println("Distance : "+this.Feet+" feets "+this.inches+" inches ");
	}

	public static DistanceDemo sum(DistanceDemo d1,DistanceDemo d2) {
		DistanceDemo d3=new DistanceDemo();
		int feet=d1.getFeet()+d2.getFeet();
		float inches=d1.getInches()+d2.getInches();
		d3.set(feet,inches);
		return d3;
	}
}
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
