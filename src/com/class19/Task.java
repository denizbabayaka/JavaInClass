package com.class19;

public class Task {

	String createEmail(String username, String lastname, String type) {
		String email = username + lastname + type;
		return email;

	}

	boolean prime(int num) {

		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false; // condition become false
		} else {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
		return isPrime;
	}

	void Grade(int score) {
		char grade;
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		}

	}

	public static void main(String[] args) {

		Task obj = new Task();
		String rtn = obj.createEmail("john", "snow", "@gmail.com");
		String rtn1 = obj.createEmail("john", "snow", "@yahoo.com");
		System.out.println(rtn);
		System.out.println(rtn1);
		boolean rtn2 = obj.prime(7);
		System.out.println(rtn2);

	}
}
