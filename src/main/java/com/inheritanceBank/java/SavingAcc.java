package com.inheritanceBank.java;

public abstract class SavingAcc extends BankAcc{

	private boolean isSalried;
	private static final float MINBAL=100;
	
	public SavingAcc(int accNo,String accName,float accBal,boolean isSalried) {
		super(accNo,accName,accBal);
		this.isSalried=isSalried;
	}
	
	public void withdraw(float amount) {
		float amt=this.getAccBal();;
		if(amount>=MINBAL&& amt-amount>MINBAL)	{
			amt-=amount;
			this.setAccBal(amt);			
		}
		else 
			System.out.println("Cannot withdraw money");
	}
	
	public void diposit(float amount) {
		float amt=this.getAccBal();
		amt+=amount;
		this.setAccBal(amt);
	}

	public boolean isSalried() {
		return isSalried;
	}

	public void setSalried(boolean isSalried) {
		this.isSalried = isSalried;
	}	
}
