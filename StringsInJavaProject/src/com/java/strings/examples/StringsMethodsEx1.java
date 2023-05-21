package com.java.strings.examples;

public class StringsMethodsEx1 {

	public static void main(String[] args) {
		// Strings Method Examples
		
		//concat()
		String s1 = "Welcome To";
		System.out.println("Concatination of String Result is ::" + s1.concat(" Strings Concept to Learn In Java"));

		String s2 = "Hello";
		String s3 = " Welcome To Java";
		System.out.println("Concatination of 2nd way String Result is ::" + s2.concat(s3));
		
		//charAt()
		String s4 = "Hello This is String";
		System.out.println("String charAt() Method Result is ::" +s4.charAt(16));
		
		//length()
		String s5 = "Welcome To Uday World";
		System.out.println("String length() Method Result is :: " + s5.length());
		
		//compareTo()
		String s6 = "Uday";		//equal string = 0 
		String s7 = "uday";		//Different string is showing +ve number (s6 > s7)
		System.out.println("String compateTo() Method Result is::" +s6.compareTo(s7)); //Different string is showing -ve number (s6 < s7)
		
		//compareToIgnoreCase()
		String s8 = "java";
		String s9 = "JAVA";  //String Either LowerCase/UpperCase is an "compareToIgnoreCase()" using this Method
		System.out.println("String compareToIgnoreCase() Method Result is::" + s8.compareToIgnoreCase(s9));
		
		//equals()
		String s10 = "Hello Im in String equals method";
		String s11 = "hello Im in string equals method";		//equals() return boolean either true/false it is equals showing true or else false 
		System.out.println("String equals() Method Result is::" + s10.equals(s11));
			
		//eqaulsIgnoreCase()
		String s12 = "Hello Im String In Java";
		String s13 = "HELLO IM STRING IN JAVA";		//eqaulsIgnoreCase() Either LowerCase/UpperCase it is Ignore it shows equals
		System.out.println("String eqaulsIgnoreCase() Method Result is::" + s12.equalsIgnoreCase(s13));
		
	}

}
