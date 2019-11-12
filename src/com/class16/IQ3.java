package com.class16;

public class IQ3 {

	public static void main(String[] args) {
		
		/*
		 * Find out how many alpha characters present in a string?
		 */
		

			String str = "Hello 6876868 *&^^, welcomegyggiugig!!!!";

			str = str.replaceAll("[^A-Za-z]", "");

			System.out.println(str.length());
			System.out.println(str);
			
	}

}
