package com.multithreading4.technoelevate;

public class Account {
protected int balance;
public Account(int balance) {
super();
this.balance = balance;
}
public void withdraw(int amount) 
{
	if(amount>balance) {
		System.out.println("Insufficiennt balance");
		return;
	}else {
	balance -=amount;
	System.out.println("withdraw successful");
		System.out.println("Balance ="+balance);
}
}
public  void deposite(int amount) {
	int temp=balance;
	temp +=amount;
	balance=temp;
	System.out.println("deposited successfully");
System.out.println("Avaliable balance ="+balance);
}
public void checkBalance() {
	System.out.println("Balance ="+balance);
	
}
}

