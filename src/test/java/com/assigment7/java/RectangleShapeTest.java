package com.assigment7.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectangleShapeTest {

	@Test
	@DisplayName("Default construtor working")
	void test1() {
		RectangleShape rec=new RectangleShape(2,4);
		assertEquals(2,rec.getLength());
		assertEquals(4,rec.getBreadth());
	}
	
	@Test
	@DisplayName("Area of rectangle")
	void test2() {
		RectangleShape rec=new RectangleShape(2,4);
		assertEquals(8,rec.Area());
	}

	@Test
	@DisplayName("Perimeter of rectangle")
	void test3() {
		RectangleShape rec=new RectangleShape(2,4);
		assertEquals(12,rec.Perimeter());
	}
	
	@Test
	@DisplayName("Comparing two  rectangle")
	void test4() {
		RectangleShape rec1=new RectangleShape(2,4);
		RectangleShape rec2=new RectangleShape(2,4);
		assertEquals(true,RectangleShape.compareArea(rec1,rec2));
	}

	@Test
	@DisplayName("Comparing two rectangle")
	void test5() {
		RectangleShape rec1=new RectangleShape(2.3,4);
		RectangleShape rec2=new RectangleShape(2,4.5);
		assertEquals(true,RectangleShape.compareArea(rec1,rec2));
	}
}
