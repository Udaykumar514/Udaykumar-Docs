package com.java.collection.map.examples;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Z", 5);
		hashMap.put("F", 15);
		hashMap.put("A", 25);
		hashMap.put("L", 250);	
		System.out.println("HashMap is ::" +hashMap); //Insertion order is Not maintained
		
	}

}
