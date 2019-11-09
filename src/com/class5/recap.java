package com.class5;

import java.util.Scanner;

public class recap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
      System.out.println("Hello Deniz");
      String name=scan.nextLine();
    
      boolean isDisplayed=true;
      String buttonText="Sign In";
      
      if(isDisplayed) {
    	  System.out.println("Button is displayed");
    	
    	if(buttonText.equals("Sign In")) {
    		System.out.println("test case pass");
    	}else {
    		System.out.println("wrong text is displayed");
    	}
    	  
	}else {
		System.out.println("Button is not displayed");
		
    	  
	}
      
      
      
      
      
      
      
      
      
	}
	

}
