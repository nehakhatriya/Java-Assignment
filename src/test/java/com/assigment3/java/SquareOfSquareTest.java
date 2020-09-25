package com.assigment3.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareOfSquareTest {

	@Test
	void test() {
		 assertEquals(SquareOfSquare.isSquare(-1), false, "-1: Negative numbers cannot be square numbers");
		  assertEquals(SquareOfSquare.isSquare( 0), true, "0 is a square number (0 * 0)");
		  assertEquals(SquareOfSquare.isSquare( 3), false, "3 is not a square number");
		   assertEquals(SquareOfSquare.isSquare( 4), true, "4 is a square number (2 * 2)");
		   assertEquals(SquareOfSquare.isSquare(25), true, "25 is a square number (5 * 5)");
		   assertEquals(SquareOfSquare.isSquare(26), false, "26 is not a square number");
	}

}
