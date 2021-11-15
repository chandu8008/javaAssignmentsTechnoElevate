package com.multithreading5.technoelevate;

public class Manufacture extends Thread {
	Godown godown;
	int noOfItems;
	public Manufacture(Godown godown,int noOfItems) {
		super();
		this.godown = godown;
		this.noOfItems = noOfItems;
	}
	@Override
	public void run() {
		godown.store(noOfItems);
	}

}
