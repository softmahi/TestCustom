package com.test.example;

public class Child extends Parent{
	static{
		System.out.println("hello Child Static");
	}
	{
		System.out.println("Hello Child Instance block");
	}
	
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Constrcutor");
	}
	public final strictfp synchronized static void main(String... durga) {
		new Child();
		
	}
	protected void m1() {
		// TODO Auto-generated method stub
		System.out.println("Child m1 print");
	}
	
}
