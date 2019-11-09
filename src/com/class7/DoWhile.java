package com.class7;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
//		int num=1;                             // initialize variable
//		
//		
//		while(num<=7) {                        // check the condition 
//			System.out.println("Hello");       // then execute the code
//			num++;
//		}
//		
//		
//		int num1=1;
//		
//		do {                                  //in do  first we perform the action and go inside the loop check the condition
//			System.out.println("Bye");         // even the condition is false code execute just once 
//			num1++;
//		}while(num1<=7);
//		
//		int num2=20;
//		
//		do {
//			System.out.println(num2);
//		 num2++;
//		
//		}while(num2<=50);
//		
//		
//	
//		 int even2=20;
//		 
//		do {
//			if(even2%2==0) {
//				System.out.println(even2);
//				even2++;
//			}
//		}while(even2<=50);
//		
//		System.out.println("------------");
		
		
		Scanner scan=new Scanner(System.in);
		
		int i=5;
		
		while(i<10) 
	
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Good afternoon "+name);
		i++;
	


	
	}
}
