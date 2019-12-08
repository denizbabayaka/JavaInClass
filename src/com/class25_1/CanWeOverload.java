package com.class25_1;

import com.class23.Main;

public class CanWeOverload {
	// can we overload a private method? yes
	
	private void methodOne() {
		System.out.println("I am method one ");
	}
     private static void methodOne(String str) {
    	 System.out.println("I am method one with "+str);
     }
     // can we overload a main method
     
     public static void main(String str) {
		System.out.println("I am a main method with String arguments");
		
		
	}
     public static void main(String str,String[]arg) {
    	 System.out.println("I am a main method with 2 parameters");
	}
     public static void main(int num) {
		System.out.println("I am main method with 1 integer parameter");
	}
     public static void main(String[] args) {
		System.out.println("I am the main method with String array");
		CanWeOverload.main("String");
		String [] array= {"A","B"};
		main("Hello",array);
		
		
		
	}
}
