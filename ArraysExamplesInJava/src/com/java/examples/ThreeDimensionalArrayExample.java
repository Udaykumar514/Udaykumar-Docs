package com.java.examples;

public class ThreeDimensionalArrayExample {

	public static void main(String[] args) {
		// 3D Array Example
		
		int collegeMarks[][][] = {  //Creation of 3D -Array 
									{{10,20,30 ,40, 50} ,{1,2,3,4,5} ,{5,10, 15,20, 25}},  //2D -Arrays
									{{10,20,30 ,40, 50} ,{1,2,3,4,5} ,{5,10, 15,20, 25}},
									{{10,20,30 ,40, 50} ,{1,2,3,4,5} ,{5,10, 15,20, 25}}
									
								};
		
		
		//Assigning all values in loop
		
		for(int i=0; i<3; i++) {  //no of 2-d Arrays
			
			for(int j=0; j<3;j++) { //no of rows
			
				for(int k=0; k<5; k++) { //no of columns
					
					System.out.print(collegeMarks[i][j][k] + "\t");
				}
				System.out.println();
			}
		}
	}

}
