package com.class13;

public class StringManipulation1{

	public static void main(String[] args) {
		
		// This method returns a new string that is a substring of this string
		
		String str="Java is getting interesting";
		
		System.out.println(str.substring(15));// starts from this number
		System.out.println(str.substring(7,15));  // returns whatever between this numbers
		
		
		String str1="Sunday";
		
		//char[]str2=str1.toCharArray();
		
		for(int i=(str1.length()-1);i>=0;i--) {  // value of string is 5 but length is 6 thats why we start from  -1
			System.out.println(str1.charAt(i));
		}
		
		
		String str5="Java is getting interesting";
        char[] arr=str5.toCharArray();
        for(int i=(str5.length()-1);i>=0;i--) {
            System.out.print (arr[i]);
        }
        System.out.println();
		
		String str6="Hello";
		int length=str6.length();
		int middle=str6.length()/2;
		if(!str6.isEmpty()) {
			if(str6.length()%2!=0&&str6.length()>=3) {
				System.out.println(str6.charAt(middle));
			}
			
		}
        

	}

}
