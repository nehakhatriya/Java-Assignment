package com.assigment6.java;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	
	void Constructor() throws ParseException {
		Person person=new Person("Ram", 5, 6, 1980);
		assertEquals("Ram",person.getName());
		assertEquals("05/06/1980",person.getDob());
	}

	@Test
	void olderPerson1() throws ParseException {
		Person person1=new Person("Ram", 5, 6, 1980);
		Person person2=new Person("Shyam", 2, 3, 1987);
		assertEquals("Ram is older than Shyam by 6 Years, 8 Months, 25 Days",person1.olderOne(person2));
	}
	
	@Test
	void olderPerson2() throws ParseException {
		Person person1=new Person("Ram", 5, 6, 1987);
		Person person2=new Person("Shyam", 2, 3, 1980);
		assertEquals("Shyam is older than Ram by 7 Years, 3 Months, 3 Days",person1.olderOne(person2));
	}
	
}
