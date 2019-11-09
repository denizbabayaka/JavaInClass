package com.class5;

import java.util.Scanner;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		double commission;                          // first we declare a variable and then assign to scanner 
		double salesAmount;
		Scanner scan;
		 scan=new Scanner(System.in);
		 
		 
		System.out.println("What is the daily sales?");
		salesAmount= scan.nextDouble();
		
		 
		 if(salesAmount<100) {
			 commission=salesAmount*0.1;
		 }else if(salesAmount>=100&&salesAmount<200) {
			 commission=salesAmount*0.2;
			 
		 }else if(salesAmount>=200&&salesAmount<500) {
			 commission=salesAmount*0.3;
		 }else if (salesAmount>=500) {
			 commission=salesAmount*0.5;
			 
		 }else {
			 commission=0;
		 }
		 
System.out.println(" Based on the sales your commision is "+commission);
	}

}
