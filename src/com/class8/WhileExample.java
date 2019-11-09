package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

//		Scanner scan=new Scanner (System.in);
//		boolean rain;
//		
//		do {
//			System.out.println("Is it raining?");  // if we do not know in advance how many times to repeat block of code 
//			rain=scan.hasNextBoolean();            // best choice is do while 
//			
//		}while(rain); 
//			
//		System.out.println("Go to the park");

		int a = 10;
		for (int i = 10; i > 0; i -= 2)
			System.out.println(i);

		int a1 = 14;
		System.out.println();

		for (int i = 2; i <= a1; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		int a2 = 22;
		System.out.println();
		for (int i = 5; i <= a2; i++) {
			if (i % 2 == 1) {     // or if(i%2!=0) also correct
				System.out.println(i);
			}
			 
		}
		for (int i = 1; i<=6; i++) {
			System.out.print(i*3 + " ");
		}
	
	
	
	
	
	
	
		   for(int i = 10; i>=0; i--){
			      
			      if(i==0){
			              System.out.println("Happy New Year!");

			      }else{
			        
			              System.out.println(i);

			      }

			      
			    }
		   }

}
