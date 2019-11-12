package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		
		/*Write a java program to reverse String and
		 * reverse a string word by word 
		 */
		
		String given="Welcome to the Java class";
		/*to reverse String 
		 * split();
		 * Step1 :split --> array of String
		 * Step 2:use for loop and use decrement
		 */
		String reversed="";
		String[] str=given.split(" ");
		
		for (int i=str.length-1;i>=0;i--) {
			//System.out.println(str[i]);
			reversed=reversed+str[i]+" ";
		}
		
		System.out.println(reversed);
		
		/* Write a java program to reverse String 
		 * toCharArray();charAt();
		 */
		String given1="Today is java Class";
		
		char[] charArray=given1.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("======================");
		
			String Word3="I love Java";
			
			for(int i=Word3.length()-1;i>=0;i--) {
				System.out.print(Word3.charAt(i));
			}
				
		
		

	}

}
