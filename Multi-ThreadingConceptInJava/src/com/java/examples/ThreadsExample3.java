package com.java.examples;
//Thread Example programs and steps

class MyNewThreadThree extends Thread{
	
	String tname;
	MyNewThreadThree(String s){		
		tname =s;		
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(tname+ " " +i);
			
			try {
			Thread.sleep(1000);		//sleep() method
			}catch(Exception e) {
				
			}
		}
	}	
}

public class ThreadsExample3 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();	//main Thread
		System.out.println(t);
	
		ThreadGroup tg = new ThreadGroup("ThreadGroup"); 	//ThreadGroup -> Thread Group name was change.
		
		MyNewThreadThree tr = new MyNewThreadThree("FirstThread");	//First Thread
				
		Thread t1 = new Thread(tg,tr);
		t1.setName("FirstThread");
		System.out.println(t1);
		tr.setDaemon(true);
		
		MyNewThreadThree tr1 = new MyNewThreadThree("SecondThread"); //Second Thread
		
		Thread t2 = new Thread(tg, tr1);
		t2.setName("SecondThread");				//setName()
		t2.setPriority(Thread.MIN_PRIORITY);	//setPriority()
		System.out.println(t2);
		
		tr1.setDaemon(true);			//setDaemon() is true
		System.out.println("Is Main thread is daemon::" +t.isDaemon());	 //Main Thread
		System.out.println("Is First thread is daemon::" +tr.isDaemon()); //First Thread
		System.out.println("Is Second thread is daemon::" +tr1.isDaemon()); //Second Thread

		t1.start();
		
		try {
			t1.join();				//join() method
		}catch(Exception e) {}
		
		
		t2.start();
		try {
			t2.join();				//join() method
		}catch(Exception e) {
			
		}
		
		System.out.println("Main Thread Ended");
		
		
	}

}
