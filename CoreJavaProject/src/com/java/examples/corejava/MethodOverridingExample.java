package com.java.examples.corejava;

//MethodOverriding Example

class A{
	void add(int a, int b) {
		System.out.println("Im add method in A and result is ::" +(a+b));
	}
}

class B extends A{
	void add(int p, int q) {
		System.out.println("Im add method in B and result is ::" +(p+q));
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		
		B ob = new B();
		ob.add(5, 5);
		ob.add(2, 3);
		
	}
}
