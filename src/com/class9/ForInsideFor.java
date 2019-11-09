package com.class9;

public class ForInsideFor {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("Deniz");
			for (int y = 1; y <= 3; y++) { // does not go to the first loop unless finish second loop
				System.out.println("Babayaka");
			}
		}
		String name = "Deniz";
		String name1 = "Babayaka";
		for (int i = 0; i <= 5; i++) { // inside loop life depends on outer loop
			// System.out.println(i);
			for (int j = 0; j <= 5; j++) {
				System.out.println(name + " " + name1);

			}
		}

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {
				System.out.println(i + " " + j);
			}
		}

	}

}
