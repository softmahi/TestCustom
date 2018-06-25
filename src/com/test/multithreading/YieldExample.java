package com.test.multithreading;

public class YieldExample {

	public static void main(String[] args) {

		System.out.println(
				"It can only make a thread from Running State to Runnable State, not in wait or blocked state.");

		Runnable producerTask = () -> {

			for (int i = 0; i < 5; i++) {
				System.out.println("Produced item ::" + i);
				Thread.yield();
			}
		};

		Runnable consumerTask = () -> {
			for (int j = 0; j < 5; j++) {
				System.out.println("Consumed item ::" + j);
				Thread.yield();
			}
		};
		Thread producerThread = new Thread(producerTask);
		Thread consumerThread = new Thread(consumerTask);

		producerThread.setPriority(Thread.MIN_PRIORITY);
		consumerThread.setPriority(Thread.MAX_PRIORITY);

		producerThread.start();
		consumerThread.start();
	}

}
