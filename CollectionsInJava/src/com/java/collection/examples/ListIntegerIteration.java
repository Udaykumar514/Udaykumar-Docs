package com.java.collection.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntegerIteration {
	
	public static void main(String[] args) {
		
		//List of Iteration is print in 3 ways are
		
		List<Integer> values = new ArrayList<>();
		values.add(10);
		values.add(50);
		values.add(80);
		values.add(45);
		
		//Iteration is starts
		//1st approach
		for(int i=0; i<values.size(); i++) {		
			System.out.println(values.get(i));
		}
		System.out.println("=================");
		
		//2nd approach
		for(int value : values) {
			System.out.println(value);
		}
		System.out.println("=================");
		
		//3rd approach
		Iterator iterator = values.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
