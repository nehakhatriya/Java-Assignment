package com.exception.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	
	@Test
	void test1() throws NameNotValidException, AgeNotWithinRangeException {
		Student student=new Student("neha",16);
		assertEquals("neha",student.getName());
		assertEquals(16,student.getAge());
	}
	@Test
	void test2() {
		assertThrows(AgeNotWithinRangeException.class,()->new Student("neha",25));
	}

	@Test
	void test3() {
		assertThrows(NameNotValidException.class,()->new Student("neh@",16));
	}
}
