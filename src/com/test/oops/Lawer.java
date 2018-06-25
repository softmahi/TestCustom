package com.test.oops;

public class Lawer {

	int lawerId;

	String lawerType;

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lawer other = (Lawer) obj;
		if (lawerId != other.lawerId)
			return false;
		if (lawerType == null) {
			if (other.lawerType != null)
				return false;
		} else if (!lawerType.equals(other.lawerType))
			return false;
		return true;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lawerId;
		result = prime * result + ((lawerType == null) ? 0 : lawerType.hashCode());
		return result;
	}

	

}
