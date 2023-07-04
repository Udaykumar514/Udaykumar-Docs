package com.java.examples;

public class RemoveSpecialCharactersExample {

	public static void main(String[] args) {
		
		// RemoveSpecialCharactersExample
		String str = "$ja!Va&$@st!r";
		
		//Approach-1 replaceAll() method
		String str1 =str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
		

	}

}
