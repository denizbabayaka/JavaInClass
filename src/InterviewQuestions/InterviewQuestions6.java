package InterviewQuestions;

import java.util.Scanner;

public class InterviewQuestions6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String a,b="";
		
		System.out.println("Enter the string you want to check");
		
		a=scan.nextLine();
		int n=a.length();
		
		for(int i=n-1;i>=0;i--) {
			b=b+a.charAt(i);  // stores all the chracters of a
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		}else {
			System.out.println("The String is not palindrome");
		}

	}

}
