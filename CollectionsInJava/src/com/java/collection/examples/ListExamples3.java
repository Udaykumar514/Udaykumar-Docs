package com.java.collection.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListExamples3 {
	
	public static void main(String[] args) {
		
		//Differences of HashSet, LinkedHashSet, TreeSet
		
		//HashSet
		Set<Integer> numbers = new HashSet<>();
		numbers.add(765432);
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
	    System.out.println("HashSet Values :: " + numbers); //Print values Not an insertion order
	    
	    //LinkedHashSet
	    Set<Integer> numbers1 = new LinkedHashSet<>();
	    numbers1.add(765432);
	    numbers1.add(76543);
	    numbers1.add(7654);
	    numbers1.add(765);
	    numbers1.add(76);
	    System.out.println("LinkedHashSet Values :: " + numbers1);  //Print values insertion order
	    
	    //TreeSet
	    Set<Integer> numbers2 = new TreeSet<>();
	    numbers2.add(765432);
	    numbers2.add(76543);
	    numbers2.add(7654);
	    numbers2.add(765);
	    numbers2.add(76);
	    System.out.println("TreeSet Values :: " + numbers2);  //Print values Not an insertion order but it is printed sorting order
	 
		
	}

}
