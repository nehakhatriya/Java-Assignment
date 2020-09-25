package com.assigment3.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderStringTest {

//	@Test
//	void test1() {
//		assertEquals(OrderString.order("is2 Thi1s T4est 3a"), "Thi1s is2 3a T4est");
//
//	}

	@Test
	void test2() {		
		assertEquals(OrderString.order("4of Fo1r pe6ople g3ood th5e the2"), "Fo1r the2 g3ood 4of th5e pe6ople");

	}
//	@Test
//	void test3() {
//			assertEquals(OrderString.order(""), "");
//
//	}
}
