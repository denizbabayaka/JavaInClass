package com.class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//

		int num[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		System.out.println(num[0][2]);
		int num1[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14 } };

		System.out.println(num1[2][2]);

		// Declare 2D Array

		int[][] array = new int[3][5];

		// 1st row

		array[0][0] = 44;
		array[0][1] = 80;
		array[0][2] = 33;
		array[0][3] = 20;

		// 2nd row

		array[1][0] = 10;
		array[1][1] = 5;
		array[1][2] = 7;
		array[1][3] = 8;

		// 3rd row

		array[2][0] = 11;
		array[2][1] = 9;
		array[2][2] = 70;
		array[2][3] = 81;
		System.out.println(array[0][0]);

		System.out.println(array[1][3]);

		String[][] name = new String[3][5];

		name[0][0] = "Deniz";
		name[0][1] = "Ali";
		name[0][2] = "Hasan";
		name[0][3] = "Huseyin";

		// 2nd row

		name[1][0] = "john";
		name[1][1] = "Alex";
		name[1][2] = "Jaime";
		name[1][3] = "Tom";

		// 3rd row

		name[2][0] = "Kidi";
		name[2][1] = "Mesi";
		name[2][2] = "Hale";
		name[2][3] = "Hannah";

		String[][] name1 = { { "Ali", "Veli", "Hasan", "Huseyin" }, { "Ahmet", "Deniz", }, { "Baris", "Mehmet" } };

		for (String name2[] : name1) {
			for (String name3 : name2) {
				System.out.print(name3 + " ");

			}
			System.out.println();
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&");

		int[][] numbers = { { 8, 7, 5, 3, 8 }, { 1, 5, 6, 4, 9, 8 }, { 3, 6, 8, 0, 7 } };
		System.out.println(numbers[1][4]+" ");

		// To identify the numbers of rows
		System.out.println("the numbers of rows are: " + numbers.length);

		// To iddentify the numbers of columns/elements
		System.out.println("The numbers of Rows are: " + numbers[1].length);

		for (int i = 0; i < numbers.length; i++) {   // i her seferinde store ettigi deger number.lenth ile sinirli yani 3
			for (int j = 0; j < numbers[i].length; j++) {  //j loopu hangi column u yazdirma degerini i loop guncel degerinden  aliyor
				System.out.print(i+":"+numbers[i][j] + " ");

			}
			System.out.println();
		}

	}
}
