package InterviewQuestions;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		
		/* Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array ?
		 */
             
		int [] array= {100,-90,8787,898,0,1};
		// 1 easiest way
		Arrays.sort(array);  // this method sorting numbers
		int min=array[0];
		int max=array[array.length-1];  // stores to the last
				System.out.println(min);
				System.out.println(max);
				
				// 2. way
				
				int[] myArray= {100,-90,8787,898,0,1};
				int largest=0;
				int smallest=0;
				
				for(int i=0;i<myArray.length-1;i++) {
					
					if(myArray[i]>largest) {  // with if condition every time get the value from array and compare 
						largest=myArray[i];    // with the largest number and if condition meets assign new value 
					}                          // to the int largest 
					if(myArray[i]<smallest) {
						smallest=myArray[i];
					}
					
					
				}
				System.out.println("The largest value in the array is "+largest);
				System.out.println("The smallest value in the array is "+smallest);
				
				
				
				
				
				
				
	}

}
