package com.class2;

public class Task2 {

	public static void main(String[] args) {
		
		
	int num1=25; //declaring variable num1 that will hold value of int and assigning value of 25
	int num2=35;
	int n1;   //reserving for the future for now keep unvalue
	
	
    int sum=num1+num2;
    int sub=num1-num2;
    int mult=num1*num2;
    int div=num1/num2;
    
    System.out.println("The addition of 2 number "+num1+ " and "+num2+"is equal to "+sum);
    System.out.println("The subtraction of 2 number "+num1+" and "+num2+"is equal to "+sub);
    System.out.println("The multiplication of 2 number "+num1+" and "+num2+"is equal to "+mult);
    System.out.println("The division of 2 number "+num1+" and "+num2+"is equal to "+div);
    
    float num3=3.9f;
    
    float num4=num3*num3;
    
    System.out.println("The square of the "+num3+" is "+num4 ); 
    
    int num5=5;
    int num6=8;
    int mult2=num5*num6;
    int mult3=2*(num5+num6);
   System.out.println("The Perimeter of a rectangle with width " +num5+" and height " +num6+ " is equal to " +mult2+ "and the area is"+mult3);
    
    
		
  String message= "The Perimeter of a rectangle with width " +num5+" and height " +num6+ " is equal to " +mult2+ "and the area is"+mult3;
  		
  // with string we can write shortly
		  
		  System.out.println(message);
		  
		  
		  
		  double d=12;   
		  System.out.println(d);
		  
		  float num7=12.5f;  // int i=12.5 cannot convert from double
		  float num8=3.5f;
		  float div2=num7/num8;
		  
		  System.out.println(div2);
		  
		  //modulus gives remaining of the division;
		  
		  int a=15;    // after the divide remain will 3 
		  int b=4;
		  
		  int remainder=a%b;
		  
		  System.out.println(remainder);
	}

}
