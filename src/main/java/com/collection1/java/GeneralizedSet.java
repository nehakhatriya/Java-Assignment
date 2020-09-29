package com.collection1.java;

import java.util.HashSet;
import java.util.Set;

public class GeneralizedSet<T> {

	private Set<T> sets=new HashSet<T>();
	
	public void addItems(T item) {
		sets.add(item);
	}
	
	public Set<T> getItems() {
		return sets;
	}
	
	public void displayItems() {
	System.out.print(sets.getClass().getSimpleName());
	}
}
