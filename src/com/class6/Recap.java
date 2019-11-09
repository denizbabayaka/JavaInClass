package com.class6;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		Scanner scan;
		int time;
		String timeOfday;  // if it is out of range we can assign "null" value
		scan = new Scanner(System.in);
		System.out.println("What time will you come?");
		time = scan.nextInt();

		if (time >= 1 && time <= 11) {
			timeOfday = "Morning"; // instead of writing syso we can declare a value to a variable of timeOfday;
		} else if (time >= 12 && time <= 15) {
			timeOfday = "Afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfday = "Evening";
		} else if (time >= 20&&time<=24) {
			timeOfday = "Night";

		} else {
			timeOfday = "Invalid";
		}
		System.out.println("Time of the day you will come  is " + timeOfday+'.');
		if (timeOfday.equals("Morning")) {
			System.out.println("Good morning");
		}
	}
}
