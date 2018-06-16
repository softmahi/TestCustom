package com.test.example;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class EvenAndOdd2 {
	public static void main(String[] args) {

		int number;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number to check even or odd");
		number = in.nextInt();

		if ((number / 2) * 2 == number) {
			System.out.println(+number + " is Even number");
		} else {
			System.out.println(+number + " is Odd Number");
		}

		Vector v = new Vector<>();

		v.add(2);
		v.add(200);
		v.add(500);

		TreeSet s = new TreeSet<>(v);
		s.add(100);
		;
		s.add(200);
		System.out.println(s);
	}
}
