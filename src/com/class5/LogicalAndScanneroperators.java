package com.class5;

import java.util.Scanner;

public class LogicalAndScanneroperators {

	public static void main(String[] args) {
		int age;
		Scanner scan;
	 scan=new Scanner(System.in);
		
		
		System.out.println("what is your age?");   // we have to use &(and) operator
		 age=scan.nextInt();
		
		if(age>=1&&age<=3) {
			System.out.println(" you are a baby");
		
		}else if(age>=5&& age<=12) {
			System.out.println("you are a toddler");
		}else if (age>=12&&age<=19) {
			System.out.println("you are a kid");
		}else if(age>=20) {
			System.out.println("you are an adult");
		
		}else {
			System.out.println("invalid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
