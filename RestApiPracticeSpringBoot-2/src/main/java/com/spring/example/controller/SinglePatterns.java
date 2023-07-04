package com.spring.example.controller;

public class SinglePatterns {

	private static SinglePatterns instance = null;
	   private SinglePatterns() {
	      // Exists only to defeat instantiation.
	   }

	   public static SinglePatterns getInstance() {
	      if(instance == null) {
	         instance = new SinglePatterns();
	      }
	      return instance;
	   }
	   
	   
	   public static void main(String[] args) {
		   SinglePatterns x = SinglePatterns.getInstance();
		   System.out.println(x.hashCode());
		   
		   //main purpose of single ton is restrict the limit of the number of object creations to only one.
	}
}
