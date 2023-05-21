package com.java.strings.examples;

public class StringsMethodsEx2 {

	public static void main(String[] args) {
		// Strings Method Examples
		
		//startsWith()
		String s14 = "Welcome To Java";
		System.out.println("String startsWith() Method Result is ::"+ s14.startsWith("Wel"));
		
		//endsWith()
		String s15= "Hello This is java";
		System.out.println("String startsWith() Method Result is ::" + s15.endsWith("javas"));
		
		//indexOf()
		String s16 = "Hello uday";
		System.out.println("String indexOf() Method Result is ::"+ s16.indexOf("u"));
		
		//lastIndexOf()
		String s17 = "Heelo uday In java"; //String count start with 0
		System.out.println("String lastIndexOf() Method Result is :: " +s17.lastIndexOf("java"));
		
		//replace()
		String s18 = "Welcome to Java uday"; //checking ,replaced string
		System.out.println("String Replace() Method Result is::"+ s18.replace("uday", "World"));
		System.out.println("String Replace() Method Result is::"+ s18.replace('o', 'z'));
		
		//subString()
		String s19 = "Welcome to sub string concept In Strings uday";
		System.out.println("String subString() Method Result is ::" + s19.substring(11));
		System.out.println("String subString() Method Result is ::" + s19.substring(11 , 13)); //exclusive before number count

		//toLowerCase()
		String s20 = "HELLO uday";
		System.out.println("String toLowerCase() Method Result is ::" +s20.toLowerCase());
		
		//toUpperCase()
		String s21 = "hello uday kiran";
		System.out.println("String toUpperCase() Method Result is ::" + s21.toUpperCase());
		
		//trim()
		String s22 = "    Hello This Is Trim In String Methods in JAVA   ";
		System.out.println("String Trim() Method Result is :: " + s22.trim());
		
	}

}
