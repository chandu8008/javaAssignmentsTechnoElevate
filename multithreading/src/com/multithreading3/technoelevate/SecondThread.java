package com.multithreading3.technoelevate;

public class SecondThread {
	public void run() {
		
		for(int i=0;i<20;i++) {
			System.out.println("Second Thread Running");
}
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
	}

	public void join() {
		// TODO Auto-generated method stub
		System.out.println("join");
	}
}
