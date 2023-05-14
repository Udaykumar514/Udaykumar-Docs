package com.uday.conditonalstmtsExamples;

public class IterationStatementsExamples {

	public static void main(String[] args) {
		
		//Iteration statements like (for, while, do-while)
		
		//for-loop
		for(int i=1; i<=5; i++) {
			System.out.println("Hello Im for-Loop");
			System.out.println(i);
		}
		System.out.println("============for-loop============");
		System.out.println();
	
		//while
		int a=1;
		while(a<=5) {			
			System.out.println("Hello Im While-Loop");
			System.out.println(a);			
			a++;
		}
		
		System.out.println("===========while-loop==========");
		System.out.println();
		
		//do-while
		int c=0;
		do {
			
			System.out.println("Hello Im do-While-Loop");
			System.out.println(c);
			c++;
		}while(c>=5);
		
		System.out.println("===========do-while-loop==========");
	}
}
