package com.java.examples;

public class SignleArrayExample {

	public static void main(String[] args) {
		// Single Array Example
		 
		// 1st Method - Creation of Single-Array
		int marks[] = new int[5];
		
		//Adding values in Array
		marks[0] =10;
		marks[1] =5;
		marks[2] =8;
		marks[3] =9;
		marks[4] =4;	
		
		//Print the values in Array
		System.out.println(marks[0]);
		
		
		//2nd Method 
		int markslist[] = {10,8,6,9,4};		//Single Array-Creation
		
		for(int i=0; i<markslist.length; i++) {
			System.out.print(markslist[i] + "\t");  //Print All values in Array
		}
		
	}

}
