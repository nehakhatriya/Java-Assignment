package com.collection2.java;

import java.util.HashMap;
import java.util.Map;

public class EmpAccList {

	private Map<Employee,MMSavingAcc> list;
	
	public EmpAccList() {
		list=new HashMap<Employee,MMSavingAcc>();
	}
	
	public void addEmpSavAcc(Employee emp,MMSavingAcc save) {
		list.put(emp, save);
	}
	
	public Map<Employee,MMSavingAcc> getList(){
		return list;
	}
	public boolean display() {
		for(Employee emp:list.keySet()) {
			System.out.println("Employee details of "+emp.getEmployeeName());
			System.out.println("ID: "+emp.getEmpID()+", Desig: "+emp.getEmployeeDesignation());
			System.out.println("Account details of employee "+emp.getEmployeeName());
			System.out.println("ID: "+list.get(emp).getAccID()+", Balance: "+list.get(emp).getAccBalance());
		}
		return true;
	}
}
