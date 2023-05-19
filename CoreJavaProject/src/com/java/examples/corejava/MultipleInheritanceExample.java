package com.java.examples.corejava;

//Multiple Inheritance Example Program using class and Interfaces
class one{
	void methodA() {
		System.out.println("Im in method A from class one");
	}
}

interface Two{
	void methodB();
}

interface  Three {
	void methodC();
}

class D extends one implements Two, Three{

	@Override
	public void methodC() {
		System.out.println("Im in Mehod c from Three class");
		
	}

	@Override
	public void methodB() {
		System.out.println("im in method B from Two class");
		
	}
	
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
		D ob = new D();
		ob.methodA();
		ob.methodB();
		ob.methodC();

	}

}
