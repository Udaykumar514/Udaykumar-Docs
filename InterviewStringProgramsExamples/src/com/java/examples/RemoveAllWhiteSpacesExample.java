package com.java.examples;

public class RemoveAllWhiteSpacesExample {

	public static void main(String[] args) {
		
	//RemoveAllWhiteSpacesExample	
	String str = " j   a v a s  t r ";
	String str1 =	str.replaceAll("\\s", "");
	System.out.println(str1);
		

	}

}
