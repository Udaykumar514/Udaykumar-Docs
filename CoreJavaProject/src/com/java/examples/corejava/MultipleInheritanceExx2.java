package com.java.examples.corejava;

//Multiple Inheritance is supported only interfaces using interface Example
interface numberOne{
	
	void first();
}

interface numberTwo{
	void second();
	
}

interface numberThree{
	void three();
}

class NewClass implements numberOne,numberTwo,numberThree{

	@Override
	public void three() {
		
		System.out.println("Im in Three method in class NumberThree");
		
	}

	@Override
	public void second() {
		System.out.println("Im in second method in class NumberSecond");
		
	}

	@Override
	public void first() {
		System.out.println("Im in first method in class NumberFirst");
		
	}
	
}


public class MultipleInheritanceExx2 {
	public static void main(String[] args) {

		NewClass ob = new NewClass();
		ob.first();
		ob.second();
		ob.three();

	}
}
