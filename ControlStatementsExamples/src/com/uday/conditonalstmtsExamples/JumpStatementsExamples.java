package com.uday.conditonalstmtsExamples;

public class JumpStatementsExamples {

	public static void main(String[] args) {
		
		// Jump Statements like (break, continue, return)
		
		//break;
		for(int i=1; i<=10; i++) {		
			if(i==5)
				break;		//5 value is "break" the value to stop the iteration
			System.out.println("These is the break jump statement example:: " + i);
		
		}
		System.out.println("=================break=========================");
		
		//continue
		for(int a=0; a<=10; a++) {
			if(a==6)
				continue;	//6 value is "continue" the value to skip the 6 value iteration
			System.out.println("This is continue jump statement example :: "+ a);
		}
		
		System.out.println("====================continue=========================");
		
		//return statement used for methods
	/*	public static String getReturnExample() {			
			String name = "Uday";
			return name;
		}  */

	}

}
