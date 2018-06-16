package com.test.immutable;

public final class Student {

	final private String name;
	final private int age;
	final private Address address;

	public Student(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public static Student createInstance(String string, int i, Address string2) {
		// TODO Auto-generated method stub
		return new Student(string, i, string2);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
