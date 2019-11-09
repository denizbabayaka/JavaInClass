package com.class10;

import java.util.Scanner;

public class ArrayExamples4 {
public static void main(String[] args) {
	

	   
    Scanner userInput = new Scanner(System.in);

		String[] arr = new String[7];

		for (int i = 0; i <arr.length; i++) {

			System.out.println("Please enter day " + (i+1) + " of the week");
			arr[i] = userInput.next();
		}
		
		
		for(int i=0; i<=arr.length-1; i++){
			System.out.println(arr[i]);
		}
	
	
		Scanner scan=new Scanner(System.in);
		int day1 = 1;
	  String day[]=new String [7];
	  for(int i=0;i<7;i++){
	    
	    System.out.println("Please enter day " + day1 + " of the week");
	    day [i] =scan.nextLine();
	    day1 = day1 + 1;
	  }
		  for(int y=0;y<7;y++){
		    System.out.println(day[y]);
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
}
