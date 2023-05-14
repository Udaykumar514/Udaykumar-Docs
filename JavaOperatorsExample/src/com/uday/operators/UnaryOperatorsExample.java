package com.uday.operators;

public class UnaryOperatorsExample {

	public static void main(String[] args) {
		// Unary Operators are like (- , ++ , -- )
		
		int a=10;
		
		int b=5;
		
		System.out.println("Result of Unary - operator is ::" + (-a));
		
		
		// --a(pre increment)   a++(pre increment)
		System.out.println("Result of " +"Pre "+ "Increment is:" + (++a)); //Before pre increment the value 
		
		// --a(post increment)   a++(post increment)
		System.out.println("Result of " +"Post "+ "Increment is:" + (b++)); //After post increment the value 
		System.out.println("Post Increment of b value is ::"+b);
	}

}
