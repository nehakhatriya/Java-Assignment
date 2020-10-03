package com.lambda.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FileFilterTest {

	@Test
	@DisplayName("Number of subdirectries in given path")
	void test1() {
		assertEquals(28,FileFilter.subdir("X://AWS"));
	}
	
	@Test
	@DisplayName("Number of subdirectries in root directory")
	void test2() {
		assertEquals(11,FileFilter.subdir("X://"));
	}

}
