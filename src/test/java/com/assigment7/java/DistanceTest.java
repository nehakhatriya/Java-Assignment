package com.assigment7.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistanceTest {

	DistanceDemo dis1=new DistanceDemo();
	@Test
	void test1() {
		dis1.set(2, 4.2f);
		assertEquals(2,dis1.getFeet());
		assertEquals(4.2f,dis1.getInches());
	}

	@Test
	void test3() {
		dis1.set(2, 4.2f);
		DistanceDemo dis2=new DistanceDemo();
		dis2.set(3, 5.5f);
		DistanceDemo dis3=DistanceDemo.sum(dis1, dis2);
		dis3.display();
		assertEquals(5,dis3.getFeet());
		assertEquals(9.7f,dis3.getInches());
	}
	

}
