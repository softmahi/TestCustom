package com.test.serilization;

public class Address {

	final private String raodName;
	
	public Address(String roadName) {
		this.raodName = roadName;
	}

	public String getRaodName() {
		return raodName;
	}

	@Override
	public String toString() {
		return "Address [raodName=" + raodName + "]";
	}
	
	
	
}

