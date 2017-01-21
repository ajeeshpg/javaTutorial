package com.ajeesh.thread;

import java.lang.Thread.UncaughtExceptionHandler;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new MyThread());
		t1.start();
		

	}

}

class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
		System.out.println(" Running "+Thread.currentThread().getName());
		System.out.println(">>"+Integer.parseInt("X"));
		System.out.println("END");
	}

	
	
}

class ExceptionHandler implements UncaughtExceptionHandler{
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("Error "+e.getMessage());
	}
}