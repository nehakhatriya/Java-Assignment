package com.stream.java;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ListOfIntegers {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<80;i+=3) {
			list.add(i);
		}
		System.out.println("Display all even numbers");
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
		System.out.println("Display all odd numbers");
		list.stream().filter(i->i%2!=0).forEach(System.out::println);
		
		System.out.println("Display all numbers divisible by 6");
		list.stream().filter(i->i%6==0).forEach(System.out::println);
		
		System.out.println("Display all numbers less than 12");
		list.stream().filter(i->i<12).forEach(System.out::println);
		
		System.out.println("Display all numbers greater than 50");
		list.stream().filter(i->i>50).forEach(System.out::println);
	}
}
