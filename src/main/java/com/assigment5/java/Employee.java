package com.assigment5.java;

public class Employee {
	
	private int ID;
	private String name;
	private double monthlyBasic;
	
	public Employee(int ID, String name,double basics) {
		this.ID=ID;
		this.name=name;
		this.monthlyBasic=basics;
	}
	public double getAnnualBasic() {
		return 12 * monthlyBasic;
	}
	public double getMonthlyGrossSalary(){
		double hra=monthlyBasic*0.5,
				medical=1250,conveyance=800;
		return monthlyBasic + hra + medical + conveyance;
	}
	public double getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}
	public double getMonthlyDeductions() {
		double pf=monthlyBasic*0.1,esic=0;
		int profTax;
		if(monthlyBasic<=5000) {
		esic=(monthlyBasic*4.75)/100;
		}
		if(getAnnualGrossSalary()<=10000)
			profTax=25;
		else
			profTax=100;
		return pf + esic + profTax;
	}
	public double getMonthlyTakeHome() {
		return getMonthlyGrossSalary()- getMonthlyDeductions();
	}
	public double getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();
	}
//	public float setPFRate(float f) {
//		
//	}
//	public double getPFRate() {
//	}
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

}
