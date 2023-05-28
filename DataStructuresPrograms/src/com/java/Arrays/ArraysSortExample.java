package com.java.Arrays;
import java.util.Arrays;

public class ArraysSortExample {
	
	public static void main(String[] args) {
		int a1[] = new int[] {5, 3, 12, 1, 9, 4, 2};
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i] + " ");
			
		}
		System.out.println();
		Arrays.sort(a1);
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i]+ " ");
		}

		}
	}





