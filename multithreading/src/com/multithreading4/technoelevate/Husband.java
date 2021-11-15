package com.multithreading4.technoelevate;

public class Husband extends Account {
Account acc;
public Husband(Account acc, int balance) {
	super(balance);
	this.acc=acc;
}
public void run() throws InterruptedException {
	Thread.currentThread().setName("Husband thread");
	System.out.println(Thread.currentThread().getName());
	Thread.sleep(1000);

    acc.deposite(3000);
}
public void start() {
	// TODO Auto-generated method stub
	System.out.println("start");
}
}

