package com.java.collections.examples;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		//Linked List Example in Java
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("uday");//3
		names.add("Sanju");//2
		names.add("kavya");//1
		names.add("kumar");//0
		System.out.println("First Before Names to print::" +names);
		names.addFirst("Ravi");
		names.addLast("Don");
		System.out.println("Second After Names to print::" +names);
		
	//	names.clear();
	//	System.out.println("Second After Names to print::" +names);

		System.out.println("Names to Clone::" +names.clone());
		System.out.println("Names to Contains::" +names.contains("uday"));
		System.out.println(names.element());
		System.out.println("Elements names is IsEmpty::" +names.isEmpty());
		System.out.println("peek element is::"+names.peek());
		System.out.println("Get the value is:: " +names.get(2));
		//names.notify();
		
		//ListIterator
		ListIterator li = names.listIterator();
		while(li.hasNext()) {
			System.out.println("Hello THis is List Iterator ::" +li.next());
		}
		
	}

}
