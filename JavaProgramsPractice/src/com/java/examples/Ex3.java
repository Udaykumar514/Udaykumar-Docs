package com.java.examples;

public class Ex3 {

	public static void main(String[] args) {
		
	//	Missing number print 
		int arr[] = {1,2,3,4,5, 6,7, 8,  10};
		
		int sum = (10*11)/2;
		int actualSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			actualSum = actualSum+ arr[i];
		}
		System.out.println("Missing number is::" + (sum -actualSum));
		
	}
}
