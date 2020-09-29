package com.inheritanceBank.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MMSavingAccTest {

	SavingAcc account=new MMSavingAcc(10001,"NEha",2000,true);
	@Test
	void test1() {
	account.diposit(2500);
	assertEquals(4500,account.getAccBal());
	}
	
	@Test
	void test2() {
	account.withdraw(1950);
	assertEquals(2000,account.getAccBal());
	}

}
