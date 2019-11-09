package com.class11;

public class TaskTwoDimensionalArray1 {

	public static void main(String[] args) {

		int[][] num = { { 4, 5, 7, 8 }, { 6, 12, 14, 17 }, { 23, 25, 27, 30 } };
		int sum = 0;
		for (int num3[] : num) {

			for (int num4 : num3) {

				if (num4 % 2 == 0) {
					System.out.print(num4 + " ");
				}
				sum = sum + num4;
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
