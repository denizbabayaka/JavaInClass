package com.class24;

public class ThisWithConstructor {
	
	 ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}
	 ThisWithConstructor(String str) {
		 this(); // used to call current class constructor
			System.out.println("I am  constructor 1 String parameter");
		}
	 ThisWithConstructor(String str, String str1){
		 this(str);
		 System.out.println("I am  constructor 2 String parameter");
		 
	 }
	 
	 public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		System.out.println("________Second object___________");
		// can we execute 2 constructor at the same time 
		//yes-it can be achieved using this()
		// this type of constructor calls is known as CONSTRUCTOR CHAINING
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","World");
	}

}
