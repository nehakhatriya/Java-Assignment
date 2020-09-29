package com.inheritance.java;
import org.apache.log4j.Logger;

public class PublicTraining extends Training{

	private static Logger logger=Logger.getLogger(Training.class);
	
	private int participants;
	
	{
		logger.info("Public Training..");		
	}
	
	public PublicTraining(String subject,double fees,int participants) {
		super(subject,fees);
		logger.info("Participants "+participants);
		this.participants=participants;
	}
	@Override
	public double getOrderValue() {
		double charges=fees*participants;
		logger.info("Charges: "+charges);
		return charges;
	}
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	
}
