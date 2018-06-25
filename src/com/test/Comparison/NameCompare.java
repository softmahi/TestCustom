package com.test.Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameCompare {

	//compare by first name and then last name
	public static class Person implements Comparable<Person> {

		String lName;
		String fname;

		Person(String fname, String lName) {
			this.fname = fname;
			this.lName = lName;
		}

		@Override
		public int compareTo(Person o) {
			if (this.fname.compareTo(o.fname) == 0) {
				return this.lName.compareToIgnoreCase(o.lName);
			}
			return this.fname.compareTo(o.fname);
		}

	}

	public static void main(String arg[]) {

		Person p1 = new Person("Sam", "Anand1");
		Person p2 = new Person("Sam", "Kumar");
		Person p3 = new Person("Anand", "Khanna");

		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		Collections.sort(personList);

		for (Person person : personList) {
			System.out.println(person.fname + "-" + person.lName);
		}

	}

}
