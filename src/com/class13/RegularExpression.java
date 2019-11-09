package com.class13;

public class RegularExpression {

	public static void main(String[] args) {
		
		// print only text and numbers
		String str="12345Hello";
		String str1="12-22-1990";//12/22/1990
		System.out.println(str.replaceAll("[0-9]","" ));  // remove numbers
		System.out.println(str.replaceAll("[^0-9]","" )); // remove text
		System.out.println(str.replaceAll("[a-zA-Z]","" ));// remove text 2nd way ("[A-z]","")
		
		System.out.println(str1.replace('-', '/'));
		System.out.println(str1.replaceFirst("-","/")); // custom expression for replacing first expression -
		System.out.println("==================");
		
		// remove everything except text
		
		String str2="Hi##$$%%How$&*452255";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));  //^ not remove (remove except number and text)
		System.out.println(str2.replaceAll("\\W", ""));// custom expression remove except number and text
		
		
	}

}
