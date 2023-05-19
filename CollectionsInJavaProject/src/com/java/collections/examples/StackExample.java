package com.java.collections.examples;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Stack Examples in collections
		
		Stack<String> list = new Stack<String>();
		
		list.push("uday");	//first
		list.push("kiran");
		list.push("James");
		list.push("Ashok"); //last
		System.out.println(list.contains("uday"));
		System.out.println(list.clone());
		System.out.println("peek element Before is ::" +list.peek());
		System.out.println(list.elementAt(2));
		System.out.println(list.pop());
		System.out.println("peek element After is ::" +list.peek());
		System.out.println("First Element is:: "+list.firstElement());
		System.out.println("Last Element is:: "+list.lastElement());
		System.out.println("Get elements ::" +list.get(2));
		System.out.println("Search elements ::" +list.search("uday"));
		System.out.println("Stack is Empty::" + list.isEmpty());
		
		//Iterator
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {			
			System.out.println("Hello " +it1.next());
		}

	}

}
