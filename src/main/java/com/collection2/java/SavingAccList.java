package com.collection2.java;
import java.io.*;
import java.util.ArrayList;

public class SavingAccList {

	private static ArrayList<MMSavingAcc> list=new ArrayList<MMSavingAcc>();
	
	public static void main(String[] args) {
		MMSavingAcc acc1=new MMSavingAcc(200,"Zayn",1000.0,false);
		MMSavingAcc acc4=new MMSavingAcc(202,"Neha",2300.0,false);
		MMSavingAcc acc2=new MMSavingAcc(201,"Joey",2000.0,true);
		MMSavingAcc acc5=new MMSavingAcc(204,"Jai",2000.0,true);
		MMSavingAcc acc3=new MMSavingAcc(202,"Niki",5000.0,true);
		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		list.add(acc5);
		//displaying all accounts
	   list.forEach(acc->System.out.println(acc.getAccName()));
	   
	   //storing objects to file
	   try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("X://Saving.txt"))) {
		   for(MMSavingAcc acc:list) {
			   oos.writeObject(acc);
		   }
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	   
	   //reading from file and displaying accounts
	   try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("X://Saving.txt"))) {
		   Object accc;
		   while((accc=ois.readObject())!=null) {
			  MMSavingAcc acc=(MMSavingAcc)accc;
			  System.out.println(acc.getAccBalance()+acc.getAccName()+acc.getAccID());
		   }
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	}
}
