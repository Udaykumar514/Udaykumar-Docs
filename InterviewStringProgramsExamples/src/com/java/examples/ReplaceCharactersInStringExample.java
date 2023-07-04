package com.java.examples;

import java.util.Arrays;

public class ReplaceCharactersInStringExample {

	public static void main(String[] args) {
		// ReplaceCharactersInStringExample
		
		String input = "opentext";
		char replaceString = 't';
		
		//value is not presented in string logic
		if(input.indexOf(replaceString)==-1)
		{
			System.out.println("The String is not presented");
			System.exit(0);
		}
		
		//logic replace char occurance in string using charAt()
		int cnt = 1;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch ==replaceString) { // o==t p==t e==t n==t t==1 e==t x==2
				input = input.replaceFirst(String.valueOf(ch), String.valueOf(cnt));
				cnt++;
			}					
		}
		System.out.println(input);
				
		//logic
		/*
		 * char arr[] = input.toCharArray(); for(int i=0; i<arr.length; i++) { int
		 * cnt=1; if(arr[i] == replaceString) { // o==t p==t e==t n==t t==t e==t x==t
		 * t==t arr[i] = String.valueOf(cnt).charAt(0); cnt++; } }
		 * System.out.println(Arrays.toString(arr));
		 */
		
		

	}

}
