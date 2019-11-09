package com.class11;
import java.util.Arrays;
public class TaskTwoDimensionalArray {
//1 2 3    [0][2]=3
//4 5 6
//8 9 10	
	public static void main(String[] args) {

		int[][] num = { { 1, 2, 3 }, { 4, 5, 6,}, { 8, 9, 10 } };
		int sum1 = 0;
		int row=num.length;
		for (int i = 0; i <row; i++) {

			for (int j = 0; j < num[i].length; j++) {

				System.out.print(num[i][j] + " ");

				sum1 = sum1 + num[i][j];
			}
			System.out.println();

		}
		System.out.println("The sum of the elements is " + sum1);
		int sum = 0;
		int[][] allNumbers = { { 3, 6, 8 }, { 2, 45, 67 }, { 67, 6, 5 }, };
		for (int a[] : allNumbers) {
			for (int b : a) {
				sum = sum + b;

			}

		}
     // System.out.println(Arrays.toString(allNumbers[0])); 
	}
}
