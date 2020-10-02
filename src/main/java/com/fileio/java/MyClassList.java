package com.fileio.java;
import java.io.*;
import java.util.ArrayList;

public class MyClassList {

    static ArrayList<MyClass> cls=new ArrayList<MyClass>();
	public static void main(String[] args) {
	  
		MyClass class1=new MyClass("neha",101);
		MyClass class2=new MyClass("zayn",102);
		cls.add(class1);
		cls.add(class2);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("X://MyClass.txt"))){
			for(MyClass cs:cls) {
				oos.writeObject(cs);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("X://MyClass.txt"))){
			Object o;
			while((o=ois.readObject())!=null)
			{
				MyClass cls=(MyClass)o;
				System.out.println("Name: "+cls.getName()+", RollNo: "+cls.getRollno());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
