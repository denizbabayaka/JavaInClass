package com.class13;

public class ToCharArray {
public static void main(String[] args) {
	
	String str="Saturday";
	char [] array=str.toCharArray();// convert string to array of characters
	for(int i=array.length-1;i>=0;i--) { //-1 is diffrence between value of character and index
		System.out.println(array[i]);
	}
	System.out.println("=============");
	for(char c:array) {
		System.out.println(c);
	}
	
	
	
	
}
}
