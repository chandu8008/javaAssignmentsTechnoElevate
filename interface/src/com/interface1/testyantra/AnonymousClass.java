package com.interface1.testyantra;

public class AnonymousClass {
	public static void main(String[] args) {
		Interface singer = new Interface() {
		@Override
				 public void name() {
					System.out.println("my name is chandu");
				}
	public int age() {
		System.out.println("age is 23");
		return 0;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
			};
			singer.name();
			singer.age();
			singer.display();
			
				}
}

