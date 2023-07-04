package com.java.examples;

public class Ex4 {

	public static void main(String[] args) {
		
	//	Rotation string is present or not checking
		
		String str1 = "CDAB";
		String str2 = "ABCD";
		
		if(isRotation(str1, str2)) {
			System.out.println("Rotation string is present");
		}else {
			System.out.println("Rotation string is not present");
		}
	}
	
	public static boolean isRotation(String str1, String str2) {
		
		return (str1.length() == str2.length() && ((str1+str1).indexOf(str2) != -1));
		
	}
}
