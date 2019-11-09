package com.class10;

public class AllValuesFromArray {
public static void main(String[] args) {
	
	char[]grades= {'A','B','C','D','E','F'};
	
	for(int i=0;i<grades.length;i++) {
		System.out.println(grades[i]);
	}
	
	String[] animal= {"Cat","Dog","Cow","Snake","Elephant"};
	int size=animal.length;    // declare a value to the size of the array
	
	for(int i=0;i<size;i++) {
		
		System.out.print(animal[i]+" ");  // adss space betweeen 
		
		
	}
	 System.out.println("&&&&&&&&&&&&&&&&&&&&");
	 
	 
	double num[]= {12.5,13.5,23.5,45.2,56.2};
	
	double size1=num.length;
	
	for(int i=0;i<size1;i++) {
		System.out.print(num[i]+" ");
	}
		
	String [] animals= {"Cat","Cow","Dog","Snake","Elephant"};	
	
	for(int i=0;i<animals.length;i++) {
		
		if(animals[i].equals("Dog")) {   // prints the specific element of the string "Dog".
			System.out.println("I love dogs");
		}else {
			System.out.println("I love "+animals[i]);
		}
	}
	
	
	
}
}
