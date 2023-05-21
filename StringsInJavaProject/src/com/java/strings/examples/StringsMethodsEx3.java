package com.java.strings.examples;

public class StringsMethodsEx3 {

	public static void main(String[] args) {
		//String Examples 
		
		//split()
		String s23 = "Welcome to sub string concept In Strings uday"; //start with zero/0
		
		String res[] = s23.split("l");
		System.out.println("String Length is ::" +res.length);
		
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
			
		//getChars() method
		char a[] = new char[100];
		s23.getChars(11, 13, a, 0);
		System.out.println(a[0]); //array starts with zero/0
		
		//getChars() method
		s23.getChars(12, 13, a, 1);
		System.out.println(a[1]); //array starts with one/1
		
		
		//===================================================THE-END==========================================================================
	}
}
