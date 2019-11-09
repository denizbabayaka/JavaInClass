package com.class4;

public class Nestedif {

	public static void main(String[] args) { // main ctrl +enter

		boolean b = true; // first contidition is key to the second condition
		boolean classToday = false;

	if (b) {
			System.out.println("hello"); // unless its true it will not go to outer loop

			if (classToday) {
				System.out.println("hello my friends");
			}
		} else {
			System.out.println("bye"); // always execute false condition
		}

		System.out.println("I am continues code");

	}

}
