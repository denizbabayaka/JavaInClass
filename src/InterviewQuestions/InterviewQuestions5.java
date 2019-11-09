package InterviewQuestions;

public class InterviewQuestions5 {

	public static void main(String[] args) {
		
		String str="Java Killers";
		
		char[]num=str.toCharArray();
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]);
		}

	}

}
