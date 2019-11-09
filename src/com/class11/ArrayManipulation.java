package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
	
		String [] actualNames1= {"john","Smith","Alex","Tanaz"};
		String [] expectedNames1 = {"Smith","John","Alex","Tanaz"};		
		
		System.out.println(Arrays.toString(actualNames1));
		
		String actual1=Arrays.toString(actualNames1);
		String expected1=Arrays.toString(expectedNames1);
		
		System.out.println(actual1.equals(expected1));
		
		

		String[] actualNames= {"Jhon", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array in Alphabetic order
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));

	}

}
