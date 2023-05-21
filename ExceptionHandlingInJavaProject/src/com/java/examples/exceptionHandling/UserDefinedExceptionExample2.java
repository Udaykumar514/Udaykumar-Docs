package com.java.examples.exceptionHandling;

//User - defined Exception Handling Example 2 
class MyExceptions extends Exception{
	
	private static final long serialVersionUID = 1L;

	MyExceptions(){
		System.out.println("Name is Not match please enter corrent person");
	}
	
	/*	 MyExceptions(String str){ 
		 super(str);
	} */
	
}

public class UserDefinedExceptionExample2  {

	public static void main(String[] args) throws Exception {
		
		String name = "udaykumar";   //condition only uday name will Entered otherwise will throw error
		
		try {
			if(!name.equals("uday")) {
				throw new MyExceptions();
			}else {
				System.out.println("Please Entered::" + name);
			}
		}catch(Exception e) {
			System.out.println("Please Enter Uday Name Only");
		}		

	}

}
