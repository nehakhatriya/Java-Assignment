package com.assigment2.java;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class OddNumberTimes {
	static Logger logger=Logger.getLogger( OddNumberTimes.class);
	public static int oddNumber(int[] num) {
		logger.info("Inside OddNumberTimes Class ");
		logger.info("Array to be checked for number that occured odd number of times"+Arrays.toString(num));
		int ans=0;
		for(int i=0;i<num.length;i++) {
			ans=ans^num[i];
		}
		logger.info("Number that ocuured odd number of times :"+ans);
		return ans;
	}
	

}
