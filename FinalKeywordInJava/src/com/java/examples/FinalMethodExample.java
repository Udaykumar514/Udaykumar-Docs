package com.java.examples;

 class A{

  final void show() {  //final method cannot be override
		System.out.println("Iam class A show method");
	}
}

class B extends A{  
	
	/* void show() {  
		System.out.println("Iam class B show method");
	} */
}
public class FinalMethodExample {

	public static void main(String[] args) {
		// Final Method Example	
		
		B  ob = new B();
		ob.show();
	
	}

}
