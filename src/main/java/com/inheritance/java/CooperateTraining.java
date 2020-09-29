package com.inheritance.java;

import org.apache.log4j.Logger;

public class CooperateTraining extends Training{

private static Logger logger=Logger.getLogger(Training.class);
	
	private int days;
	
	{
		logger.info("Cooperate Training..");		
	}
	
	public CooperateTraining(String subject,double fees,int days) {
		super(subject,fees);
		logger.info("Days "+days);
		this.days=days;
	}
	@Override
	public double getOrderValue() {
		double charges=fees*days;
		logger.info("Charges: "+charges);
		return charges;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
}
