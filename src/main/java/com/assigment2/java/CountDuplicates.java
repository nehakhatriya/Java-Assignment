package com.assigment2.java;
import java.util.Arrays;

import org.apache.log4j.Logger;
public class CountDuplicates {
   static Logger logger=Logger.getLogger(CountDuplicates.class);
	public static int countDuplicates(String str) {
		logger.info("inside Count Double function");
		logger.info("String to check for duplicates: "+str);
		String str1=str.toLowerCase();
		int count=0;
		char[] characters=new char[26];
		int[] numbers=new int[10];
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)>=97&&str1.charAt(i)<=122) {
				int ch=str1.charAt(i);
				System.out.print("charater"+ch);
				characters[ch-97]++;
			}
			if(str1.charAt(i)>=48&&str1.charAt(i)<=57) {
				int ch=str1.charAt(i);
				System.out.print("number"+ch);
				numbers[ch-48]++;
			}
			
		}
		for(int i=0,j=0;i<26||j<10;i++,j++) {
			if(characters[i]>1)
				count++;
			if(j<10) {
				if(numbers[j]>1)
					count++;
			}
		}
		logger.info("number of duplicate characters and digits are: " + count);
		return count;
	}

}
