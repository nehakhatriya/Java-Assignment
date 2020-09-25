package com.assigment3.java;
import org.apache.log4j.Logger;

public class SquareOfSquare {

	static Logger logger=Logger.getLogger( SquareOfSquare.class);
	public static boolean isSquare(int num) {
		
		logger.info("Inside SquareOfSquare Class ");
		logger.info("Number to be checked for sqaure"+num);
		if(num<0) return false;
		if(num==0) return true;
		
		for(int i=1;i*i<=num;i++) {
			if(i*i==num) {
				return true;
			}
		}
     return false;
	}
	
}
