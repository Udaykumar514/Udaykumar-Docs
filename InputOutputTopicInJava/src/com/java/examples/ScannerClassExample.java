package com.java.examples;

//import java.util.Scanner;
import java.util.*;

public class ScannerClassExample {

	public static void main(String[] args) {
		// Scanner Example
		
		//Read String using Scanner
		System.out.println("Enter your Name");
		
		Scanner s = new Scanner(System.in);  //Scanner 
		String name = s.next();
		System.out.println("Your Entered Name is " +name+ ", Welcome to Java");
		
		System.out.println("==================================");
		
		System.out.println("Enter Your First Number");
		int firstNum = s.nextInt();
		System.out.println("Enter Your Second Number");
		int secondNum = s.nextInt();
		
		int result = firstNum + secondNum;
		System.out.println("Your Final Adding Two Number Result is :: " +result);

		s.close();
	}

}
