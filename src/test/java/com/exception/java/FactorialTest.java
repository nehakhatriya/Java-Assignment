package com.exception.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	@DisplayName("Factorial for number 3")
	void test1() throws InvalidInputException, FactorialException {
		assertEquals(6,Factorial.factorial(3));		
	}
	
	@Test
	@DisplayName("factorial for number lessthan 2 throws exception")
	void test2() {
		assertThrows(InvalidInputException.class,()->Factorial.factorial(1));		
	}
	
	@Test
	@DisplayName("Factorial out of range of int throws error")
	void test3() {
		assertThrows(FactorialException.class,()->Factorial.factorial(20));		
	}
	@Test
	@DisplayName("Factorial for negative number throws error")
	void test4() {
		assertThrows(InvalidInputException.class,()->Factorial.factorial(-2));		
	}

}
