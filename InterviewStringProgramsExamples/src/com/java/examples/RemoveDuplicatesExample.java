package com.java.examples;

public class RemoveDuplicatesExample {

	public static void main(String[] args) {
		// Remove Duplicate String Example

		String str ="programming";
		
		//Approch -1  using java 8 
		StringBuilder sb= new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char) c));
		System.out.println(sb);
		
		//Approch-2  using indexof
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i+1);
			if(index == -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
	}

}
