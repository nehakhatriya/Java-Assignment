package com.assigment2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HighestPossibleNumberTest {

	@Test
	void test1() {
		long actual=HighestPossibleNumber.highestNumber(21445);
		long expected=54421;
		assertEquals(expected,actual);
	}
	@Test
	void test2() {
		long actual=HighestPossibleNumber.highestNumber(145263);
		long expected=654321;
		assertEquals(expected,actual);
	}
	@Test
	void test3() {
		long actual=HighestPossibleNumber.highestNumber(1254859723);
		long expected = 9875543221l;
		assertEquals(expected,actual);
	}


}
