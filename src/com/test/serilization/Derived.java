package com.test.serilization;

import java.io.Serializable;

class Derived implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Base b;
	Integer k;

	public Derived(int i) {
		this.k=i;
		b = new Base();
	}
}