package com.class12;

public class TwoDArrayRecapDemo {

	public static void main(String[] args) {
		int[][] array1 = new int[2][3];
		// first row
		array1[0][0] = 9;
		array1[1][1] = 10;
		array1[0][2] = 11;
		// second row
		array1[1][0] = 9;
		array1[1][1] = 10;
		array1[1][2] = 11;

		for (int i[] : array1) {
			for (int j : i) {
				System.out.println(j);
			}

		}
		System.out.println("==============");

		int[][] array2 = { { 44, 55, 67 }, { 11, 22, 33 } };
		int sum = 0;
		for (int[] is : array2) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
				sum = sum + is2; // we total the sum of the element inside loop
			}
			System.out.println();
		}
		System.out.print(sum);
	}

}
