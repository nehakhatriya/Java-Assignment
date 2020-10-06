package com.collection2.java;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.TreeSet;

public class BankAccountList {

	private static TreeSet<MMSavingAcc> set=new TreeSet<MMSavingAcc>();
	public static void main(String[] args) {
		
		   Object accc = null;
		  try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("X://Saving.txt"))) {
			   while((accc=ois.readObject())!=null) {
				  MMSavingAcc acc=(MMSavingAcc)accc;
				  set.add(acc);         //storing account object to set
			   }
		   }
		  catch(EOFException e) {System.out.println("Retrieved objects");}
		   catch(Exception e) {
			   System.out.println(e.getMessage());
		   }
		  //displaying all accounts in sorted order
		  for(MMSavingAcc acc:set) {
			  System.out.println(acc.getAccName()+acc.getAccID());
		  }
	}
	
}
