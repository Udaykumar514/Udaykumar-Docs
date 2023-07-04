package com.java.examples;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		
		//calulate Sum of Array  numbers
		int[] array = { 2,3,4,5,7};
		
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
		
	}
}
