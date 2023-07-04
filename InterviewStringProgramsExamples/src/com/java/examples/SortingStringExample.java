package com.java.examples;

import java.util.Arrays;

public class SortingStringExample {

	public static void main(String[] args) {
		//SortingStringExample
		
		//Approach-1 without using sort() method		
		String str= "uday";
		char arr[] = str.toCharArray();
		
		char temp;
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(arr[i] > arr[j]) { //swapping logic			
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;			
				}			
			}			
		}		
		System.out.println(new String(arr));	
		
		
		//Approach-2 Using sort() method
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		
		
		
		
	}	
	
}
