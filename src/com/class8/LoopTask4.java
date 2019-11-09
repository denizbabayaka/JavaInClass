package com.class8;

import java.util.Scanner;

public class LoopTask4 {

	
public static void main(String[] args) {
		
	for(int i=1;i<=50;i++) {
		if(i%3==0) {
			System.out.println(i);
		}
	}
	
	Scanner scan=new Scanner(System.in);
	String ask;
	
	for(int i=1; i<=10;i++) {
		System.out.println("Do you want to apply for a credit card");
		ask=scan.nextLine();
		
		if(ask.equals("yes")) {
				
			break;
			
		
			
		}
	}
	
	System.out.println("I do not need credit card");
	
	
	
	
	
	
	
	}

}
