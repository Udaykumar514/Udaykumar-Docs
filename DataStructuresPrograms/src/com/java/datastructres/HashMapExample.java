package com.java.datastructres;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
	//	Hashtable<String, Integer> students = new Hashtable<String, Integer>();
		HashMap<String, Integer> students = new HashMap<String, Integer>();
		students.put("uday", 1);
		students.put("kiran", 2);
		students.put("Ashok", 3);
		
		Set<String> data = students.keySet();
		for(String i : data) {
			System.out.println(students.get(i));
		}
		System.out.println();
		Set<Map.Entry<String, Integer>> data1 = students.entrySet();
		
		for(Map.Entry<String, Integer> i : data1) {
			System.out.println(i.getKey()+ " " + i.getValue());
		}
	}

}
