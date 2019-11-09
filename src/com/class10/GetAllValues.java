package com.class10;

import java.util.Scanner;

public class GetAllValues {
	public static void main(String[] args) {

		String[] animal = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		// int size=animal.length; // declare a value to the size of the array

		for (int i = 0; i < animal.length; i++) {

			if (animal[i].equals("Dog")) { // as soon as see the dog if condition executes
				System.out.println("I love dogs");
			} else {
				System.out.println(animal[i]);
			}

		}

		String country[] = { "Turkey", "USA", "India", "Holland", "Germany" };

		for (int i = 0; i < country.length; i++) {

			if (country[i].equals("Turkey")) {
				System.out.println("Istanbul");
			} else if (country[i].equals("USA")) {
				System.out.println("Washingtion");
			} else if (country[i].equals("India")) {
				System.out.println("Delhi");
			} else if (country[i].equals("Holland")) {
				System.out.println("Amsterdam");
			} else if (country[i].equals("Germany")) {
				System.out.println("Berlin");
			}
		}

		
	
	}
}
