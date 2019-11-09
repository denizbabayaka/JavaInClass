package com.class4;

public class Recap {

	public static void main(String[] args) {
		int num = 23;
		num = 90;
		num -= 200;// -110=90-200
		num -= 110;
		num += 220;
		if (num > 0) {
			System.out.println(num + " is a positive number");

		} else if (num == 0) {
			System.out.println("value of num is " + num);
		} else {
			System.out.println(num + "is a negative number");
		}

		int i = 137;
		if (i % 2 == 0) {
			System.out.println(i + " is an even number");
		} else {
			System.out.println(i + "is an odd number");
		}
		if (i % 2 != 0) {
			System.out.println(i + "is an odd number");
		} else {
			System.out.println(i + "is an odd number");
		}

		/*
		 * class schedule if tuesday --->sdlc if wednesday ---> java review if thursday
		 * --->sdlc if saturday --> java coding if sunday---> my favorite java coding
		 */
		int day;
		day = 4;

		if (day == 4) {
			System.out.println("Sdlc Class");
		} else if (day == 3) {
			System.out.println("review class");
		} else if (day == 4) {
			System.out.println("sdlc class");
		} else if (day == 6) {
			System.out.println("java class");
		} else if (day == 7) {
			System.out.println("favorite java Class");
		} else {
			System.out.println("there is no class at school");

		}

	}

}
