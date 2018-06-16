package com.test.immutable;

public class TestImmutable {

	public static void main(String[] args) {

		Student s = new Student("Chintu", 12, new Address("Kol"));
		System.out.println(s);
		tryModification(s.getName(), s.getAge(), s.getAddress());
		System.out.println(s);
	}

	private static void tryModification(String name, int age, Address address) {

		name = "Sonu";
		age = 25;
		address = new Address("Pune");
		// TODO Auto-generated method stub

	}

}
