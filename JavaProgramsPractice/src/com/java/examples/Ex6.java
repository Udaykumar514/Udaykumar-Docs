package com.java.examples;

import java.util.StringJoiner;

public class Ex6 {

	public static void main(String[] args) {
		
		StringJoiner s1 = new StringJoiner("," , "[" , "]");
		s1.add("A").add("B").add("C");
		System.out.println(s1);
		
		StringJoiner s2 = new StringJoiner(":");
		s2.add("P").add("Q");
		
		s1.merge(s2);
		System.out.println(s1);
	}
}
