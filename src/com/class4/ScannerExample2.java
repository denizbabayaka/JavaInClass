package com.class4;

import java.util.Scanner;

public class ScannerExample2 {
public static void main(String[] args) {
	
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("What is the amount of loan is needed");
	int num1=keyboard.nextInt();
	
	if(num1<200.000) {
		System.out.println(" i will lend you the money");
	}else {
		System.out.println("i will not lend you the money");
	}
	
	System.out.println("what is your age");
	int num2=keyboard.nextInt();
	
	if(num2<18) {
		System.out.println(" I will not give you a driver licence");
	
	}else {
		System.out.println("I will give you a driver licence");
	}
	
	System.out.println("what is the temprature");
	int num3=keyboard.nextInt();
	System.out.println("what is the city");
	String name=keyboard.next();
	
	int num4=(num3-32)*5/9;
	System.out.println("the temperature is in the city "+name+" is "+num4);
	
	

	
	
	
	
	
	
	
}
}
