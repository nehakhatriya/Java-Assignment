package com.assigment3.java;

public class OrderString {

	public static String order(String str) {
		if(str.length()==0) return "";
		String[] words=str.split("\\s");
		String[] newarray=new String[str.length()];
		for(int i=0;i<words.length;i++) {
			int len=words[i].length();		
			char[] str2=words[i].toCharArray();
				for(int j=0;j<len;j++) {				
					if(str2[j]>=48&&str2[j]<=57) {					
						newarray[str2[j]-48-1]=words[i];
					}
			}
		}
		StringBuffer sbf=new StringBuffer();
		for(int i=0;i<words.length;i++) {
			sbf.append(newarray[i]+" ");
		}
		
		return sbf.toString().trim();
	}
}
