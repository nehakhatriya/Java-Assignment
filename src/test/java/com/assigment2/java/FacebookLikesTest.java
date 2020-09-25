package com.assigment2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacebookLikesTest {

	
	@Test
	void test1() {
		String actual=FacebookLikes.facebookLikes(new String[]{});
		String expected="no one likes this";
		assertEquals(expected,actual);
	}
	@Test
	void test2() {
		String actual=FacebookLikes.facebookLikes(new String[]{"Peter"});
		String expected="Peter likes this";
		assertEquals(expected,actual);
	}
	@Test
	void test3() {
		String actual=FacebookLikes.facebookLikes(new String[]{"Jacob", "Alex"});
		String expected="Jacob and Alex like this";
		assertEquals(expected,actual);
	}
	@Test
	void test4() {
		String actual=FacebookLikes.facebookLikes(new String[]{"Max", "John", "Mark"});
		String expected="Max, John and Mark like this";
		assertEquals(expected,actual);
	}
	@Test
	void test5() {
		String actual=FacebookLikes.facebookLikes(new String[]{"Alex", "Jacob", "Mark", "Max"});
		String expected="Alex, Jacob and 2 others like this";
		assertEquals(expected,actual);
	}
	@Test
	void test6() {
		String actual=FacebookLikes.facebookLikes(new String[]{"Alex", "Jacob", "Mark", "Max","Joey","Chandler"});
		String expected="Alex, Jacob and 4 others like this";
		assertEquals(expected,actual);
	}

}
