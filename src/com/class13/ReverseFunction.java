package com.class13;

public class ReverseFunction {
	public static void main(String[] args) {

		String original = "Today is java Class";

		String reverse = "";

		char[] array = original.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];// ""+"s" reverse hold the value of array at every itteration
			
		}

		System.out.print(reverse);

		// 2 charAt()

		String reverse1 = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + original.charAt(i);// we create on object
		}
		System.out.println("Reversed string is :" + reverse1.toLowerCase());

	}
}
