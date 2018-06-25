package com.test.immutable;

import java.util.HashMap;

public class TestStringImmutabilty {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> h = new HashMap<>();
		
		String k = "Mahesh";
		System.out.println(k.hashCode());
		System.out.println(new Integer(12).hashCode());
		h.put(k, 12);
		System.out.println(new Integer(12).hashCode());
		System.out.println("Mahesh".hashCode());
		System.out.println(h.get("Mahesh"));
		
		
		
		
		
		
	}

}
