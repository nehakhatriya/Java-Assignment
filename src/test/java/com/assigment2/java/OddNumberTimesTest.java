package com.assigment2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddNumberTimesTest {

	@Test
	void test() {
		assertEquals(5, OddNumberTimes.oddNumber(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
		assertEquals(-1, OddNumberTimes.oddNumber(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
		assertEquals(5, OddNumberTimes.oddNumber(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
		assertEquals(10, OddNumberTimes.oddNumber(new int[]{10}));
		assertEquals(10, OddNumberTimes.oddNumber(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
		assertEquals(1, OddNumberTimes.oddNumber(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
	}

}
