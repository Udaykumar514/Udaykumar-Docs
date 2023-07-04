package com.java.examples;

public class ReverseWordsExample {

	public static void main(String[] args) {
		// Reverse Word Example
		
		String input = "java code";
		System.out.println("Orginal String is ::" +input);
		
		String output = "";
		String words[] = input.split(" ");
		for(String word : words) {	
			String rev = "";
			
			//reverse word
			for(int i=word.length()-1; i>=0; i--) {
				
				rev = rev+word.charAt(i);				
			}
			
			output = output + rev + " ";			
		}
		
		System.out.println("Reverse String is ::" +output);
		

	}

}
