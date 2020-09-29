package com.inheritanceBank.java;

public abstract class BankAcc {

	private int accNo;
	private String accName;
	private float accBal;
	
	public BankAcc(int accNo,String accName,float accBal) {
		this.accBal=accBal;
		this.accName=accName;
		this.accNo=accNo;		
	}
	
	public abstract void withdraw(float amount);
	public abstract void diposit(float amount);

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
}
