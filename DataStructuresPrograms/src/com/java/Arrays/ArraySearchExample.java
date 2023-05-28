package com.java.Arrays;

public class ArraySearchExample {

	public static int search(int array[], int key) {
		for(int i=0; i<array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int a1[] = new int[] {5,3,8, 23, 4, 2, 1};
		
		for(int i=0; i<a1.length; i++) {
			System.out.print(a1[i]+ " ");
		}
		
		System.out.println();
		int indexValue = search(a1, 10);
		if(indexValue == -1) {
			System.out.println("Enlement is not found::"+ indexValue);
		}
		else {
			System.out.println("Element is found the index position is ::" + indexValue);
		}
		

	}

}
