package com.java.examples.corejava;

//Method overloading Example
public class MethodOverloadingEx {     //Method Overloading only single class
	
	public void add() {
		System.out.println("Im in add method");
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingEx ex = new MethodOverloadingEx();
		ex.add();
		ex.add(2,5);
		ex.add("uday");
	
	}

}
