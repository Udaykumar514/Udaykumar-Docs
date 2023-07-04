package com.java.examples;

public class ReverseOfStringExample {

	public static void main(String[] args) {
		//Reverse of String in java
		
		//Approach-1  Using toCharArray() Array
		String name = "programming";
		char ch[] = name.toCharArray(); 
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//Approach-2 using charAt() method
		for(int i=name.length()-1; i>=0;  i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		//Approach-3 Using StringBuffer
		StringBuffer sb= new StringBuffer(name);
		System.out.println(sb.reverse());
		
		//Approach-4 Using StringBuilder
		StringBuilder SB= new StringBuilder(name);
		System.out.println(SB.reverse());
		
	}
}
