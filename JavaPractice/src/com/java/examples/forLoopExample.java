package com.java.examples;

public class forLoopExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(i+" ");
		}
		
		for(char a='I'; a<='Z'; a++) {
			for(char b ='I'; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println(a+" ");
		}
		
		String k= "I Love You";
		for(int s=1; s<k.length(); s++) {
			for(int y=1; y<=s; y++) {
				System.out.print(" ");
			}
			System.out.println(k+ " ");
		}
	}
}
