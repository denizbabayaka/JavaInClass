package com.class8;

public class ForLoop2 {

	public static void main(String[] args) {
		
		
		for(int i=20;i<=50;i++) {
         if(i%2==0) {
        	 System.out.println(i+".");
         }
	}
	
		for(int i=20;i<=20;i+=2) {
			System.out.println(i+".");
		}
		
		
		
		for(int i=21;i<=50;i+=2) {
			
			System.out.println(i+ ",");;
		}
	
	   for(int i=20;i<=50;i++) {
		   
		   if(i%2==1) {                      // if we put ! it will print also odd numbers 
			   System.out.println(i+ ".");
		   }
	   }
	
	
	
	
	
	
	
	}
}
