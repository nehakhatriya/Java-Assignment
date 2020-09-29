package com.exception.java;

public class Student {

	private String name;
	private int age;
	
	public Student(String name,int age) throws NameNotValidException, AgeNotWithinRangeException{
		if(checkName(name))
		{
			if(checkAge(age)) {
				this.name=name;
				this.age=age;				
			}
			else throw new  AgeNotWithinRangeException("Age must be btn 15-21");	
		}
		else throw new NameNotValidException("Name cannot have special characters");
	}
	
	public boolean checkName(String name)  {
        name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>=97&&name.charAt(i)<=122)
				continue;
			else
				return false;				
		}
		return true;	
	}
	public boolean checkAge(int age)  {
		if(age>=15&&age<=21)
		return true;
		else
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
