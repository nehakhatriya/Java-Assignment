package com.inheritance.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PublicTrainingTest {

	Training pub=new PublicTraining("Java",3000,50);
	@Test
	@DisplayName("initializing pub object")
	void test1() {
		assertEquals("Java",pub.getSubject());
		assertEquals(3000,pub.getFees());
		//assertEquals(50,pub.getParticipants());
		
	}
	@Test
	@DisplayName("getting training charges")
	void test2() {
		assertEquals(150000,pub.getOrderValue());		
	}

}
