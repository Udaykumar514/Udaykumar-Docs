package com.java.collection.map.examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 5);
		map.put("G", 3);
		map.put("Z", 10);
		map.put("AA", 5);
		map.put("AA", 85);
		System.out.println("map ::" +map); //Insertion order is Not maintained and duplicated key is allowed
		
		//Methods / Operations
		System.out.println("map.size() ::" +map.size());
		System.out.println("map.isEmpty ::" +map.isEmpty());
		System.out.println("map.containsKey ::" +map.containsKey("G"));
		System.out.println("map.containsValue ::" +map.containsValue(10));
		System.out.println("map.keySet ::" +map.keySet());
		System.out.println("map.values ::" +map.values());
		System.out.println("map" + map);
		
		
	}
}
