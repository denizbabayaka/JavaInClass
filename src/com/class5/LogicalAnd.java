package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		
	int num=20;
	
	if(num>1 && num<10) {
		System.out.println("this number is small");  // both condition must be true for execution
	}else if(num>=10&&num<100) {
		System.out.println("this number is medium");
	}else if(num>=100&&num<1000) {
		System.out.println("this number is large");
	}else {
		System.out.println("Number is out of range");
	}
		
	
	
	
	
	

	}

}
