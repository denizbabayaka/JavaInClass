package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);  // thr result of relational and equality operators is either true or false
		
		System.out.println(num1<num2);
		
		System.out.println("************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		int a=20;   //if number a is bigger than number b
		int a1=30;   // I want to print a is larger than b
		
		if (a>a1) {
			
			System.out.println("a larger than a1");
			
		} else {
			System.out.println("a is smaller than b");
			
		}
		
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actual--> you will succeed 
		// otherwise ,please study more
		
		if(actualHours>expectedHours) {
			
			System.out.println("you will succeed");
		}else {
			
			System.out.println("please study more");
			
		}
		
		double  teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;//2.99=4.99-2
		// if price is more than I can afford I will not buy
		//if price is less or matches what I can afford then I will buy tea
		
		if(allowedPrice>=teaPrice) {
			
			System.out.println("I will buy tea");
		}else {
			System.out.println("I cannot afford ,I need to  study more");
		}
		
		
		System.out.println("I keep writing some code"); // get out from the contidition
		
		double number1=9.99;
		double number2=5.99;
		
		if(number1>number2) {
			
			System.out.println("double value "+number1+" islarger than "+number2);
		}else {
			System.out.println("double value "+number2+"is larger than "+number1);
			
			
		}
		int temp1=32;
		int temp2=52;
		
		if(temp1<temp2) {
			
			System.out.println("water will freeze with "+temp1);
			
			
		}else {
			
			System.out.println("water will not freeze with temperature" +temp2);
		}
		
		
		boolean val=false;// 
		
		if(val) {
			
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		boolean israin=false;  // if statement first check true after false
				
				if(israin) {
					System.out.println(" i will get my umbrella");
					
				}else {
					System.out.println("i go for a walk"); 
				}
		
		
		
	}

}
