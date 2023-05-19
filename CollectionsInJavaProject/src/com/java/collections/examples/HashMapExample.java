package com.java.collections.examples;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		//HashMap Example In Java
		
		HashMap<Integer, String> list = new HashMap<Integer, String>();
		
		list.put(1, "uday");
		list.put(4, "uday");
		list.put(2, "kiran");
		list.put(3, "Ashok");
		System.out.println(list);
		
		System.out.println(list.containsKey(2));
		if(list.containsValue("uday")) {
			System.out.println("List of Value is ::" +list.containsValue("uday"));
		}
			System.out.println("List of key is ::" + list.containsKey(3));
	
		if(list.isEmpty()) {
			System.out.println("Map is Empty::" + list);
		}
		else {
			System.out.println("Map Size is ::" + list.size());
		}
		
		System.out.println("Key set value is ::"+ list.keySet());
		System.out.println("Value set is ::" +list.containsValue("uday"));
		System.out.println("The key set values is ::" + list.values());
		System.out.println("The Index value is ::" +list.get(3));
			
			
	}

}
