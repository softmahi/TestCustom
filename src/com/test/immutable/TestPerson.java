package com.test.immutable;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPerson {

	public enum Days {
		Monday, Tuesday, Wednesday
	}

	public static void main(String[] args) {

		Map<Days, String> enumExample = new EnumMap<Days, String>(Days.class);

		enumExample.put(Days.Monday, "day1");
		enumExample.put(Days.Tuesday, "day2");
		enumExample.put(Days.Wednesday, "3");

		Person p = new Person("Chintu", 12, new Address("KOl"));

		System.out.println(p);
		System.out.println(p.hashCode());
		tryModification(p.getName(), p.getAge(), p.getAddress());
		System.out.println(p);
		System.out.println(p.hashCode());

		List<String> a = Collections.singletonList("http.aCCEPT");

	}

	private static void tryModification(String name, int age, Address address) {
		name = "Chotu";
		age = 15;
		address.setRoadName("Pune");

		HashMap map = new HashMap<>();
		System.out.println("Hi");
		map.put("a", 1);
		Map m = Collections.unmodifiableMap(map);
		m.put("b", 1);
		// m.forEach((x,y)->System.out.println(x+"-"+y));

	}
}

/**
 * 
 * 
 * 
 * 
 * Java documentation itself has some guidelines identified in this link. We
 * will understand what they mean actually:
 * 
 * 1) Don’t provide “setter” methods — methods that modify fields or objects
 * referred to by fields.
 * 
 * This principle says that for all mutable properties in your class, do not
 * provide setter methods. Setter methods are meant to change the state of
 * object and this is what we want to prevent here.
 * 
 * 2) Make all fields final and private
 * 
 * This is another way to increase immutability. Fields declared private will
 * not be accessible outside the class and making them final will ensure the
 * even accidentally you can not change them.
 * 
 * 3) Don’t allow subclasses to override methods
 * 
 * The simplest way to do this is to declare the class as final. Final classes
 * in java can not be overridden.
 * 
 * 4) Special attention when having mutable instance variables
 * 
 * Always remember that your instance variables will be either mutable or
 * immutable. Identify them and return new objects with copied content for all
 * mutable objects. Immutable variables can be returned safely without extra
 * effort.
 * 
 * 
 **/