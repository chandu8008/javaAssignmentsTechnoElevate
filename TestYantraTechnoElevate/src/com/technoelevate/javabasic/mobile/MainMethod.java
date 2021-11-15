package com.technoelevate.javabasic.mobile;

public class MainMethod {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("samsung", 680000, 45);
		Mobile mobile2 = new Mobile("April", 124000.98, 3);
		System.out.println(mobile);
		System.out.println(mobile2);
		System.out.println(mobile.hashCode());
		System.out.println(mobile2.hashCode());
		System.out.println(mobile.equals(mobile2));
	}

}
