package com.lambda.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileNameFilterTest {

	@Test
	void test() {
		assertEquals(4,FileNameFilter.filename("X://",".txt"));
	}

}
