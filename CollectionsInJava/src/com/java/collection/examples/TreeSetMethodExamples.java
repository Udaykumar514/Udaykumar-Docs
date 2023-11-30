package com.java.collection.examples;

import java.util.TreeSet;

public class TreeSetMethodExamples {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(12);
		numbers.add(34);
		numbers.add(54);
		numbers.add(65);
		numbers.add(99);
	//	System.out.println(numbers);
		
		//lower than 40 in this list
		numbers.floor(40);
		System.out.println("lower than 40 in this list ::" +numbers.floor(40));
		
		numbers.floor(34);
		System.out.println("lower than 34 in this list ::" +numbers.floor(34)); 
		
		numbers.lower(34);
		System.out.println("lower than 34 in this list ::" +numbers.lower(34));  //<
		
		numbers.higher(34);
		System.out.println("higher than 34 in this list ::" +numbers.higher(34));  //>
		
		numbers.subSet(20, 80);
		System.out.println("subset in this list ::" +numbers.subSet(20, 80)); 
	
		numbers.subSet(34, 54);
		System.out.println("subset in this list ::" +numbers.subSet(34 , true , 65,true)); 
	
		numbers.subSet(34, 54);
		System.out.println("subset in this list ::" +numbers.subSet(34 , false , 65,false)); 
		
		numbers.headSet(50);
		System.out.println("Head set is :: " + numbers.headSet(50));
		
		numbers.tailSet(50);
		System.out.println("Tail set is :: " + numbers.tailSet(50));

	}

}
