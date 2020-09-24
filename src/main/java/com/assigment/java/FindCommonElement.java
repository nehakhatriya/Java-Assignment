package com.assigment.java;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;
public class FindCommonElement {
   static Logger logger=Logger.getLogger(FindCommonElement.class);
	public static ArrayList CommonElement(int[] arr1,int[] arr2,int arr3[]) {
		logger.info("inside CommonElement class");
		logger.info("Array 1st"+Arrays.toString(arr1));
		logger.info("Array 2nd"+Arrays.toString(arr2));
		logger.info("Array 3rd"+Arrays.toString(arr3));
		
		ArrayList common=new ArrayList(1);int el=0,c=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
				{
					for(int k=0;k<arr3.length;k++) {
						if(arr1[i]==arr3[k])
						{
							el=arr1[i];
							if(!common.contains(el))
							{
								
								common.add(el);
								c++;
								break;							
							}
						}					
					}
					break;
				}
			}		
		}
		logger.info("Common elements are: "+common);
		return common;
	}
}
