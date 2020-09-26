package com.assigment7.java;

public class RectangleShape {

	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	
	public RectangleShape(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double Area() {
		area=length*breadth;
		return area;
	}
	public double Perimeter() {
		perimeter=2*(length+breadth);
		return perimeter;
	}
	
	public static boolean compareArea(RectangleShape r1,RectangleShape r2) {
		if(r1.area==r2.area)
		return true;
		else
			return false;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}
	
}

