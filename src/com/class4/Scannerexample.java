package com.class4;

import java.util.Scanner;

public class Scannerexample {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // keyboard input allows us to enter input
		System.out.println("please enter any number");
		/*
		 * nextInt();--->for numbers nextLine();---> Strings nextDouble();--->double
		 * 
		 */

		int number = scan.nextInt();// this is the code for to enter input we can only enter number
		System.out.println("Entered number is " + number);
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();   // next line takes entire line //next() takes first word until space
		System.out.println("Good afternoon " + name);

	}
}
