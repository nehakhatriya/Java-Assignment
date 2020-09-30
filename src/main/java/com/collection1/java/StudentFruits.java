package com.collection1.java;

import java.util.HashMap;
import java.util.Map;

public class StudentFruits {

	public static void main(String args[]) {
		
		Student stu1=new Student("Neha","Mango");
		Student stu2=new Student("Zayn","Mango");
		Student stu3=new Student("Neha","Apple");
		Student stu4=new Student("Niki","Apple");
		
	 Map<String, String> map = new HashMap<>();
		map.put(stu1.getName(), stu1.getFruit());
		map.put(stu2.getName(), stu2.getFruit());
		map.put(stu3.getName(), stu3.getFruit());
		map.put(stu4.getName(), stu4.getFruit());
		
	//names and fruits
		for(String i: map.keySet()) {
			System.out.println(i+":"+map.get(i));
		}
		
		//friuts
		for(String i: map.keySet()) {
			System.out.println(map.get(i));
		}
	}
	
}
