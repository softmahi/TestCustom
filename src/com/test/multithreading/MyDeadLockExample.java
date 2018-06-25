package com.test.multithreading;

public class MyDeadLockExample {

	String str1 = "JAVA";
	String str2 = "UNIX";

	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				synchronized (str2) {
					synchronized (str1) {
						System.out.println("Thread1:::" + str1 + str2);
					}
				}
			}
		}
	});

	Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				synchronized (str1) {
					synchronized (str2) {
						System.out.println("Thread2:::" + str1 + str2);
					}
				}
			}
		}
	});

	public static void main(String[] args) {

		MyDeadLockExample deadLockExample = new MyDeadLockExample();

		deadLockExample.t1.start();
		deadLockExample.t2.start();

	}

}
