package com.java.strings.examples;

public class StringsCreationEx {

	public static void main(String[] args) {
		// Strings Examples in Java
	//	Strings are creation in 3 -ways
		
	//1)First-Way creation
		String name;		
		name = "uday";
		System.out.println("First-Way of String creation::"+name);
		
	//2nd - Way creation
		String x = new String("uday");
		System.out.println("Second-Way of String creation::" +x);
		
	//3rd - Way creation
		char c[] = {'u', 'd', 'a', 'y'};
		String s1 = new String(c);
		System.out.println("Third-Way of String creation::" +s1);
		
	}

}
