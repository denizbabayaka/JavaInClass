package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {

		int[] nums = new int[4];
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;

		System.out.println(nums.length); // gives the lenght of array
		System.out.println(nums[0]); // gives the value of

		String[] array = { "Winter", "Fall", "Summer", "Spring" };
		System.out.println("I was born in " + array[2]);
		System.out.println(array.length);

		int arraySize = array.length;
		; // we store size of array in new variable arraySize
		System.out.println(arraySize);

		int[] score = { 80, 90, 70, 100, 99 };

		char grades[] = new char[6];

		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		char grades1[] = { 'A', 'B', 'C', 'D', 'E', 'F' };

		String names1[] = new String[8];

		names1[0] = "Deniz";
		names1[1] = "Davut";
		names1[2] = "Kidist";
		names1[3] = "Meseret";
		names1[4] = "Asim";
		names1[5] = "Junaid";
		names1[6] = "Halil";
		names1[7] = "Ashraf";

		String names[] = { "Deniz", "Davut", "Kidist", "Meseret", "Asim", "Junaid", "Halil", "Ashraf" };

		String type[] = { "Java", "Saturday", "day", "coding", "is" };

		System.out.println(type[1] + " " + type[4] + " " + type[0] + " " + type[3] + " " + type[2]);

	}
}
