package com.assigment2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CountDuplicatesTest {

	@Test
	@DisplayName("Testing for string containing both uppercase and lowercase alphabets")
	void test1() {
		int actual=CountDuplicates.countDuplicates("abAbcd");
		int expected=2;
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Testing for string containing all lowercase alphabets")
	void test2() {
		int actual=CountDuplicates.countDuplicates("indivisibility");
		int expected=1;
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Testing for string containing all uppercase alphabets")
	void test3() {
		int actual=CountDuplicates.countDuplicates("AABBCDE");
		int expected=2;
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("Testing for string containing both numbers and alphabets")
	void test4() {
		int actual=CountDuplicates.countDuplicates("aA1123");
		int expected=2;
		assertEquals(expected,actual);
	}

}
