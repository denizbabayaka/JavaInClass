package com.class2;

public class VariableDeclaration {

	public static void main(String[] args) {
		//declaring variable num1 that will hold value of int and 
		//assigning /initializing value of 123 to it 
		int num1=123;
		int num2=6767;
		long num3=78687665675675l;
		char num4='A';  // char value single comma
		// declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		n1=5;
		n2=7676;
		n3=767;
		
		//declare all variable together and then assign value
		int number1,number2,number3;
		number1=12;
		number2=15;
		number3=676;
		
		System.out.println(n1);
		System.out.println(number3);
		System.out.println(num2);
		
		// if we assign new value to same variable it will too take consideration
		number3=1000;
		System.out.println(number3);
		
		number2=number1;// we change the value of number2
		System.out.println(number2);
		
		// number2=false;=compile time error asking to change datatype of 
		// variable number2 to boolean 9 we can not assign to boolean a number value 
		
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;//isSnow false because we change the value
		
		System.out.println(isSnow);
		
		isSnow=true;
		System.out.println(isSnow);
		
		
		

	}

}
