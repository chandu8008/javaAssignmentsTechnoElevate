package com.multithreading3.technoelevate;

public class FirstThread {
public void run() {
	
	for(int i=0;i<20;i++) {
		System.out.println("First Thread Running");
	}
}

public void start() {
	// TODO Auto-generated method stub
	System.out.println("start");
}
}
