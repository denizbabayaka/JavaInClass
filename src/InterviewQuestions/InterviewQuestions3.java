package InterviewQuestions;

public class InterviewQuestions3 {

	public static void main(String[] args) {
	
		String s = "anka4;%^&r*89a9";
		  System.out.println(s.replaceAll("[^A-Z-a-z]", ""));
		   String s2=s.replaceAll("[^A-Z-a-z]", "");
		   System.out.println(s2.length());
		   
		   
		   
//	     int[] arr = { 14, 46, 47,  };
//	        int min = arr[0];
//	        int largest = arr[0];
//	        int secondLargest = arr[0];
//	        for (int k = 0; k < arr.length; k++) {
//	            if (arr[k] > largest) {
//	                secondLargest = largest;
//	                largest = arr[k];
//	            } else if (arr[k] > secondLargest) {
//	                secondLargest = arr[k];
//	            }
//	        }
//	        System.out.println(" Second largest number is:" + secondLargest);  
		
		

	}

}
