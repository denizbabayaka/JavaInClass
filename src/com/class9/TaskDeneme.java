package com.class9;

import java.util.Scanner;

public class TaskDeneme {
public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Enter a start number: ");
	    int s=sc.nextInt();
	    System.out.print("Enter a end number: ");
	    int e=sc.nextInt();
	    
	    int sumEven=0;
	    int sumOdd=0;
	    
	    
	    for( int i=s; i<=e ;i++) {
	    
	      if(i%2==0) {    
	        
	      sumEven=sumEven+i;
	      
	    
	    }else {
	        sumOdd=sumOdd+i;
	            
	         }
	    }    
	     System.out.println(sumEven);
	     System.out.println(sumOdd);
}
}
