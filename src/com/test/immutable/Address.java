package com.test.immutable;

final class Address  {

	private String roadName;

	public Address(String roadName) {
		// TODO Auto-generated constructor stub
		
		this.setRoadName(roadName);
	}

	public String getRoadName() {
		return roadName;
	}

	@Override
	public String toString() {
		return "Address [roadName=" + getRoadName() + "]";
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	
	

}
