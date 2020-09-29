package com.inheritanceBank.java;

public class MMBankFactory extends BankFactory {

	public SavingAcc getNewSavingAccount(int accNo,String accName,float accBal,boolean isSalried) {
		
		MMSavingAcc account=new MMSavingAcc(accNo,accName,accBal,isSalried);
		return account;
	}
	
	public CurrentAcc getNewCurrentAccount(int accNo,String accName,float accBal,float creditLimit) {
		MMCurrentAcc account=new MMCurrentAcc(accNo, accName, accBal, creditLimit);
		return account;
	}
}
