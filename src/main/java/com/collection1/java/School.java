package com.collection1.java;

import java.util.HashSet;
import java.util.Set;

public class School {

	private String name;
	private String city;
	private String schooldistrict;
	private int greatSchoolRanking;	
		
	public School(String name, String city, String schooldistrict, int greatSchoolRanking) {
		this.city=city;
		this.name=name;
		this.schooldistrict=schooldistrict;
		this.greatSchoolRanking=greatSchoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchooldistrict() {
		return schooldistrict;
	}

	public void setSchooldistrict(String schooldistrict) {
		this.schooldistrict = schooldistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
}
