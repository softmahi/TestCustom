package com.test.Comparison;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComaparatorChaining {

	public static class User {

		
		String name;
		int age;
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
		public User(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
		

	}

	public static void main(String[] args) {

		List<User> users = Arrays.asList(new User("Pedro", 12), new User("Maria", 10), new User("Rafael", 12),new User("Rafael", 11));

		users.sort(Comparator.comparing(User::getName).thenComparing(User::getAge).reversed());
		users.forEach(System.out::println);
		

	}

}
