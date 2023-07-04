package com.java.examples;

public class Ex2 {

	public static void main(String[] args) {
		String str = "This is Uday This is Uday";
		
		//Lower case and UpperCase in String
		int mid = str.length()/2;
		
		String lowerCase = "";
		String upperCase = "";
		
		for(int i=0; i<str.length(); i++) {
			if(i < mid) {
				lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
			}
			else {
				upperCase = upperCase + Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowerCase + upperCase);
		
	}
}
