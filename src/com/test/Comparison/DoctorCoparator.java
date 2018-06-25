package com.test.Comparison;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.Comparison.DoctorCoparator.Doctor;

public class DoctorCoparator implements Comparator<Doctor> {

	public static class FirstnameComparator implements Comparator<Doctor> {

		@Override
		public int compare(Doctor o1, Doctor o2) {
			// TODO Auto-generated method stub
			return o1.fName.compareTo(o2.fName);
		}

	}

	public static class Doctor {

		String fName;
		String lName;
		int salary;

		public Doctor(String fName, String lName, int salary) {
			this.fName = fName;
			this.lName = lName;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Doctor [fName=" + fName + ", lName=" + lName + ", salary=" + salary + "]";
		}

	}

	public static void main(String args[]) {
		List<Doctor> list = Arrays.asList(
				new Doctor("Chandu", "Sharma", 2200), new Doctor("Ramesh", "Shahane", 1200),
				new Doctor("Sarang", "Peter", 2500), new Doctor("Gopal", "Chnadrakant", 2000));
		
		Collections.sort(list, new DoctorCoparator());
		for (Doctor doctor : list) {
			System.out.println(doctor.toString());
		}
		System.out.println("-------");
		Collections.sort(list, new FirstnameComparator());
		for (Doctor doctor : list) {
			System.out.println(doctor.toString());
		}
	}

	@Override
	public int compare(Doctor o1, Doctor o2) {

		return o1.salary - o2.salary;
	}

}
