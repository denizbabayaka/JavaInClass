package com.class4;

public class NesteIfmore {

	public static void main(String[] args) {
	
		/*check age ,if age is less than 16 --->you are too young to drive 
		 * otherwise we will check 
		 * if you are older than 18 then we gonna say you can get driver licence 
		 * if not you can get drivers permit
		 */

		
		 int age= 55;
		 
		 if(age<16) { 
			 System.out.println("you are too young");
			 
		 }else {
				 System.out.println("you are eligible drive");
			
		 if(age>=18) {
			 System.out.println("you can drive alone ");
		 } else {
			 System.out.println("you need parents to drive");
		 }
		 
		 
		 
		 }
		 
		 
		 
		 }
	}


