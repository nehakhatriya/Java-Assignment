package com.assigment.java;
import java.util.Arrays;

import org.apache.log4j.Logger;
public class MissingNumber {
	static Logger missinglogger=Logger.getLogger(MissingNumber.class);
	public static int missingNumber(int[] arr) {
	missinglogger.info("Array"+Arrays.toString(arr));
	int n=arr.length+1;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum += arr[i];
	}
	int expectedSum= n*(n+1)/2;
	int result=expectedSum-sum;
	missinglogger.info("missing number:"+ result);
	return result;
	}

}
