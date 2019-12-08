package com.class25_1;

public class Addition {
	// method overloading:
	// 1 by passing different amount of parameters
	
	public double  add(int num1,int num2) {
		System.out.println(num1+num2);
		 double sum=num1+num2;
		 return sum;
	}

	public void add(int num1,int num2,int num3) { // in method overloading method signature must be different 
		System.out.println(num1+num2+num3);       // accsess modifier(public) not part of the signature
		
	}
	public void add(int num,double num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(12, 13);
		obj.add(12	, 13, 14);
		String str="Hello"; // overloading method from string class str is reference variable of string class 
		// which can accsess all the methods of string class
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 3));
	}
}
