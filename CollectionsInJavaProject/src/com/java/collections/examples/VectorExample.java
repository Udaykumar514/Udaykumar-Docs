package com.java.collections.examples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector List Examples in Collections
		
		Vector<String> names = new Vector<String>(5, 2);
		names.add("uday");
		names.add("uday");
		names.add("uday");
		names.add("uday");
		names.add("uday");
		System.out.println("names Before list::"+ names.capacity());
		names.add("uday");
		names.add("uday");
		System.out.println("names After list::"+ names.capacity());
		names.add("kiran");
		
		System.out.println("names After Next list::"+ names.capacity());
		
		System.out.println("Contains::" +names.contains("uday"));
		System.out.println(names.firstElement());
		System.out.println(names.lastElement());
		
		System.out.println(names.elements());
		
		System.out.println("Index of elements::" +names.indexOf("kiran"));
		
		//Enumeration Example
		Enumeration en = names.elements();
		while(en.hasMoreElements()) {
			System.out.println("Hello ::" +en.nextElement());
		}
		
		
	}
	
}
