package com.inheritanceBank.java;

public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit;
	
	public CurrentAcc(int accNo,String accName,float accBal,float creditLimit) {
		super(accNo,accName,accBal);
		this.creditLimit=creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}	
	
    public void withdraw(float amount) {
    	float amt=this.getAccBal();
		if(amount>amt+creditLimit)	{
			amt-=amount;
			this.setAccBal(amt);			
		}
		else 
			System.out.println("Cannotwithdraw money");
	}
	
   public void diposit(float amount) {
	float amt=this.getAccBal();
	amt+=amount;
	this.setAccBal(amt);
		
	}
	
	}
