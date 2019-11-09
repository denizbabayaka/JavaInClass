package com.class10;

public class ArrayIntro {
	public static void main(String[] args) { // args is the variable name of string

		int a;
		a = 10;
		int a1 = 10;

		int [] b ; // declare an array ---->preferred way

		int c[]; // possible

		b= new int[4];  // storing four values
		
		int [] array=new int[4];  // 2nd way  all in one line (declaration% initialization)
		
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;   
		
		System.out.println(array[2]);
		
		// lets create an array that will store classes
		
		String[] classes=new String[4];
		
		classes[0]="Java";   // always starts from the index zero 
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		
		
		
		System.out.println("Today we have "+classes[0]+" class.");
		
		
		int nums []=new int[3];
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		
		nums[0]=100;

		System.out.println(nums[0]);
		
		System.out.println(nums[0]+nums[2]);
		
		
		String[] names=new String[4];
		names[0]="Deniz";
		names[1]="Seda";
		names[2]="Jaime";
		names[3]="Olga";  // during run time we will get an  runtime exception "ArrayIndexOutOfBoundsException" 
		
		System.out.println(names[2]); 
		
		int [] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;					
		System.out.println(numbers[0]);  // prints '0';  
		
		
		

	}
}
