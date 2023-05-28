package com.java.datastructres;

import java.util.*;

public class HashTablesExample {

	public static void main(String[] args) {
		
		Hashtable<String, Integer>  students = new Hashtable<String, Integer>();
		String name = "uday";
		System.out.println(name);
	//	System.out.println(name.hashCode()%100);
		
		students.put("uday", 1);
		students.put("kiran", 3);
		students.put("Ashok", 5);
		
		Set<String> data = students.keySet();
		for(String i : data) {
			System.out.println(students.get(i));
		//	System.out.println(students.hashCode()%10);
		}
		System.out.println();
		
		Set<Map.Entry<String, Integer>> data1 = students.entrySet();
		for(Map.Entry<String, Integer> i : data1) {
			System.out.println(i.getKey()+" " +i.getValue());
		//	System.out.println(students.hashCode()%10);
			
		}
		
	}

}
