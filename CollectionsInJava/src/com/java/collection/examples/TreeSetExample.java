package com.java.collection.examples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> number = new TreeSet<>();
		number.add(78645);
		number.add(7894);
		number.add(789);
		number.add(78);
	//	System.out.println(number);
		
		Iterator<Integer> itr = number.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
