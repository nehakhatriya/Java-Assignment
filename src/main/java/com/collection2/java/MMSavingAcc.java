package com.collection2.java;

import java.io.Serializable;

public class MMSavingAcc implements Serializable,Comparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accID;
	private String accName;
	private double accBalance;
	private boolean isSalaryAccount;
	
	public MMSavingAcc(int accID, String accName, double accBalance, boolean isSalaryAccount) {
		super();
		this.accID = accID;
		this.accName = accName;
		this.accBalance = accBalance;
		this.isSalaryAccount = isSalaryAccount;
	}
	

	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accID;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MMSavingAcc other = (MMSavingAcc) obj;
		if (accID != other.accID)
			return false;
		return true;
	}


	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return this.accID-((MMSavingAcc)obj).accID;
	}
	
	
}
