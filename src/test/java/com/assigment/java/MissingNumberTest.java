package com.assigment.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

	@Test
	@DisplayName("Testing for missing number function")
	void testMissingNumber() {
		int actual=MissingNumber.missingNumber(new int[]{1,2,3,4,6,7,8});
		assertEquals(5,actual,"missing number");
	}

}
