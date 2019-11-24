package com.class22;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = new String("This is a String Handling Tutorial");
	       char[] array = new char[6];
	       str.getChars(10, 16, array, 0);
	       System.out.println("Array Content:" );
	       for(char temp: array){
	           System.out.print(temp);
	}
	}
	}
