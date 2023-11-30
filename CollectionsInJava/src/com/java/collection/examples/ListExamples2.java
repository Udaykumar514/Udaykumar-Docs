package com.java.collection.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples2 {
	
	public static void main(String[] args) {
		
		List<Integer> numbersAl = new ArrayList<>();
		numbersAl.add(101);
		numbersAl.add(102);
		numbersAl.add(105);
		numbersAl.add(110);
		
		//Using indexOf and Integer.valueOf
		System.out.println("Index of Array List of Element is :: " +numbersAl.indexOf(102));
		System.out.println(numbersAl.remove(Integer.valueOf(105)));
		System.out.println(numbersAl);
		
	}
}
