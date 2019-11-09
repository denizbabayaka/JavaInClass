package InterviewQuestions;

public class interviewQuestion1 {

	public static void main(String[] args) {
		
		int a =20;
		int b=30;
		
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("A is :"+a);
		  System.out.println("B is "+ b);
		  
		  String a1 = "Love";
		  String b1 = "You";
		  System.out.println("Before swap: " + a1 + "" + b1);
		  a1 = a1 + b1; // love you
		  b1 = a1.substring(0, a1.length() - b1.length());
		  a1 = a1.substring(b1.length());
		  System.out.println("After : " + a1 + " " + b1);
	}

}
