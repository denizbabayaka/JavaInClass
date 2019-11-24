package com.class18;

public class Even {

	
	
	void EvenOrOdd(int a) {
		if(a%2==0) {
			System.out.println("This number is even");
		}else {
			System.out.println("This number is odd");
		}
	
	}
	
	public static void main(String[] args) {
		Even num=new Even();
		
		num.EvenOrOdd(8);
	}
}
