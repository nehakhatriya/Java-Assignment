package com.collection1.java;

import java.util.HashSet;
import java.util.Set;

public class Laptop {

	private String company;
	private String model;
	private String operatingSystem;
	private int processor;
	
	public Laptop(String company,String model, String operatingSystem,int processor) {
		this.company=company;
		this.model=model;
		this.operatingSystem=operatingSystem;
		this.processor=processor;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getProcessor() {
		return processor;
	}
	public void setProcessor(int processor) {
		this.processor = processor;
	}
}
