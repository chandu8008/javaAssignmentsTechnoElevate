package com.multithreading1.technoelevate;

public class ThreadMain {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(6);//main
		System.out.println("Main Thread Priority"+Thread.currentThread().getPriority());
		
		 MyThread thread = new MyThread();
		 Thread thread2 = new Thread(thread);
		 System.out.println("Thread 2 priority ; "+thread2.getPriority());
		 thread2.setPriority(7);
		 thread2.setName("chandru");
		 System.out.println("My Thread Priority");
		 System.out.println("Thread 2 priority ; "+thread2.getPriority());
		 System.out.println(thread2.getName());
		 
		 thread2.start();

		 for(int i=0; i<10; i++) {
			 System.out.println("main method");
		 }
		}
		}

