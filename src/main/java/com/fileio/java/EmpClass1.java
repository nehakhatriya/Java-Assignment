package com.fileio.java;
import java.io.*;
public class EmpClass1 {

	public static void main(String []args) {
		Employee emp1=new Employee(101,"neha",50000);
		Employee emp2=new Employee(102,"zayn",60000);
		
		try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("X://Emp.txt"));){			
			oos.writeObject(emp1);
			oos.writeObject(emp2);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
