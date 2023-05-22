package com.java.stringbuffer.examples;

public class StringBufferEx1 {		//program for String is immutable or not

	public static void main(String[] args) {
		//StringBuffer Examples
		
		//String - immutable  (value can not be modified)
		//StringBuffer - mutable (value can be modified)
		
		//Using String
		String str = new String("uday");
		System.out.println("Initial str value:" +str);
		System.out.println("Initial str Hashcode is :" +str.hashCode());	
		
		str = "Hello";
		System.out.println("After str value:" +str);
		System.out.println("After str Hashcode is :" +str.hashCode());	 //value hash code is changed (String is immutable)
			
		//StringBuffer
		StringBuffer name = new StringBuffer("uday");
		System.out.println("Starting name value:" +name);
		System.out.println("Starting name Hashcode is :" +name.hashCode());	
				
		StringBuffer s1 = new StringBuffer();
		s1.append("welcome");
		System.out.println("Initial s1 value:" +s1);
		System.out.println("Initial s1 Hashcode is :" +s1.hashCode());	
		
		s1.append(50);
		System.out.println("After s1 value:" +s1);
		System.out.println("After s1 Hashcode is :" +s1.hashCode());	 //value hash code is not changed
		
		s1.append(false);	
		System.out.println("After 2nd time s1 value:" +s1);
		System.out.println("After 2nd time s1 Hashcode is :" +s1.hashCode());	 //value hash code is not changed (StringBuffer is mutable)
	
	
		
	}
}
