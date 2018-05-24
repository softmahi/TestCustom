/**
 * 
 */
package com.mahesh.customImpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
		Person p2 = new Person("XYZ", "12");
		Person p3 = new Person("XYZ", "11");

		test.put(p, "EMP");
		test.put(p2, "EMP2");
		test.put(p3, "EMP2");

		//System.out.println("GetName:: " + (test.get(p)));
		//System.out.println(test.get(p2));
		//System.out.println(test.get(p3));
		
		test.put(null, null);
		test.put(new Person("yy", "1"), "1");
		for (Entry<Person, String> entry : test.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		
		
		test.forEach((key,value) -> System.out.println(key + " = " + value));

		if (p2.equals(p3)) {
			System.out.println("equals");
		}
	}
}
