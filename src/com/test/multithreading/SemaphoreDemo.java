package com.test.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static int MAX = 10;
	public static Integer number = new Integer(0);

	// Unlocked state
	public Semaphore semaphore = new Semaphore(1);

	class PrinterThread extends Thread {

		int start = 0;
		String name;

		PrinterThread(String name, int start) {
			this.start = start;
			this.name = name;
		}

		@Override
		public void run() {
			try {
				while (start < MAX) {
					// try to acquire the number of semaphore equal to your value
					// and if you do not get it then wait for it.
					semaphore.acquire(start);
					System.out.println(name + " : " + start);
					// prepare for the next iteration.
					start += 2;
					// release one less than what you need to print in the next iteration.
					// This will release the other thread which is waiting to print the next number.
					int k = start-1;
					//System.out.println("Released Permit :"+(k));
					semaphore.release(k);
				}
			} catch (InterruptedException e) {

			}
		}
	}

	public static void main(String args[]) {
		SemaphoreDemo test = new SemaphoreDemo();
		PrinterThread a = test.new PrinterThread("Odd", 1);
		PrinterThread b = test.new PrinterThread("Even", 2);
		try {
			a.start();
			b.start();
		} catch (Exception e) {

		}
	}
}
