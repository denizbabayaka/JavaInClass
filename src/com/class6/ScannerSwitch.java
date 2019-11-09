package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
public static void main(String[] args) {
	
	Scanner scan;
	scan=new Scanner(System.in);
	String country;
	String foodName = null;
	System.out.println("Please enter your country");
	
	country=scan.nextLine();   // we check the right country
	
	switch(country) {
	case "Turkey":
		foodName="kebab";
		break;
	case "Ethiopia":
	foodName="Tibs";
	break;
	case"Morrocco":
		foodName="Tajin";
		break;
	case "Pakistan":
		foodName="Beryani";
		break;
	
	
		
	}
	System.out.println("Your country is "+country+" and your favorite food is "+foodName);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
