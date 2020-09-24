package com.assigment.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LargestThreeElementTest {

	@Test
	@DisplayName("Largest three elements for positive integers")
	void testLargestElement() {
		int[] actual=LargestThreeElement.largestElement(new int[]{5,6,2,4,3,8});
		int[] expected= new int[]{8,6,5};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Largest three elements for negative integers")
	void testLargest() {
		int[] actual=LargestThreeElement.largestElement(new int[]{-5,-6,-2,-4,-3,-8});
		int[] expected= new int[]{-2,-3,-4};
		assertArrayEquals(expected,actual);
	}

	@Test
	@DisplayName("Largest three elements for both posiitve and negative integers")
	void testLargestNum() {
		int[] actual=LargestThreeElement.largestElement(new int[]{-5,6,2,-4,-3,-8});
		int[] expected= new int[]{6,2,-3};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Largest three elements for both posiitve and negative integers")
	void testLargestFirst() {
		int[] actual=LargestThreeElement.largestElement(new int[]{9,6,2,-4,-3,-8});
		int[] expected= new int[]{9,6,2};
		assertArrayEquals(expected,actual);
	}
}
