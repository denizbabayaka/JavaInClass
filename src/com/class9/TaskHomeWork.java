package com.class9;

import java.util.Scanner;

public class TaskHomeWork {

	public static void main(String[] args) {
		Scanner scan;
		int secretNumber, guessNumber;
		scan = new Scanner(System.in);
		secretNumber = 12;
		// for (int i=0; i<20; i++) -> you are limiting user to 20 inputs
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber = scan.nextInt();

			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		} while (guessNumber != secretNumber);  // if we do not know how many times user will enter  number we use do while 

		System.out.println("Congratulations you got it");
	}
	

	}


