package com.java.examples;

public class Examples {
	
	public static void main(String[] args) {
		String name = "uday";
		
		for(int i= name.length()-1; i>=0; i--) {
			
		
		System.out.print(name.charAt(i));
	}
	
		System.out.println();
		//Approach - 2
		
		char ch[] = name.toCharArray();
		for(int i= name.length()-1; i>=0; i--) {
			
			System.out.print(ch[i]);
		}
		
	}

}
