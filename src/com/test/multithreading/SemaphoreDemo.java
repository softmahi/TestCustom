package com.test.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
	Semaphore semaphore = new Semaphore(1);

	public void printLock(String string) {
		try {
			semaphore.acquire(16);
			System.out.println("Locks acquired"+string);
			System.out.println("Locks remaining >> " + semaphore.availablePermits());
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} finally {
			semaphore.release(5);
			System.out.println("Locks Released"+semaphore.availablePermits());
		}
	}

	public static void main(String[] args) {
		final SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
		Thread thread = new Thread("one") {
			@Override
			public void run() {
				semaphoreDemo.printLock("1");
			}
		};
		Thread thread1 = new Thread("2") {
			@Override
			public void run() {
				semaphoreDemo.printLock("2");
			}
		};
		thread.start();
		thread1.start();
	}
}