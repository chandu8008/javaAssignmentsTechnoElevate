package com.multithreading3.technoelevate;

public class MainThread {
	public static void main(String[] args) {
		FirstThread firstthread = new FirstThread();
		SecondThread thread = new SecondThread();
		Thread thread1 = new Thread();
		firstthread.start();
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
