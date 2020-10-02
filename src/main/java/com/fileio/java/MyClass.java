package com.fileio.java;

import java.io.Serializable;

public class MyClass implements Serializable{

	private String Name;
	private int rollno;
	
	private static final long serialVersionUID=1L;
	public MyClass(String name, int rollno) {
		super();
		Name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
}
