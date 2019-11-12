package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		/* Write a program whether a given number is prime or not
		 *  prime number is a number that has to meet 2 conditions:
		 *  it should be divisible by 1 and by itself only 
		 */
		
	     int num=5;
	     boolean isPrime=true;
	     
	     if(num<=1) {
	    	 isPrime=false; // condition become false 
	     }else {
	    	 
	     
	     
	     for(int i=2;i<num;i++) {
	    	 if(num%i==0) {
	    		 isPrime=false;
	    	 }	 break;
	    	 }
	     }
		if(isPrime) {
			System.out.println(num+" is a Prime number");
		}else {
			System.out.println(num+" is not a Prime number");
		}
	     
	}

}
