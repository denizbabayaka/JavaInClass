package com.class10;

import java.util.Scanner;

public class ArrayExamples {
	public static void main(String[] args) {

		String Capital[] = { "Moscow", "Tashkent", "Nur-Sultan", "Baku", "Kiev", "Ankara", "Paris", "London",
				"Washington, D.C." };
		String Coutry[] = { "Russia", "Uzbekistan", "Kazakhstan", "Azerbajan", "Ukrain", "Turkey", "France", "England",
				"USA" };
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter ther country ");
		String country = scan.next();
		for (int i = 0; i < Coutry.length; i++) {

			String myCountry = Coutry[i];

			for (int j = 0; j < Capital.length; j++) {

				String myCapital = Capital[j];

				if (country.equals(myCountry) && i == j) {
					System.out.println("Capital of the " + country + " is " + myCapital);
					break;
				}
			}
		}

		
			   
	
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
