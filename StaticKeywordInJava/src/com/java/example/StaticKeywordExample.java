package com.java.example;

class JavaClass{
	
	String name;   //Instance variable
	void testing() { //Instance Method
		System.out.println("This is Instance variables method Example");
	}
	
	static String board;  //static variable
	static void teaching() { //static method
		System.out.println("This is the Static Method Example");
	}	
}

public class StaticKeywordExample {
	
	static {   //static block means Before main method this block code will be executed
		System.out.println("Hello This is the Fist Execution Static Block");
		
	}
	
	public static void main(String[] args) {
		
		// Static Keyword Examples	
		JavaClass a = new JavaClass();  
		a.name = "uday";  //Instance variable calling
		System.out.println("This is the Normal Instance variable calling :: "+a.name);
		a.testing(); //Instance Method calling

		JavaClass.board = "White"; //static variable calling
		System.out.println("This is the Static variable calling :: "+JavaClass.board);
		JavaClass.teaching(); //static Method calling
		
	}

}
