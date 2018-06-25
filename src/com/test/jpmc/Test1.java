package com.test.jpmc;

class B extends A {

	public static void hello() {

		System.out.println("Class B Hello Called.");
	}
}

class A {

	public static void hello() {

		System.out.println("Class A Hello Called.");
	}

}


class Test1 {

	public static void main(String[] args) {
		B a = null; a.hello();
		/**
		 * 
		 * B a= new A();
		 * 
		 * Exception in thread "main" java.lang.ClassCastException: com.test.jpmc.A
		 * cannot be cast to com.test.jpmc.B at com.test.jpmc.Test1.main(Test1.java:14)
		 * 
		 */
		/**
		 * A a = null; a.hello();
		 * 
		 * 
		 * output : Class A Hello Called.
		 * 
		 **/
		
//		A a = new B();
//		a.hello();
		
		
	}
}

