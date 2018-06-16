package com.test.example;

import java.util.concurrent.ConcurrentHashMap;

public class Parent {
	
	
	//ConcurrentHashMap<K, V>
	protected void m1() {
		// TODO Auto-generated method stub
		System.out.println("Parent m1 print");
	}
	
	static{
		System.out.println("hello Parent Static");
	}
	
	{
		System.out.println("Hello Parent instance");
	}
	public Parent() {
	System.out.println("Hello Parent Constructor");
		// TODO Auto-generated constructor stub
	}

}
