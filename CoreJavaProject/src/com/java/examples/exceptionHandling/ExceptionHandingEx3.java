package com.java.examples.exceptionHandling;

//Example of Exception Handling is "StringIndexOutOfBoundsException , ArrayIndexOutOfBoundsException
class one{
	
	String names[] = {"uday", "kiran", "Ashok"};
	
	String name = "uday";
}

public class ExceptionHandingEx3 {

	public static void main(String[] args) {
		
		one s1 = new one();
		
		try {
			System.out.println(s1.names[2]);
			System.out.println(s1.names[5]);
		}catch(Exception e) {
			System.out.println("Array Index out of bound example string");
		}
		
		System.out.println("Hello");
		
		try {
			System.out.println(s1.name.charAt(5));
		}
		catch(Exception e) {
			System.out.println("Im in String Index outof Bounds Exception");
		}
		
		System.out.println("Hello Im String Exception");
	
	}

}
