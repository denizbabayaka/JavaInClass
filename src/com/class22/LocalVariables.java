package com.class22;

public class LocalVariables {

	public static void main(String[] args) {
		// I want to access variable myName from different method

		LocalVariables obj = new LocalVariables();// we create instance of the class or obj of the class
		obj.sayName();
		String userEmail = obj.createEmail("John", "Smith", "outlook");// passing argument
		System.out.println(userEmail);// printing the variable which comes from return

		// System.out.println(myName); we can not access myName variable because scope
		// is only within main method

	}

	void sayName() {
		String myName = "John";// local variable
		System.out.println(myName);
		// we can not access obj because scope is only within main method
		// System.out.println(obj);
	}

	String createEmail(String name, String lastName, String email) { // if you want to return something return type
		// must be same with the method type

		String useremail = name + lastName + "@" + email + ".com";// concontinate the variables
		return useremail;
	}
}
