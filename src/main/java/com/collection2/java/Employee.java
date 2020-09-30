package com.collection2.java;

public class Employee {

	private int empID;
	private String EmployeeName;
	private String employeeDesignation;
	private Double EmployeeSalary;
	
	public Employee(int empID, String employeeName, String employeeDesignation, Double employeeSalary) {
		super();
		this.empID = empID;
		EmployeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		EmployeeSalary = employeeSalary;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empID;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empID != other.empID)
			return false;
		return true;
	}
	
	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public Double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}



	
	
}
