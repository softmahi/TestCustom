package com.test.oops;

import java.util.HashSet;

public class forLoop {

	public static void main(String[] args) {

		HashSet shortSet = new HashSet();
		shortSet.remove(-1);
		for (short i = 0; i < 100; i++) {
			short k = (short) (i+1);
			System.out.println("Added"+k);
			shortSet.add(k);
			short s =(short) (i+1);
			System.out.println("Removed--->"+s);
			shortSet.remove(s);
		}
		// what will be the output?
		System.out.println("size:"+shortSet.size());
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i-1);
			
		}

	}

}
