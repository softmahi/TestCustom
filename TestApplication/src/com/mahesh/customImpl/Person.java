package com.mahesh.customImpl;


public final class Person {

	private final String name;
	
	private final String age;

	public String getAge() {
		return age;
	}

	public Person(String name,String age) {
		
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		System.out.println(age.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		System.out.println("1..........."+result);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println(result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
