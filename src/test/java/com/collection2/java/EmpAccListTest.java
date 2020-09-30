package com.collection2.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpAccListTest {

	EmpAccList list=new EmpAccList();
	Employee e1=new Employee(102,"Zayn","Mentor",350000.0);
	Employee e5=new Employee(105,"Jai","Trainee",50000.0);
	Employee e3=new Employee(101,"Neha","Trainee",25000.0);
	Employee e2=new Employee(103,"Joey","CEO",50000.0);
	Employee e4=new Employee(101,"Niki","VP",35000.0);
	
	MMSavingAcc acc1=new MMSavingAcc(200,"Zayn",1000.0,false);
	MMSavingAcc acc4=new MMSavingAcc(202,"Neha",2300.0,false);
	MMSavingAcc acc2=new MMSavingAcc(201,"Joey",2000.0,true);
	MMSavingAcc acc5=new MMSavingAcc(204,"Jai",2000.0,true);
	MMSavingAcc acc3=new MMSavingAcc(202,"Niki",5000.0,true);
	
	@BeforeEach
	
	void setList() {
		list.addEmpSavAcc(e1, acc1);
		list.addEmpSavAcc(e2, acc2);
		list.addEmpSavAcc(e3, acc3);
		list.addEmpSavAcc(e4, acc4);
		list.addEmpSavAcc(e5, acc5);
	}
	
	@Test
	void test1() {		
		assertEquals(4,list.getList().size());
	}
	@Test
	void test2() {
		assertTrue(list.display());
	}

}
