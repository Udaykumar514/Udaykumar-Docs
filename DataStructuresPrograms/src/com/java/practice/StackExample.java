package com.java.practice;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> s1= new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(65);
		s1.push(5);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		boolean status = s1.isEmpty();
		System.out.println(status);
		
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
