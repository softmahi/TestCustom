/**
 * 
 */
package com.mahesh.customImpl;

import java.util.HashMap;

/**
 * @author User1
 *
 */
public class TestImmutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person, String> test = new HashMap<>();

		Person p = new Person("ABC", "13");

		test.put(p, "EMP");
		
		Person p2 = new Person("XYZ", "12");
		
		Person p3 = new Person("XYZ", "12");
		
		test.put(p2, "EMP2");
		
		test.put(p3, "EMP2");
		
		System.out.println(p.getName());

		// p.setName("K");

		System.out.println("GetName"+(test.get(p)));
		
		System.out.println(test.get(p2));
		
		System.out.println(test.get(p3));
		
		if(p2.equals(p3)) {
			System.out.println("equals");
		}

	}
	
	

}
