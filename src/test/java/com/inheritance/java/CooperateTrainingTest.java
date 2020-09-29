package com.inheritance.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CooperateTrainingTest {

	Training coo=new CooperateTraining("Java",3000,5);
	@Test
	@DisplayName("initializing pub object")
	void test1() {
		assertEquals("Java",coo.getSubject());
		assertEquals(3000,coo.getFees());
		//assertEquals(50,coo.getParticipants());
		
	}
	@Test
	@DisplayName("getting training charges")
	void test2() {
		assertEquals(15000,coo.getOrderValue());		
	}

}
