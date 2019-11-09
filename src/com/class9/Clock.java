package com.class9;

public class Clock {
	public static void main(String[] args) {

		int num = 0;
		for (int i = 0; i < 24; i++) {

			for (int y = 0; y < 60; y++) {

				// System.out.println(i+":"+y);

				if (y < 10) {
					System.out.println(i + ":" + '0' + y);

				} else {
					System.out.println(i + ":" + y);
				}
			}
		}

	}
}
