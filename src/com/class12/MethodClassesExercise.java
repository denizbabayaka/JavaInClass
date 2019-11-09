package com.class12;

public class MethodClassesExercise {
	public static void main(String[] args) {

		/*
		 * .contains(); 
		 */

		String sentence = "It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		System.out.println(sentence.contains("ra")); // checks the letter inside the sentence in every bite 
		
		String name="DEniz BabayaKA";
		
		String name2="MEHmet OKan";		
		
		System.out.println(name.length());
		
		System.out.println(name.equals(name2));
		
		System.out.println(name.contentEquals(name2));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name2.toUpperCase());
		
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println(name.contains("DE"));
		
		String str2="It is very hot in the class";
		System.out.println("Is this string starts with= "+str2.startsWith("It"));
		System.out.println("Is this string ends with="+str2.endsWith("class"));
		
		
		System.out.println("========================");
		
		
		/* This method checks whether aString is empty or not
		 * This method returns true if the given string
		 * is empty,else it returns false.
		 */
		 String str="";
		 System.out.println("is this string empty= "+str.isEmpty());
		 String str1="Hello";
		 System.out.println("Is this string empty="+str1.isEmpty());
		 
		 System.out.println();
		 
		 if(!str.isEmpty()) {
			 System.out.println("This is not empty");
		 }else {
			 System.err.println("This is empty String");
		 }
		
		String sentence1="Each day has a promise to brighten up the day,\nBut first you must allow the sun to come your day. ";// 
		System.out.println(sentence1); // \n cut the sentence and writes in 2 lines 
		
		/* this method appends one String to the end of another.
		 * The method returns aString with the value of the 
		 * String passed in to the method appennded to the end 
		 * of the String used to invoke this method 
		 */
		
		System.out.println("=======================");
		
		
		String str3="Hello";  
		String str4=" World";// move one side for space 
		String str5=" People";
		System.out.println(str3+ str4+str5);
		System.out.println(str3.concat(str4).concat(str5));  // concontination 
		
		
        /* .trim():  This method returns a copy of the string
         * with leading and traailing whitespace omnitted
         */
		String str6=" How are you? ";
		System.out.println(str6);
		
		System.out.println(str6.trim());  // fills the spaces 
		
		/* .charAt();  This method returns the character located at the String's specified index.
		 * The string indexes start from zero
		 */
		
		String str7="We might be done early today";  // Shows the specific index of the line 
		
		System.out.println(str7.charAt(7));
		
		/* .indexOf();  This method returns the index within this string of the 
		 * first occurence of the specifed character or -1 
		 * if the chracter does not occur. 
		 */
		
		
		String str8="We might mnot be done early";
		
		System.out.println(str8.indexOf('m'));
		System.out.println(str8.indexOf('e',5));
		
		
	  
		
		
		

	}
}
