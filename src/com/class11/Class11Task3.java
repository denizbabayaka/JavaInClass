package com.class11;

public class Class11Task3 {

	public static void main(String[] args) {
		String[][] grades = { { "American", "German", "Korean" }, { "ford", "mustang", "chevy" },
				{ "audi", "bmw", "mercedes" }, { "toyota", "kia", "reno" }, };

		for (int i = 0; i < grades[i].length; i++) {
			System.out.print(grades[0][i] + " cars are:");
			for (int j = 0; j < grades[i].length; j++) {
				System.out.print(grades[i + 1][j] + "--");
			}
			System.out.println();

		}
System.out.println("========================");



		String[][] countries1 = { { "NorthAmerica", "SouthAmerica", "Europe" }, { "USA", "Canada", "Mexico" },
				{ "Venezuella", "Chile", "Cuba" }, { "Germany", "Austria", "France" } };

		for (int i = 0; i < countries1[i].length; i++) {
			System.out.print(countries1[0][i] + " countries are :");

			for (int y = 0; y < countries1[i].length; y++) {
				System.out.print(countries1[i + 1][y] + "--");
			}
		System.out.println();
		}
	}
}
