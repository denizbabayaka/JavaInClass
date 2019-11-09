package com.class8;

public class Looptask {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				num1=num1+i;	
				
			}else {
				num2=num2+i;
			}
		}

System.out.println("The total of all even#= "+num1);
System.out.println("The total of all odd#= "+num2);
		
		
		
		
	}

}
