package com.assigment6.java;

public class PersonMain {

	public static void main(String[] args) {
		Person person1=new Person("Ram", 5, 6, 1980);
		Person person2=new Person("Shyam", 2, 3, 1987);
		person1.display();
		person2.display();
		System.out.println(person1. olderOne(person2));
	}

}
