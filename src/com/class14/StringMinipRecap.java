package com.class14;

public class StringMinipRecap {

	public static void main(String[] args) {
		//.replace
		String str=new String("Hello");
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
		
		System.out.println("=====================");
		
		String str1=" your Syntax Technologies is your place to study";
		System.out.println(str1.replace('y', 'i'));
		
		System.out.println("====================");
		System.out.println(str1.replace("your", "My"));  // replace all character in 
		
		
		
		
		
		
		
		

	}

}
