package com.class19;

public class AllMethods {
   
	/* create methods to return value of sum
	 * sub
	 * mult
	 * div
	 */
	
	int sum(int num1,int num2) {
		int result=num1+num2;
		return result;
		
	}
	int sub(int num1,int num2) {
		int result=num1-num2;
		return result;
	}

 int mult(int num1,int num2) {
	int result=num1*num2;
	return result;
}
 int div(int num1,int num2) {
	int result=num1/num2;
	return result;
}
 // method to return whether number is  odd
 
 boolean odd(int num) {
	 boolean isOdd;
	 if(num%2!=0) {
		 isOdd=true;
	 }else {
		 isOdd=false;
	 }
	 return isOdd;
 }
 
 
public static void main(String[] args) {
	AllMethods obj=new AllMethods();
	int rtn=obj.sum(10, 20);
	System.out.println("SUM "+rtn);
	int rtn1=obj.sub(20, 10);
	System.out.println("SUB "+rtn1);
	int rtn2=obj.mult(5, 5);
	System.out.println("MULT "+rtn2);
	int rtn3=obj.div(12	, 2);
	System.out.println("DIV "+rtn3);
	boolean rtn4=obj.odd(5);
	System.out.println(rtn4);
	
}
}
