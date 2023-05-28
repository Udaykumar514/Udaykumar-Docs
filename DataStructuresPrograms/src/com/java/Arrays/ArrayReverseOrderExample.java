package com.java.Arrays;

public class ArrayReverseOrderExample {

	public static void main(String[] args) {
		//Numbers Reverse order
		int a1[] = new int[] {5, 9,8,2,80,10,63,2,1};
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		for(int i=a1.length-1; i>=0; i--) {
			System.out.print(a1[i] + " ");
		}
		
		//String Reverse order
		System.out.println();
		String name = "udaykiran";
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
