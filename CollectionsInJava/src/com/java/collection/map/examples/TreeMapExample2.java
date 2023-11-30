package com.java.collection.map.examples;

import java.util.TreeMap;

public class TreeMapExample2 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.put("F", 25);
		treemap.put("A", 15);
		treemap.put("Z", 17);
		treemap.put("C", 5);
		treemap.put("Y", 45);
		
	//	System.out.println("Tree Map :: " +treemap); //Sorting order printed and Insertion order is not maintained
		
		System.out.println(treemap.higherKey("C")); //check > greater than
		
		System.out.println(treemap.ceilingKey("A"));
		
		System.out.println(treemap.lowerKey("C"));
		
		System.out.println(treemap.floorKey("C"));
		
		System.out.println(treemap.firstEntry());
		
		System.out.println(treemap.lastEntry());
		
		System.out.println(treemap.subMap("C" , "Y"));
		
		System.out.println(treemap.subMap("A" , "Z"));
		
		System.out.println(treemap.subMap("A" , true  , "Z", true));
	}

}
