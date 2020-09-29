package com.inheritanceBank.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MMCurrentAccTest {

	CurrentAcc account=new MMCurrentAcc(10001,"NEha",2000,100);
	@Test
	void test1() {
	account.diposit(2500);
	assertEquals(4500,account.getAccBal());
	}
	
	@Test
	void test2() {
	account.withdraw(1900);
	assertEquals(2000,account.getAccBal());
	}

}
