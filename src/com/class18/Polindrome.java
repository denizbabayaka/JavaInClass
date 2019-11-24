package com.class18;

public class Polindrome {
	
	
	
	void polind(String original,String reversed) {//parameter
		
		 
          
          if(original.equals(reversed)) {
       	   System.out.println("String is palindrome");
          }else {
       	   System.out.println("String is not  palindrome");
          }
	}
	
	public static void main(String[] args) {
		 
		Polindrome name=new Polindrome();
		
		name.polind("Mom", "Mom");//argument
		
	}

}
