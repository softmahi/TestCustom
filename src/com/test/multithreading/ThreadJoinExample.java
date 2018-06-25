package com.test.multithreading;

public class ThreadJoinExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable t1 = () -> {
			
			try {
				System.out.println("Thread 1 Started ");
				Thread.sleep(1000);
				System.out.println("Thread 1 In Sleep State ");
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				System.out.println("Thread 1 completed");
			}
			
		};
		
		Runnable task2 = () -> {
			
			
			System.out.println("Thread t2 completed ");
		};
		
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread1.join();
		thread2.start();
		
		
	}

}
