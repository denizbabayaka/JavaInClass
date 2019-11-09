package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b1=!true;      // ! means not it is reversing condition
		boolean b2=!false;
		 System.out.println(b1);
         System.out.println(b2);
         
         boolean traffic=false;    //even the condition true if we put! condition becomes false
          
         if(!traffic) {
        	 System.out.println("hello");
         }else {
        	 System.out.println("bye");
         }
         
         boolean isRain=false;
         
         if (!isRain) {
        	 System.out.println("Take an umbrella");
         }
          
         int num1=10;
         int num2=11;
         
         if(num1==num2) {
        	 System.out.println("numbers are equal");
         }else {
        	 System.out.println("numbers are not equal");
         }
         
         if(!(num1==num2)) {                             //reversing condition in this line 
        	 System.out.println("numbers are not equal");
         }else {
        	 System.out.println("numbers are equal");
        
    
         
         }
	
         String name="Mary";
 		String name2="Anna";
 		
 		if(!(name.equals("Mary")||name2.equals("Anna"))) {  // we reverse the condition and becomes false
 			System.out.println("you are not my sister");
 		} else {
 			System.out.println("you are my sister");
 		}
	
	
	
	
	
	
	}	
	
	
	

}
