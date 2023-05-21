package com.java.examples.exceptionHandling;

//Simple Exception handling in lines of code Example
public class ExceptionHandingEx1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(1+2);
		System.out.println(4*5);
		System.out.println(5/0);
		}
		catch(Exception e) {
			System.out.println("This is the Arithmatic Exception is divide by / Zero");
		}
		finally {
			System.out.println("Hello");
			System.out.println("Hello Im in Finally Block");
		}
		

	}

}
