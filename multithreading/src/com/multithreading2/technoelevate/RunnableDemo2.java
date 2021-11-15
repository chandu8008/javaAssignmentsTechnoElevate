package com.multithreading2.technoelevate;

public class RunnableDemo2 implements Runnable {
	@Override
	public void run () {
		for(int i=0; i<5; i++);
		System.out.println(" Thread2 running");
	}
}
