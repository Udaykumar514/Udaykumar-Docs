package com.java.Arrays;

public class MultipleDimensionalExample {

	public static void main(String[] args) {
		
		//multiple array
		int a1[][] = new int[3][5];
		int count =1;
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) {
				a1[i][j] = count;
				count++;
			}
		}
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1[i].length; j++) {
				
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
