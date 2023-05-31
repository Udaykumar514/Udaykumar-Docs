package com.java.examples;
//Thread Example programs and steps

//Step-1 : create subclass of Thread class or Runnable Interface
class MyNewThread extends Thread{
	
	String tname;
	MyNewThread(String s){
		
		tname =s;
		
	}
//Step-2 : write run() method
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(tname+ " " +i);
		}
	}
	
}

public class ThreadsExample2 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();		//main Thread
		System.out.println(t);
		
//Step-3 : create an object for above class
		MyNewThread tr = new MyNewThread("FirstThread");
				
//Step-4 : create an object for thread class and link it with above object tr
		Thread t1 = new Thread(tr);
		t1.setName("FirstThread");
		System.out.println(t1);
		
		Thread t2 = new Thread(tr);
		t2.setName("SecondThread");
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t2);
//Step-5 : run the thread using start() method
		t1.start();
		
	}

}
