package com.multithreading2.technoelevate;

public class RunnableMain {
public static void main(String[] args) {
	System.out.println("Main Thread priority:"+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(6);
	System.out.println("Main Thread priority:"+Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().getName());
	RunnableDemo1 demo1=new RunnableDemo1();
	Runnable demo2=new RunnableDemo2();
	Thread thread=new Thread(demo1);
	thread.setName("chandra");
	thread.start();
	System.out.println(thread.getName());
	thread.setPriority(7);
	System.out.println("Thread priority:"+thread.getPriority());
	System.out.println("Main Thread priority:"+Thread.currentThread().getPriority());
	thread=new Thread(demo2);
	thread.setName("prpjector manager");
	System.out.println(thread.getName());
	thread.start();
	thread.setPriority(8);
	System.out.println("Thread2 priority:"+thread.getPriority());
	for(int i=0; i<5;i++) {
		System.out.println("Main thread running");
	}	
}

}
