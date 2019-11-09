package com.class6;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		Scanner scan;
		scan = new Scanner(System.in);

		String country;
		String language = null;
		System.out.println("Which country are you from");
		country = scan.nextLine();

		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "England":
			language = "English";
			break;
		case "Russia":
			language = "russian";
			break;
		case "Spain":
			language = "Spanish";
			break;

		}

		System.out.println("My country is " + country + " and my  language " + "is " + language);

		char grade;
		String explanation;
		System.out.println("Please enter your grade");
		grade = scan.next().charAt(0);

		switch (grade) {

		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Avarage";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not Accaptable";

		}

		System.out.println("Your grade is " + grade + " and you are " + explanation);

	}
}
