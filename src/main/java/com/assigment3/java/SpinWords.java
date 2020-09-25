package com.assigment3.java;

import java.util.Arrays;

public class SpinWords {

	public static String spinWords(String str) {
		String[] words=str.split("\\s");
		String newstr="";
		for(int i=0;i<words.length;i++) {
			int len=words[i].length();
			char[] str2=words[i].toCharArray();
			if(len>=5) {
				for(int j=0,k=len-1;j<k;k--,j++) {
					char temp=str2[j];
					str2[j]=str2[k];
					str2[k]=temp;					
				}
				
			}
			 String str3=String.valueOf(str2);
			 newstr+=" "+str3;
		}
			return newstr.trim();
	}
}
