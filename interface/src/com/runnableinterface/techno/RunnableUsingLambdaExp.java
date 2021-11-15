package com.runnableinterface.techno;

public class RunnableUsingLambdaExp {
public static void main(String[] args) {
	Runnable runnable =()->{
		System.out.println("My Thread");
		for(int i=0; i<10; i++) {
			try {
			Thread.sleep(1000);
			System.out.println("run method");
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			}
	};
	Thread thread = new Thread(runnable);
	thread.start();
}
}
