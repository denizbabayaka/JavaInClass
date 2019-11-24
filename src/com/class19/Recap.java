package com.class19;

public class Recap {
	
	void sum(int num1,int num2) {//passing  parameters inside the method
		int c=num1+num2;
		System.out.println("The sum of 2 number is = "+c);
		
	}
// create method to display hello 5 times
	void sayHello(int num) {
		for(int i=0;i<num;i++) {  // we change the hard code 5 with dynamic num variable 
			System.out.println("Hello");
		}
	}
	
	//create method to say smth# number of times
	void saySomething(String word,int times) {
		for(int i=0;i<times;i++) {
			System.out.println(word);
		}
	}
	
	
	
public static void main(String[] args) {
	
	Recap obj=new Recap();
	obj.sum(10,30);// argument
	obj.sayHello(5);
	obj.saySomething("Deniz", 5);
	// obj.saySomething(5, "Deniz"); swap argument compile gives an error order has to be same with parameter 
	
   
}
}