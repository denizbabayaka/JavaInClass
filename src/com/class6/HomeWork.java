package com.class6;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		double num1, num2, num3;

		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Please enter the first number");

		num1 = scan.nextDouble();

		System.out.println("Please enter the second number");

		num2 = scan.nextDouble();

		System.out.println("Please enter the third number");

		num3 = scan.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the largest number");
		}

		int num4, num5, num6;

		System.out.println("Please enter the first number");
		num4 = scan.nextInt();
		System.out.println("Please enter the second number");
		num5 = scan.nextInt();
		System.out.println("Please enter the third number");
		num6 = scan.nextInt();

		if (num4 > num5) {

			if (num4 > num6) {
				System.out.println(num4 + " is the largest number");
			}

		}if(num5>num4) {
			if(num5>num6) {
				System.out.println(num5+" is the largest number");
			}
		}if(num6>num5) {
			if(num6>num4) {
				System.out.println(num6+" is the largest number");
			}
		}

	}
}
