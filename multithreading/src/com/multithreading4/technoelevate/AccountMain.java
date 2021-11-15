package com.multithreading4.technoelevate;

public class AccountMain {
public static void main(String[] args) {
	Account account = new Account(1000);
	Husband husband = new Husband(account);
	husband.start();
	Wife wife = new Wife(account);
	wife.start();
	account.checkBalance();
			
}
}
