package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		// built in
		String str="Hello";
		str=str.replace("Hello", "Hi");// this built in method coming from string class 
		System.out.println(str);
		
		Scanner scan=new Scanner (System.in);// Snanner class built in method
		String scannerString=scan.nextLine();
		System.out.println(scannerString);
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();// user defined
		
	}
  //user built method must outside main method all methods must be uniqe
	void myMethod() {// method header
		// method body
		System.out.println("This is user defined method that I created outside main method");
	}

}
