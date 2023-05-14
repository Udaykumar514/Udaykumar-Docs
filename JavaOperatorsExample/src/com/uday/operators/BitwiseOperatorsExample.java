package com.uday.operators;

public class BitwiseOperatorsExample {

	public static void main(String[] args) {
		
		// Bitwise Operators like (~, &, |, ^, <<, >>, >>>)
		
		byte x=10;
		byte y=4;
		
		System.out.println("Bitwise operators of (~) Operator Result of x is:" +(~x));
		
		System.out.println("Bitwise operators of (&) Operator Result of x & y is:" +(x&y));
		
		System.out.println("Bitwise operators of (|) Operator Result of x | y is:" +(x|y));
		
		System.out.println("Bitwise operators of (^) Operator Result of x ^ y is:" +(x^y));
		
		System.out.println("Bitwise operators of (<<) Operator Result of x << y is:" +(x<<y)); //2 bits Left shift operator
		
		System.out.println("Bitwise operators of (>>) Operator Result of x >> y is:" +(x>>y)); //2 bits Right shift operator
		
		System.out.println("Bitwise operators of (>>>) Operator Result of x >>> y is:" +(x>>>y)); //Double Right shift operator
		
	}

}
