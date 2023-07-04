package com.java.examples;

public class Ex5 {

	public static void main(String[] args) {
		
		//Special characters is removed and count the special characters in string
		
		String s = "Uday#!Kiran%@!$";
		int count =0;
		String specialCharactersRemoved = "";
		
		for(int i=0; i<s.length(); i++) {
			
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
				
			}else {
				specialCharactersRemoved = specialCharactersRemoved + s.charAt(i);
			}
		}
		
		if(count == 0) {
			System.out.println("There is no special character found");
		}
		else {
			System.out.println("Special characters found:: " + count);
		}
		
		System.out.println("Special characters Removed ::" + specialCharactersRemoved);
	}
}
