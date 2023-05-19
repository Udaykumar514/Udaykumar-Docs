package com.java.collections.examples;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		// ArrayListExamples In Java
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("uday");
		list.add("kiran");
		list.add("Ashok");
		System.out.println(list);
		System.out.println(list.contains("mahesh"));
		//list.equals("udaykumar");
		System.out.println("Empty::"+(list.isEmpty()));
		
		System.out.println("Size::"+(list.size()));
		System.out.println("Contains :: " +list.contains("uday"));
		
		System.out.println("Contains :: " +list.remove("Ashok"));
		System.out.println("After removing list::"+list);
		
		//for-each method
		for(String s : list) {
			System.out.println("Hello :" +s+ "This is Java collections");
		}

	}

}
