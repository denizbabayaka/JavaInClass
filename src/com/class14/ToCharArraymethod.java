package com.class14;

import java.util.Arrays;

public class ToCharArraymethod {

	public static void main(String[] args) {
		
		// this method convert string to a new character array
		
		String str="Syntax";
		
		char[] array=str.toCharArray();
       
		for(char i:array) {
			System.out.println(i);	
		}
		System.out.println("****************");
		
		char [] a= {'a','b','c'};
		System.out.println(a);
		
//		   String [] str = {"123", "345", "437", "894"};
//		      int size = str.length;
//		      int [] arr = new int [size];
//		      for(int i=0; i<size; i++) {
//		         arr[i] = Integer.parseInt(str[i]);
//		      }
//		      System.out.println(Arrays.toString(arr));
		   
		
		
		
		
		
	}

}
