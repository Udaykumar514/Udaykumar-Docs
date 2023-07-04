package com.java.examples;

import java.util.Scanner;

public class loveProgram {
	
	public static void main(String[] args) {
		
			System.out.println("Enter Your Number::");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			
		switch(a) {	
		case 1:
			String s1 ="I Miss You Kavya";
			for(int i=1; i<s1.length(); i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(" ");
				}
				System.out.println(s1+" ");
			}
			
		break;
		
		case 3:
			if(a==3) {
				String name ="I Love You Kavya!";
				for(int i=1; i<name.length(); i++) {
					for(int j=1; j<=i; j++) {
						System.out.print(" ");
					}
					System.out.println(name+" ");
				}
			System.out.println();
		//	names();
			}
		break;
		
		case 4:
			String s2 = "I Love You Kavya!";
			int i=1;
			while(i<s2.length()) {
			System.out.println(s2+ " ");
			
			}
			i= i+2;
		
		default:
			System.out.println("I Will Meet You Soon!");
		}
		
		s.close();
		
	}

/*	private static void names() {
		System.out.println("Enter your number");
		
	} */

}
