package com.bank.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SavingAccountTest {

	@Test
	@DisplayName("Creating account ")
	void test1() {
		SavingAccount acc1=new SavingAccount("Neha",2000);
		assertEquals("Neha",acc1.getName());
		assertEquals(2000,acc1.getBalance());
		assertEquals(1000,acc1.getAccountNo());
	}
	@Test
	@DisplayName("Auto generating account numbers")
	void test2() {
		SavingAccount acc1=new SavingAccount("Neha",2000);
		SavingAccount acc2=new SavingAccount("Zayn");
		assertEquals(1002,acc2.getAccountNo());
	}
	@Test
	@DisplayName("Money deposit")
	void test3() {
		SavingAccount acc1=new SavingAccount("Neha",2000);
		acc1.deposit(1000);
		assertEquals(3000,acc1.getBalance());
	}
	@Test
	@DisplayName("Money withdrawl")
	void test4() {
		SavingAccount acc1=new SavingAccount("Neha",2000);
		try {
			acc1.withdraw(1000);			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(1000,acc1.getBalance());
	}

	@Test
	@DisplayName("Payment gateway transfer successfull")
	void test5() {
		SavingAccount acc1=new SavingAccount("Neha",2000);
		SavingAccount acc2=new SavingAccount("Zayn");	
		assertEquals(true,PaymentGateway.transfer(acc1, acc2, 1000));
	}
	
	@Test
	@DisplayName("Payment gateway transfer failure")
	void test6() {
		SavingAccount acc1=new SavingAccount("Neha");
		SavingAccount acc2=new SavingAccount("Zayn",2000);	
		assertEquals(false,PaymentGateway.transfer(acc1, acc2, 1000));
	}
	@Test
	@DisplayName("withdrwal method throwing exception whrn amount is less than balance")
	void test7() {
		SavingAccount acc1=new SavingAccount("Neha");
		assertThrows(Exception.class,()->acc1.withdraw(1000));
	}

}
