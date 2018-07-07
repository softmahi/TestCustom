package com.mahesh.test;

class  Car {
	static void run() {
		System.out.println("car is running");
	}
}

class  Audi extends Car {
	static void run() {
		System.out.println("Audi is running safely with 100km");
	}

	/**
	 * Check static references
	 * @param args
	 */
	public static void main(String args[]) {
		Car b = new Audi(); // upcasting
		b.run();
		
		Audi a = new Audi(); // upcasting
		a.run();
	}
}