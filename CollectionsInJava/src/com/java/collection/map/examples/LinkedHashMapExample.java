package com.java.collection.map.examples;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("F", 35);
		linkedHashMap.put("A", 75);
		linkedHashMap.put("E", 45);
		linkedHashMap.put("B", 15);
		linkedHashMap.put("G", 3);
		
		System.out.println("Linked Hash Map is :: " +linkedHashMap);  //Insertion order is maintained

	}

}
