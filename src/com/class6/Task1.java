package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		boolean sale;
		 
		System.out.println("will you make shopping");
         sale=scan.nextBoolean();
		int price;
		double discount;
        double finalprice;
	
       
        
        
        if(!sale) {  // here reversing the value
        	
        }else 
          System.out.println("What is the actual price");
	      price=scan.nextInt();
	      if(price<20) {
	    	  discount=price*0.10;
	      }else if (price>=20&&price<100) {
	    	  discount=price*0.20;
	      }else if(price>=100&&price<500) {
	    	  discount=price*0.30;
	      }else  {
	    	  discount=price*0.30;
	      }
        
        
        finalprice=price-discount;  // this variable has to be outside the nested if
        System.out.println("After discount "+discount+" the price of the item reduce from "+price+" to "+finalprice);
        
        }
	}

