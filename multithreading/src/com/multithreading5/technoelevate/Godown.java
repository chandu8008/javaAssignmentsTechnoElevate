package com.multithreading5.technoelevate;

public class Godown {
int products;
public Godown(int product) {
	super();
	this.products = products;
}
public synchronized void store(int noOfItems) {
	products +=noOfItems;
	System.out.println("stored the products succesfully\nAvaliable products ="+products);
	this.notify();
}
public synchronized void purchase(int noOfItems) {
	while(noOfItems>products) {
		System.out.println("out of stock!!!please wait for some time");
		try {
			this.wait();
		}catch (InterruptedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
		}
	products -= noOfItems;
	System.out.println("purchase successful\nAvaliable products ="+products);
}
}