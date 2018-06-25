package com.test.jpmc;

public class Test2 {
	int a = 10;
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println(t.a);
		changeValue(t);
		System.out.println(t.a);
		
	}

	private static void changeValue(Test2 t) {
		// TODO Auto-generated method stub
		t.a = t.a+10;
	}
}

