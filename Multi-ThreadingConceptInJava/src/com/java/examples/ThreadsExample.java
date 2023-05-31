package com.java.examples;
//Thread Example programs and steps

//Step-1 : create subclass of Thread class or Runnable Interface
class MyThread extends Thread{
	
//Step-2 : write run() method
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
}

public class ThreadsExample {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();		//main Thread
		System.out.println(t);
		
//Step-3 : create an object for above class
		MyThread tr = new MyThread();
				
//Step-4 : create an object for thread class and link it with above object tr
		Thread t1 = new Thread(tr);
		
//Step-5 : run the thread using start() method
		t1.start();
		
	}

}
