package com.java.examples;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; */

import java.io.*;

public class InputOutputExample {

	public static void main(String[] args) throws IOException {
		// Input output Examples
		
		//connect keyword with input stream reader
		InputStreamReader i = new InputStreamReader(System.in);
		
		//connect BufferedReader and InputStreamReader
		BufferedReader b = new BufferedReader(i);
		
		//Read string
		System.out.println("Please Enter your Name");
		
		String name = b.readLine();
		System.out.println("Hello " +name+ ", Welcome to Java");
		
		System.out.println("===================================");
		
		//Read String
		System.out.println("Enter your first Number");
		int firstNum = Integer.parseInt(b.readLine());
		
		System.out.println("Enter your second Number");
		int secondNum = Integer.parseInt(b.readLine());
		
		int result = firstNum+secondNum;
		System.out.println("Your final Adding Result is:: " + result);
	}

}
