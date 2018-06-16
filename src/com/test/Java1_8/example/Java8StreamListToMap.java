package com.test.Java1_8.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.Java1_8.example.Java8StreamListToMap.Person.Gender;

public class Java8StreamListToMap {
	public static class Person {

		private int personId;
		private String name;
		private int age;
		private Gender gender;

		public Person(int personId, String name, int age, Gender gender) {
			super();
			this.personId = personId;
			this.name = name;
			this.age = age;
			this.gender = gender;
		}

		public boolean isMale() {
			return this.gender == Gender.MALE;
		}

		public boolean isFemale() {
			return this.gender == Gender.FEMALE;
		}

		public int getPersonId() {
			return personId;
		}

		public void setPersonId(int personId) {
			this.personId = personId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			StringBuilder str = null;
			str = new StringBuilder();
			str.append("Person Id:- " + getPersonId() + " Gender:- " + getGender() + " Name:- " + getName() + " Age:- "
					+ getAge());
			return str.toString();
		}

		public static enum Gender {
			MALE, FEMALE
		}
	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1, "Divya", 24, Gender.FEMALE));
		persons.add(new Person(2, "Mahesh", 22, Gender.MALE));
		persons.add(new Person(3, "Dinesh", 32, Gender.MALE));

		Map<Integer, String> map = persons.stream().collect(Collectors.toMap(p -> p.getPersonId(), p -> p.getName()));
		System.out.println("Map:- " + map);

	}
}
