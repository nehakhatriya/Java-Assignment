package com.assigment5.java;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp=new Employee(20,"neha",40000);
		emp.getMonthlyBasic();
		emp.getAnnualBasic();
		emp.getAnnualGrossSalary();
		emp.getMonthlyGrossSalary();
		emp.getAnnualTakeHome();
		emp.getMonthlyTakeHome();

	}

}
