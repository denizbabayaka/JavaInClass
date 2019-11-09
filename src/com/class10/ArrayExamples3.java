package com.class10;

import java.util.Scanner;

public class ArrayExamples3 {
	public static void main(String[] args) {

		int[] years = new int[11];

		for (int i = 0; i <= years.length - 1; i++) {

			years[i] = 2010 + i;
		}

		for (int i = 0; i < years.length; i++) {

			System.out.println(years[i]);
		}

		// Write a program that creates an array of integers of size 11. .
//Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values

		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.println(arr[i]);

		}

	}
}
