package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
public static void main(String[] args) {
	
	    
	    Scanner scan;
	    scan=new Scanner(System.in);
	    
	    
	    String gender ;
	    int age;
	    String output;
	    gender =scan.nextLine();
	    age=scan.nextInt();
	    
	    
	    
	      
	      if(age>25){
	       output ="Man";
	      }else{
	        output="Boy";
	      }
	      
	      
	      }else{
	        if(age>25){
	          output= "Woman";
	          
	        }
	        else{
	          output = "girl";
	        }
	        System.out.println(output);
	        
	      }
	      
	     } 
	}
	    
	}
	      

	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
