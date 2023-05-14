package com.uday.operators;

public class LogicalOperatorsExamples {

	public static void main(String[] args) {
		
		// Logical Operators Like (&& , ||, !)
		
		int a=10;
		int b=8;
		int c=15;
		
		if(a<b && a<c)		//Both conditions is true this block is executed
			System.out.println("a is smaller then b, c first if");
		
		if(a<b || a<c)		//At least one condition is true this block is executed
			System.out.println("a is smaller then b, c second if");
		
		if(!(a>b)) 		//Not is used in true conditions change to false and false will change to true
			System.out.println("a is greater than b");

	}

}
