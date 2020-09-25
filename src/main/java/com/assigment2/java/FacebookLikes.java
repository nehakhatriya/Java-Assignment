package com.assigment2.java;
import java.util.Arrays;

import org.apache.log4j.Logger;
public class FacebookLikes {
	static Logger logger=Logger.getLogger( FacebookLikes.class);
	public static String facebookLikes(String arr[]) {
		logger.info("Inside FacebookLikes Class ");
		logger.info("Array of people who liked post"+Arrays.toString(arr));
		if(arr.length==0) {
			logger.info("no one likes this");
			return "no one likes this";
		}
		if(arr.length==1) {
			logger.info(arr[0]+" likes this");
			return (arr[0]+" likes this");
		}
        if(arr.length==2) {
        	logger.info(arr[0]+" and "+arr[1]+" like this");
			return (arr[0]+" and "+arr[1]+" like this");
		}
        if(arr.length==3) {
        	logger.info(arr[0]+", "+arr[1]+" and "+arr[2]+" like this");
			return (arr[0]+", "+arr[1]+" and "+arr[2]+" like this");
		}
        else
        {
        	logger.info(arr[0]+", "+arr[1]+" and "+(arr.length-2)+" others like this");
        	return (arr[0]+", "+arr[1]+" and "+(arr.length-2)+" others like this");
        }
		
	}
}
 

