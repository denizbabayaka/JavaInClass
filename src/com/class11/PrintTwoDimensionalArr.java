package com.class11;

public class PrintTwoDimensionalArr {

	public static void main(String[] args) {
		int num[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

	
		int num1[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14 } };
		System.out.println("This is the firs array");
		display(num);
		System.out.println("This is the second array");
		display(num1);
	}
		
	
  public static void display( int x[][]) {   // this is our method (object which gets the values from the class
	  
	  for(int row=0;row<x.length;row++) {
		  
		  for(int column=0;column<x[row].length;column++) {
			  System.out.print(x[row][column]+"\t");
		 
		  }
	        System.out.println();
	   }
	  
	  
  }  
	  

	
	
	
	
	
	
	
}
