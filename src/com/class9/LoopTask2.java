package com.class9;

import java.util.Scanner;

public class LoopTask2 {
public static void main(String[] args) {
	
	Scanner scan;
	scan=new Scanner(System.in);
	
	
	System.out.print("Please enter first  number :");
	int num=scan.nextInt();
	System.out.print("Please enter last  number :");
	int num1=scan.nextInt();
	int sumall=0; 
	int sumall1=0;
	
	for(int i=num;i<=num1;i++) {
	
	
	 
		
		if(i%2==0) {
			sumall=sumall+i;
		} else {
			sumall1=sumall1+i;
		
			
		}	
		
	}
	System.out.println("Even total is "+sumall);
	System.out.println("Odd total is "+sumall1);
	
		
	
 int num3=15;
	
	for(int i=0;i<20;i++) {
		System.out.println("Guess the number");
		int num4=scan.nextInt();
		
		if(num4<num3) {
			System.out.println("too small");
		}else if(num4>num3) {
			System.out.println("too large");
		}else if(num4==num3) {
						System.out.println("You find the number");
						break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
