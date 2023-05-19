package com.java.examples.corejava;

//abstract class Example program

abstract class CGT{
	
	void otherDirections() { //concreate method
		System.out.println("Im in other directions method");
	}
	
	abstract void actionTobeTaken(); //abstract method	
}

class AP extends CGT{

	@Override
	void actionTobeTaken() {
		System.out.println("Im from action to be taken method in AP");		
	}
}

class TG extends CGT{

	@Override
	void actionTobeTaken() {
		
		System.out.println("Im from action to be taken in TG");		
	}	
}

public class AbstractClassEx {

	public static void main(String[] args) {
		// Abstract class example
		
		AP a1 = new AP();
		a1.actionTobeTaken();
		a1.otherDirections();
		
		TG t1 = new TG();
		t1.actionTobeTaken();
		t1.otherDirections();

	}

}
