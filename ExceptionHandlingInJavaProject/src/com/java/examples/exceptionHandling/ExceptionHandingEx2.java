package com.java.examples.exceptionHandling;


//Example 2 for Exception Handing in ArrayIndexOutofBoundException
class A{
	
	int marks[] = {10,9,5,4};
	
}

public class ExceptionHandingEx2 {

	public static void main(String[] args) {
		
		
		A ob = new A();
		
		try {
			System.out.println(ob.marks[2]);
			System.out.println(ob.marks[6]);
		}
		catch(Exception e) {
			System.out.println("Array Index out of bound Exception"+ e);
		}
		
		finally {
			System.out.println("Im in Finally Block");
		}
		System.out.println("Hello");

	}

}
