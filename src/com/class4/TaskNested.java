package com.class4;

public class TaskNested {

	public static void main(String[] args) {

		boolean diploma = false;
		double score = 3.4;

		if (diploma) {
			System.out.println("congratulations");
		}else  {
			System.out.println("you should get a degree");
			 if (score >= 3.5) {
			System.out.println("you are eligible for schoalar ship");
		} else {
			System.out.println("you should have studied harder");
		}
		}

	}
}