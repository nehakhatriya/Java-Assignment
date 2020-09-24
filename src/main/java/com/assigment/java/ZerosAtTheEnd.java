package com.assigment.java;
import java.util.Arrays;

import org.apache.log4j.Logger;
public class ZerosAtTheEnd {
	static Logger logger=Logger.getLogger(ZerosAtTheEnd.class);
	public static int[] zeroAtEnd(int[] arr) {
		logger.info("Array to be sorted to have zeros at end: " +Arrays.toString(arr));
			 int start = 0 , end = arr.length-1; 
			  
			  while(start < end)
			  {
			    if(arr[start] != 0)
			      start ++;
			    if(arr[end] == 0)
			      end --;  
			    if(arr[start] == 0 && arr[end] != 0) 
			        {  
			    	int temp=arr[start];
			    	arr[start]=arr[end];
			    	arr[end]=temp;
			    	start++;
			    	end--;
			        }
			  } 
		logger.info("Array after sorting zeros at end : " +Arrays.toString(arr));
		return arr;
		
	}

}
