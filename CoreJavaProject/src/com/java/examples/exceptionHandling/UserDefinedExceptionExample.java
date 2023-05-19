package com.java.examples.exceptionHandling;

//User - Defined Own Exceptions ExceptionHandling Examples
class MyException extends Exception{
	
	private static final long serialVersionUID = 1L;

	MyException(){
		System.out.println("This Compitation is only for Below 10 yrs");
	}
	
	MyException(String str){
		super(str);
	}
}

public class UserDefinedExceptionExample {

	public static void main(String[] args) throws MyException {
		
		int age = 62 ;
		
		try {
			if(age>10) {
				throw new MyException("Please enter into compitation is below 10");
			}
			else {
				System.out.println("Your now Eligible to paritcipate compitation");
			}

		}
		catch(Exception e) {
			System.out.println("Please enter below 10 yrs only");
		}
	
		System.out.println("Hello");
		
	}

}
