package com.java.examples.corejava;

interface First{

	int p=10;	//static variable
	
	void show();		//abstract methods
	void display();
	
}

class Second implements First{
	
	public void show() {
		System.out.println("This is the show method");
	}
	
	public void display() {
		System.out.println("This is the display methods");
		
	}
}

public interface InterfaceExample {
	
	public static void main(String[] args) {
		
		Second s1 = new Second();
		s1.show();
		s1.display();
		
	}

}
