package com.java.practice;

public class Examples {
	public static void main(String[] args) {
		//Array single 
		int a1[] = new int[6];
		int count= 1;
		for(int i=0; i<a1.length; i++) {
			a1[i] = count;
			count++;
			System.out.print(a1[i] + " ");			
		}
		
		//Multil-array
		System.out.println();
		int a2[][] = new int[3][6];
		int c =1;
		for(int rows = 0 ; rows<a2.length; rows++) {
			
			for(int col =0; col <a2[rows].length; col++) {
				
				a2[rows][col] = c;
				c++;			
			}		
		}
		
		System.out.println();
			for(int rows = 0 ; rows<a2.length; rows++) {
			
			for(int col = 0; col<a2[rows].length; col++) {
					System.out.print(a2[rows][col] + " ");
			
			}
			System.out.println();
			
			}
			
	}		
				
	}


