package com.assigment7.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TimeTest {
	
	Times t1=new Times();

	@Test
	@DisplayName("test for set method")
	void test1() {
		t1.set(6,45);
		assertEquals(6,t1.getHours());
		assertEquals(45,t1.getMin());
	}
	@Test
	@DisplayName("test for sum method")
	void test2() {
		t1.set(6,45);
		Times t2=new Times();
		t2.set(7,55);
		Times t3=Times.sum(t1, t2);
		assertEquals(2,t3.getHours());
		assertEquals(40,t3.getMin());
	}

}
