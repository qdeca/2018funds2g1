package com.qde.exercises;

public class Customer {
	private String name;
	private String address;
	
	
	
	
	
	public Customer() {
		super();
	}

	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String nameToSet) {
		this.name = nameToSet;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
