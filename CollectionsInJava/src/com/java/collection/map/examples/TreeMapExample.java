package com.java.collection.map.examples;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.put("F", 25);
		treemap.put("A", 5);
		treemap.put("Z", 17);
		treemap.put("C", 5);
		treemap.put("Y", 45);
		
		System.out.println("Tree Map :: " +treemap); //Sorting order printed and Insertion order is not maintained
		
	}

}
