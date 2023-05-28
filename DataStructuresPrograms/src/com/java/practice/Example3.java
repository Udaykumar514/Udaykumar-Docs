package com.java.practice;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		//sort Array
		int a1[] = new int[] {2, 6,88,3,45, 1, 9};
		for(int i=0; i<a1.length; i++) {			
			System.out.print(a1[i]+ " ");	
		}
		System.out.println();
		Arrays.sort(a1);
		for (int i = 0; i < a1.length; i++) {

			System.out.print(a1[i] + " ");

		}
		//Reverse number
		System.out.println();
		for(int j=a1.length-1; j>=0; j--) {
			System.out.print(a1[j] + " ");
		}
		System.out.println();
		//Reverse name string
		String name = "udaykirankumar";
		for(int  i=name.length()-1; i>=0 ; i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
