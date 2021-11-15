package com.multithreading4.technoelevate;

public class Wife extends Account {
	public Wife(int balance) {
		super();
		this.balance=balance;
	}
	Account acc;
	public Wife(Account acc) {
		super();
		this.acc=acc; 
	}
	public void run() {
		Thread.currentThread().setName("Wife thread");
		System.out.println(Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
		acc.deposite(3000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
	}
}
