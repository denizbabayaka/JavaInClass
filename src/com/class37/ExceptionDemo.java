package com.class37;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		division2Integers(10, 2);
		division2Integers(10, 2);
		division2Integers(20, 0);// we will get an catch  in this line 
		division2Integers(40, 10);
		
		System.out.println("End of the Code");
		
		
	}
	
	
	
	public static void division2Integers(int num,int num2) {
		
		try {
			System.out.println(num/num2);
			
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero,please provide valid number");// we write the message inside catch
			System.out.println(e.getMessage());
			
		}
		
	}
	

}
