package com.java.examples;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		// 2D - Array Example
		
		//1st Method Creation of 2D Array
		int marks[][] = new int[3][5];
		
		//Adding Values into 2D Array
		marks[0][0] = 10;
		marks[0][1] = 20;
		marks[0][2] = 30;
		marks[0][3] = 40;
		marks[0][4] = 50;
		
		marks[1][0] = 10;
		marks[1][1] = 20;
		marks[1][2] = 30;
		marks[1][3] = 40;
		marks[1][4] = 580;
		
		marks[2][0] = 10;
		marks[2][1] = 20;
		marks[2][2] = 30;
		marks[2][3] = 40;
		marks[2][4] = 50;
		
		//Print values into 2D Array
		System.out.println(marks[1][4]);
		
		
		//2nd Method using 2D-Array
		int marksList[][] = {{10,20,30,40,50},  {1,2,3,4,5},   {5,10,15,20,25}};
 							//00,01,02,03,04   10,11,12,13,14  20,21,22,23,24
		
	//	System.out.println(marksList[2][2]);
		
		for(int i=0; i<3; i++) //no of rows
		{
			for(int j=0; j<5; j++) {  //no of columns
				
				System.out.print(marksList[i][j] + "\t");

			//	System.out.print(marksList[1][4] + "\t");

			}
			System.out.println();

		}
		
	}

}
