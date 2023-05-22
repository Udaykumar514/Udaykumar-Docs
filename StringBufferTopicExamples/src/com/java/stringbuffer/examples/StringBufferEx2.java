package com.java.stringbuffer.examples;

public class StringBufferEx2 {		

	public static void main(String[] args) {
		//StringBuffer Method Examples
		
		StringBuffer s1 = new StringBuffer();
		
		//append()
		s1.append("welcome");	
		System.out.println("Initial s1 value:" +s1);
		System.out.println("Initial s1 Hashcode is :" +s1.hashCode());	
		
		s1.append(50);
		System.out.println("After s1 value:" +s1);
		System.out.println("After s1 Hashcode is :" +s1.hashCode());	 //value hash code is not changed
		
		s1.append(false);	
		System.out.println("After 2nd time s1 value:" +s1);
		System.out.println("After 2nd time s1 Hashcode is :" +s1.hashCode());	 //value hash code is not changed (StringBuffer is mutable)
		
		StringBuffer s2 = new StringBuffer();
		s2.append("Hello uday");
		
		//insert()
		s2.insert(1, "Nice");
		System.out.println("Insert s2 value:" +s2);
		System.out.println("Insert s2 Hashcode is :" +s2.hashCode());	 //value hash code is not changed (StringBuffer is mutable)
		
		//delete()
		s2.delete(1, 5);
		System.out.println("Delete s2 value:" +s2);
		System.out.println("Delete s2 Hashcode is :" +s2.hashCode());	 //value hash code is not changed (StringBuffer is mutable)
				
		//reverse()
		s2.reverse();
		System.out.println("Reverse of s2 string is ::"+s2);
	
		//length()
		System.out.println("Length of s2 string is ::"+s2.length());
		
		StringBuffer name = new StringBuffer();
		name.append("Welcome to java");
		//indexOf()
		System.out.println("Index of name string is ::" +s2.indexOf("wel"));
		
		//lastIndexOf()
		System.out.println("LastIndexOf of name string is ::" + s2.lastIndexOf("java"));
		
		//replace()
		StringBuffer s3 = new StringBuffer();
		s3.append("Welcomeuday");
		s3.replace(1, 5 , "abc");
		System.out.println("Replace the value of s3 string is::" +s3);		
		
		//subString()
		StringBuffer s4 = new StringBuffer();
		s4.append("Hi Welcome to Java");
		System.out.println("String SubString Result is ::" +s4.substring(2,5));
		
		
	//	=============================================The - End ===========================================================
	}
}
