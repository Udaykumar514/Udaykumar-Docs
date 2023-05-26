package com.java.examples.p1;

import com.java.examples.p2.opscClassExample;
import com.java.examples.p3.opnsClassExample;

//import com.java.examples.sameClassExample;

public class mainClass {

	public static void main(String[] args) {
	
		// main classes
		System.out.println("=*****=========Access Modifiers Starting=========******=");
		sameClassExample s = new sameClassExample();		
		s.sameClass();
		
		System.out.println("========================");
		spnsClassExample s1 = new spnsClassExample();
		s1.spns();
		
		System.out.println("========================");
		spscClassExample s2 = new spscClassExample();
		s2.spscClass();
		
		System.out.println("=========================");
		opscClassExample s3 = new opscClassExample();
		s3.opscClass();
		
		System.out.println("========================");
		opnsClassExample s4 = new opnsClassExample();
		s4.opns();
		
		System.out.println("=******==================The-End=================******=");
		
	}

}
