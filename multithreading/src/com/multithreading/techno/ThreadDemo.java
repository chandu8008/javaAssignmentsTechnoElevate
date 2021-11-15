package com.multithreading.techno;

public class ThreadDemo extends Threads {
	public static void main(String[] args) {
		//ThreadDemo demo = new ThreadDemo();
		Threads threads = new Threads();
		threads.run();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main method 1" + i);
			System.out.println("main method 2" + i);
		}

	}
}
