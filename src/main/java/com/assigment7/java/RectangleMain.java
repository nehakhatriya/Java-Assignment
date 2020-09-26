package com.assigment7.java;

public class RectangleMain {
	public static void main(String[] args) {
		RectangleShape rec1=new RectangleShape(2,4);
		RectangleShape rec2=new RectangleShape(2,4.4);
		RectangleShape rec3=new RectangleShape(4,2);
		System.out.println("Rectangle 1 with length: "+rec1.getLength()+" and breadth: "+rec1.getBreadth()+" has Area: "+rec1.Area()+" and perimeter: "+rec1.Perimeter());
		System.out.println("Rectangle 2 with length: "+rec2.getLength()+" and breadth: "+rec2.getBreadth()+" has Area: "+rec2.Area()+" and perimeter: "+rec2.Perimeter());
		System.out.println("Rectangle 3 with length: "+rec3.getLength()+" and breadth: "+rec3.getBreadth()+" has Area: "+rec3.Area()+" and perimeter: "+rec3.Perimeter());

		if(RectangleShape.compareArea(rec1, rec2)) {
			System.out.println("Area of rectangle 1 and rectangle 2 are equal");
		}
		else
		{
			System.out.println("Area of rectangle 1 and rectangle 2 are not equal");
		}
		if(RectangleShape.compareArea(rec1, rec3)) {
			System.out.println("Area of rectangle 1 and rectangle 3 are equal");
		}
		else
		{
			System.out.println("Area of rectangle 1 and rectangle 3 are not equal");
		}
		
	}

}
