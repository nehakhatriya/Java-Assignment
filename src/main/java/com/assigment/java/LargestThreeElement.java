package com.assigment.java;
import java.util.Arrays;

import org.apache.log4j.Logger;
public class LargestThreeElement {
   static Logger logger=Logger.getLogger(LargestThreeElement.class);
	public static int[] largestElement(int[] arr) {
		logger.info("inside Largest three element class");
		logger.info("Array to be searched" + Arrays.toString(arr));
		Arrays.sort(arr);
		int[] array=new int[3];
		int j=arr.length;
		for(int i=0;i<3;i++) {
			array[i]=arr[j-i-1];
		}
		logger.info("Largest 3 elements are: "+Arrays.toString(array));
		return array;
	}
}
