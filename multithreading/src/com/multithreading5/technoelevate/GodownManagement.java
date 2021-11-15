package com.multithreading5.technoelevate;

public class GodownManagement {
public static void main(String[] args) {
	Godown godown = new Godown(100);
	new Customer(godown,80).start();
	new Customer(godown,50).start();
	try {
		Thread.sleep(1000);
	}catch (InterruptedException e) {
	 e.printStackTrace();
		// TODO: handle exception
	}
	new Manufacture(godown,50).start();
	}
}

