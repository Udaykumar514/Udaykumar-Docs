package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(3);
		l.add(3);
		l.add(50);
		l.add(-5);
		
		List<String> s1 =  Arrays.asList("uday", "Mike", "kiran", "nani", "sandeep", "uday", "Mile");
			
		//filter
		List<Integer> l1 =	l.stream().filter(s->s >10).collect(Collectors.toList());
		System.out.println(l1);
		
		//map
		List<Integer> l2 = l.stream().map(s->s+10).collect(Collectors.toList());
		System.out.println(l2);
		
		//count
		Integer l3 =  (int) l.stream().count();
		System.out.println(l3);
		
		//sorted (Natural sorted)
		List<Integer> l4 =	l.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		
		//Reverse Sorted
		List<Integer> l5 =	l.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l5);
		
		//String sorted (Natural sorted)
		List<String> l6 =  s1.stream().sorted().collect(Collectors.toList());
		System.out.println(l6);
		
		//Stings Reverse sorted
		List<String> l7 = s1.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l7);
		
		//forEach
		s1.stream().sorted((i1,i2) -> - i1.compareTo(i2)).forEach(System.out::println);
		
		System.out.println();
		//distinct
		s1.stream().sorted((i1,i2) -> - i1.compareTo(i2)).distinct().forEach(System.out::println);
		
		//count with distinct
		long l11 = s1.stream().sorted((i1,i2) -> - i1.compareTo(i2)).distinct().count();
		System.out.println(l11);
		
	//optional and max
	Optional<Integer> l12 = l.stream().max((i1, i2) -> i1.compareTo(i2));
	if (l12.isPresent()) {
		System.out.println(l12.get());
	} else {
		System.out.println("Not value");
	}
		
		//optional minimum
		Optional<Integer> l14 =	l.stream().min((i1, i2) -> i1.compareTo(i2));
		if(l14.isPresent()) {
			System.out.println(l14.get());
		}else {
			System.out.println("-1");
		}
		
		//String max
		String l15 =	s1.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println(l15);
	
		//String min
		String l16 =	s1.stream().min(Comparator.comparing(String::valueOf)).get();
		System.out.println(l16);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
