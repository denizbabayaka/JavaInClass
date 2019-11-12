package InterviewQuestions;

public class interviewQuestion1 {

	public static void main(String[] args) {
		/* write a program to swap 2numbers without a temporary variable ?
		 * Swap 2 strings without a temporary variable 
		 */
		
		
		int a =10;
		int b=20;
		
		  a=a+b;//30
		  b=a-b;//10
		  a=a-b;//20
		  System.out.println("A is :"+a);
		  System.out.println("B is "+ b);
		  
		  String a1 = "Love";
		  String b1 = "You";
		  System.out.println("Before swap: " + a1 + "" + b1);
		  a1 = a1 + b1; // love you
		  b1 = a1.substring(0, a1.length() - b1.length());
		  a1 = a1.substring(b1.length());
		  System.out.println("After : " + a1 + " " + b1);
		  
		  String str1="Hello";
		  String str2="Bye";
		  
		  str1=str1+str2;//HelloBye
		  str2=str1.substring(0,5);//Hello
		  str1=str1.substring(5);//Bye
		  
		  System.out.println("The value of str1= "+str1);
		  System.out.println("The value of str2= "+str2);
		  
		  
		  
		  
	}

}
