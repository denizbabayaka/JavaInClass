package com.class37;

public class UnckeckedException {
	public static void main(String[] args) {
		
		System.out.println("Begining of the code");
		int a=20;
		int b=0;
	
		
		try {// try block will consist of any code that might throw an exception
			System.out.println("I am code inside try block");
			System.out.println(a/b);//new ArithmeticException(); // problematic code and object created and throws
			System.out.println("I am continues code inside try block");
		}catch (ArithmeticException e) {//  ArithmeticException e=new ArithmeticException();
			
			System.out.println("I am code inside catch block");
//			e.printStackTrace();// details of where in the code exception occurs name of the exception an detailed message
//			System.out.println(e);// exception object
			System.out.println(e.getMessage()); // name of the exception and message 
		}
		
		System.out.println("End of the code");
	}

}
