package com.java.uday.examples;

//Example Program for Constructors

class Example{
	
	String msg;
	int number;
	
	//constructor overloading
	Example(){ //default constructor
		msg = "Uday Constructor Example";
	}
	
	Example(String s){ //parameterized constructor		
		msg = s;
	}
	
	Example(int number){  //this represents current object variables
		number = number; //Before use this keyword  //instance variables hiding
		this.number = number;   //After use this keyword
	}
	
	Example(String msg, int number){		
		this.msg = msg;
		this.number = number;
	}
	
}

public class ConstructorsExample {
	
	//Constructors Examples
	public static void main(String[] args) {
		 
		Example e = new Example();
		System.out.println("This is the 'e' object defalut constructor is :" +e.msg);
	//	System.out.println(e.msg);
		
		Example e1 = new Example("uday");  //constructor calling
		System.out.println("This is the 'e1' object Parameterized constructor is :" +e1.msg);
		
		Example e2 = new Example(123); 
		System.out.println("This is the 'e2' object Number parameterized constructor is :: " + e2.number);
		
		Example e3 = new Example("uday", 12345); 
		System.out.println("This is the 'e3' object string and Number parameterized constructor is :: " + e3.msg + " "  + e3.number);	
		
	//	Note:(constructor Definition and Imp Points)
	// 1)constructor means It is also same as method
	// 2)constructor name should be equivalent to it's class name
	// 3)does not have any return type	
		
	}

}
