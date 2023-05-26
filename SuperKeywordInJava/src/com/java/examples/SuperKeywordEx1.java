package com.java.examples;

		//Super keyword used in 2-ways
		//1)To Access super class members
		//2)To call super class constructors
		
// 1)To Access super class members
class A{
	int p =10; //members variables
	
	void show() {  //members methods
		System.out.println("Class A Super keyword Value is show() method is:" +p);
	}
	
}
class B extends A{
	
	int p =50;  //p=10,show()--> from A
	int q = 20;
	int r =40;
	
	void show() {
		super.show();   //using super keyword
		System.out.println("Class B using Super keyword 'p' value is:" +super.p);  //using super keyword
		System.out.println("Class B 'p' value is ::"+ p);
	}
	
}
public class SuperKeywordEx1 {

	public static void main(String[] args) {
		
		B ob = new B();
		ob.show();
	}
	
}

