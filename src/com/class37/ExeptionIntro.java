package com.class37;

public class ExeptionIntro {
	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		System.out.println(a/b);//if int b is 0 then  we will get an arithmetic exception
		
		System.out.println("Code after an exception");
		System.out.println("Continues Code");
		
		int [] array= {10,20,30};
		System.out.println(array[3]);// we will get an out of bound exception
		
		ArithmeticException  exception=new ArithmeticException();
		throw(exception);
		
	}

}
