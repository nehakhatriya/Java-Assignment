package com.assigment2.java;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;

public class HighestPossibleNumber {
	
	static Logger logger=Logger.getLogger( HighestPossibleNumber.class);
	public static long highestNumber(long num) {
		logger.info("Inside Highest Possisble Number Class ");
		logger.info("Number to be analysed for creating highest possible number"+num);
		int digit,rem=0;
		ArrayList<Long> arr=new ArrayList<Long>(1);
		int i=0;long num2=0;
		while(num>0) {
			arr.add(num%10);
			num=num/10;
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		for(int i1=0;i1<arr.size();i1++) {
			num2=(num2*10)+arr.get(i1);
		}
		logger.info("Highest possible number is :"+num2);
		return num2;
	}

}
