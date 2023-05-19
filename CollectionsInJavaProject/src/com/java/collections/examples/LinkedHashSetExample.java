package com.java.collections.examples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// LinkedHashSetExample in Java
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("uday");
		names.add("kiran");
		names.add("cake");
		names.add("cake");
		names.add("Dog");
		names.add("Dog");
		System.out.println(names);

		System.out.println("Is Empty::" +names.isEmpty());
		System.out.println("Is Hashcode::" +names.hashCode());
		
		names.remove("uday");
		System.out.println(names);
		
		for(String s: names) {
			System.out.println("Hello::" +s);
		}
		
	}

}
