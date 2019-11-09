package com.class2;

public class LastExercise {
	 public static void main(String[] args) {
		
	
	
	
	int a=10;
	int b=22;
	
	String x="hello";
	String y="bye";
	
	System.out.println(x+y+a+b);  // first start to execute from left to right   
	
	System.out.println(x+a+y+b);
	System.out.println(x+y+a+b);   //first string runs   helloby10+22 it will not make addition 
	                                        //           __string_+22 like this 
	
	System.out.println(x+y+(a+b));  // we have to seperate for making the addition 


	 }
}
