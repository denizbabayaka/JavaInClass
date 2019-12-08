package com.class25_1;

public class Deniz1 {
	
	public static void method(int num) {
		System.out.println("This method with integer");
		
	}
	public static void method(int num,double num2) {
		System.out.println("This method with int and double ");
		
	}
	public static void method(String str,String str1) {
		System.out.println("This method with String");
		
	}
     public static void main(String[] args) {
		Deniz1 obj=new Deniz1();
			method(5);
		    method(6, 7);
		    method("Deniz", "Nisa");
		    Deniz obj1=new Deniz();
		    obj1.num=4;
	}
}
