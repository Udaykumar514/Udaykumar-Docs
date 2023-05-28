package com.java.practice;

public class Examples2 {
	
	public static int search(int array[], int key){
		for(int i=0; i<array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
	int a1[] = new int[] {6, 8 , 5 , 1, 10, 9};
	
	for(int i=0; i<a1.length; i++) {
		System.out.print(a1[i]+ " ");
	}
	System.out.println();
	int indexValue = search(a1, 5);
	if(indexValue == -1) {
		System.out.println("Element is not found");
	}
	else {
		System.out.println("Element is found " + indexValue);
	}

}
}
