package com.inheritanceBank.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MMBankFactoryTest {

	@Test
	void test1() {
		BankFactory bank=new MMBankFactory();
		bank.getNewCurrentAccount(1001, "Neha", 4000, 1000);
		assertTrue(bank.getNewSavingAccount(1002, "Zayn", 2000, true) instanceof SavingAcc );
	}
	@Test
	void test2() {
		BankFactory bank=new MMBankFactory();
		assertTrue(bank.getNewCurrentAccount(1002, "Zayn", 2000,100) instanceof CurrentAcc );
	}

}
