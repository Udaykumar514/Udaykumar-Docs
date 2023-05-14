package com.uday.operators;

public class BooleanOperatorsExamples {

	public static void main(String[] args) {
		
		// Boolean Operators like (& , |, !)
		boolean a = true;
		boolean b = false;
		
		System.out.println("Result of (&) Boolean operators is::"+(a&b)); //Both conditions must be true
		
		System.out.println("Result of (|) Boolean operators is::"+(a|b)); //At least one conditions must be true
		
		System.out.println("Result of (!) Boolean operators is::"+(!a)); //Change true value to false and false value changed true

	}

}
