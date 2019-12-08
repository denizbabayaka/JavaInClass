package com.class27;

public class ExamplesTest   {

	public static void main(String[] args) {
		
		Examples ex= new smallExample(); // to access overridden methods 
		System.out.println("To access overridden methods ");
		String str=ex.helloName("Deniz");
		System.out.println(str);
		
	    System.out.println("To access overloaded methods ");
   	    Examples ex1= new Examples();  	   
 	    String str1= ex1.helloName("Ebru");
 	    String str2=ex1.helloName("Deniz", "Babayaka");
 	    System.out.println(str1);
 	    System.out.println(str2);
	
		

	}

}
