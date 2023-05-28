package com.java.stack;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer>  s1 = new Stack<>();
		s1.push(50);
		s1.push(20);
		s1.push(60);
		s1.push(4);
		s1.push(30);
		s1.push(5);
		s1.push(3);
		System.out.println(s1);
		s1.add(3, 85);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.pop();
		s1.pop();
	//	s1.pop();
	//	s1.pop();
	//	s1.pop();
	//	s1.pop();
		s1.pop();
		
		System.out.println(s1);
		//peekup
		System.out.print("peekup LIFO Element is ::" +s1.peek());
		System.out.println();
		boolean status = s1.isEmpty();
		System.out.println("Stack is Empty:: " +status);
		
		//Iterator
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
}
