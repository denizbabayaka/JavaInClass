package com.class18;

public class Numbers {

	
	
	void Biggest(int a,int b){
		if(a>b) {
			System.out.println(a+" is bigger");
		}else {
			System.out.println(b+" is bigger");
		}
	}
	
	public static void main(String[] args) {
		
		Numbers num=new Numbers();
		
		
		num.Biggest(5, 7);
	}
}
