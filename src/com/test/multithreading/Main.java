package com.test.multithreading;

public class Main {
	public Main() {
		System.out.println("Hi");
	}

	public int Main(int i) {
		// TODO Auto-generated constructor stub
		return i;
	}

	public static void main(String[] args) {
		
		String x= "Ma";
		String y="hesh";
		String z ="Mahesh";
		String k = x+y;
		System.out.println(k);
		System.out.println(k==z);
		
		Main m  =new Main(); 
		System.out.println(m.Main(5));
		
//		Object shared = new Object();
//		EvenRunnable evenRunnable = new EvenRunnable(shared);
//		OddRunnable oddRunnable = new OddRunnable(shared);
//		Thread evenThread = new Thread(evenRunnable, "evenThread");
//		Thread oddThread = new Thread(oddRunnable, "oddThread");
//		oddThread.start();
//		evenThread.start();
	}
}


