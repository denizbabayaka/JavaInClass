package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("num1 is larger than num2");    // if could not find the statement then goes to else statement
		} else if (num1 == num2) { // double equal means comparing to number ==
			System.out.println("num1 is smaller than num2");
		} else {

			System.out.println("num1 is equal to num2");
		}

		int day = 5;

		if (day == 1) {

			System.out.println("today is monday");
		} else if (day == 2) {
			System.out.println("today is tuesday");
		} else if (day == 3) {
			System.out.println("today is wednesday");

		} else if (day == 4) {

			System.out.println("today is thursday");
		} else if (day == 5) {
			System.out.println("today is friday");

		} else if (day == 6) {
			System.out.println("today is saturday");
		} else if (day == 7) {
			System.out.println("today is sunday");
		} else {
			System.out.println("I do not know this day");
		}

	}

}
