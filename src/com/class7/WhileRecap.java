package com.class7;

import java.util.Scanner;

public class WhileRecap {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        int price;
	        
	        do {
	            System.out.println("Pay for Your coffee");  // first we ask the user then check the condition
	            price = scan.nextInt();
	            
	        }while (price!=5);  // unless price not equal to 5 condition turns   fiyat 5 e esit olmadigi muddetce loop devam ediyor 
	        
	            System.out.println("Enjoy Your coffe");

	}

}
