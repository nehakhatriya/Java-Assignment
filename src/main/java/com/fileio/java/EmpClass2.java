package com.fileio.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmpClass2 {

	public static void main(String []args) {
		Object emp;	
		try (ObjectInputStream oos=new ObjectInputStream(new FileInputStream("X://Emp.txt"));){			
			while((emp=oos.readObject())!=null) {
				Employee empp=(Employee)emp;
				System.out.println("ID: "+empp.getId()+",Name: "+empp.getName()+",Salary: "+empp.getSalary());
			}
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
