package com.java.collection.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListExamples4 {
	
	public static void main(String[] args) {
		
		//TreeSet
		TreeSet<Character> characters = new TreeSet<>();
		characters.add('A');
		characters.add('Z');
		characters.add('A');
		characters.add('B');
		characters.add('Z');
		characters.add('F');
		
		System.out.println(characters); //Insertion order not maintain without duplicates and sorting order
		
		//LinkedHashSet
		Set<Character> characters1 = new LinkedHashSet<>();
		characters1.add('A');
		characters1.add('Z');
		characters1.add('A');
		characters1.add('B');
		characters1.add('Z');
		characters1.add('F');
		
		System.out.println(characters1); //Insertion order without duplicates
		
		//HashSet
		Set<Character> characters2 = new HashSet<>();
		characters2.add('A');
		characters2.add('Z');
		characters2.add('A');
		characters2.add('B');
		characters2.add('Z');
		characters2.add('F');
		
		System.out.println(characters2); //Insertion order Not maintain without duplicates
	
		
		
	}

}
