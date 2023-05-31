package com.java.examples;

//Movie Ticket Booking using synchronized() method and concept of MultiThreading in Java
class ticketBooking{
	
	boolean booked = false;
	
	public synchronized void bookTicket(String name) {   //synchronized to pass method level or method below block code use this synchronized() method
		
	//	synchronized(this) {
		if(booked == false) {
			System.out.println(name+ " Selected the seat");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			System.out.println(name+ " Completed the Payment");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			
			System.out.println(name+ " get the Ticket");
			booked = true;
		}
		else {
			System.out.println("Sorry " +name+", This seat is already booked");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			System.out.println(name+ " Booked bus Ticket");
			
		}
	}		
		
	}
// }

class threadClass extends Thread{

	ticketBooking tkt;
	String name;
	
	threadClass(ticketBooking obj, String s){
		tkt = obj;
		name =s;
	}
	
	public void run() {
		tkt.bookTicket(name);
	}
}

public class ThreadMovieTicketBookingSyncExample {

	public static void main(String[] args) {
		
		ticketBooking seat7 = new ticketBooking();
		
		threadClass uday =  new threadClass(seat7, "uday");	 //First Thread
		Thread uda = new Thread(uday);
		uda.start();
		
		try {
			uda.join();
		}catch(Exception e) {
			
		}
		
		threadClass kiran =  new threadClass(seat7, "kiran"); //Second Thread
		Thread kir = new Thread(kiran);
		kir.start();

	}

}
