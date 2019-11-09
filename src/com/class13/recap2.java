package com.class13;

public class recap2 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1 == str2);

		System.out.println("==========equals============");

		String str3 = new String("Bye");
		String str4 = new String("Bye");
		System.out.println(str3.equals(str4)); // checks the content of variable
		System.out.println(str3 == str4); // checks the object that's why false

		System.out.println(str1.contains("ll"));

		System.out.println("=========Starts with ends with==========");

		String str5 = "Today is Saturday";
		System.out.println(str5.startsWith("Today")); // returns boolean value
		System.out.println(str5.endsWith("day"));

		System.out.println("==========concat trim=============");

		System.out.println(str5.concat(" and we have java class"));

		String str6 = "    It is sunny  ";
		System.out.println(str6.trim()); // corrects the spaces

		System.out.println("=======index of chat at=======");

		String str7 = "Tomorrow we will be done with String Manipulation";

		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e', 11)); // count after first e
		System.out.println(str7.indexOf("we")); // count after where the w starts
		System.out.println(str7.charAt(10));
	}

}
