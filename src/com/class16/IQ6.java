package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		
		/* write a java program to find whether  a string is palindrome or not?
		 * if reversed string and original string are same --> string is palindrome 
		 * mom, dad,madam, racecar,kayak 
		 */
               String original="kayak";
               String reversed="";
               // 5-1
               for (int i=original.length()-1;i>=0;i--) {
            	    reversed=reversed+original.charAt(i);//+k=k+a=ka+k
               }
               System.out.println(reversed);
               
               if(original.equals(reversed)) {
            	   System.out.println("String is palindrome");
               }else {
            	   System.out.println("String is not  palindrome");
               }
	}

}
