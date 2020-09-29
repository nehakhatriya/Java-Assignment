package com.inheritanceBank.java;

public abstract class BankFactory {

	public abstract SavingAcc getNewSavingAccount(int accNo,String accName,float accBal,boolean isSalried);
	public abstract CurrentAcc getNewCurrentAccount(int accNo,String accName,float accBal,float creditLimit);
	
}
