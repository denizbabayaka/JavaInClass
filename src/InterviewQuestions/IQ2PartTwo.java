package InterviewQuestions;

public class IQ2PartTwo {

	public static void main(String[] args) {
		
		// Write a jaca program to find the second largest number in the array
		
		int [] nums= {100,-90,8787,898,0,1,-90,};
		
		int large =nums[0];
		int secondLarge=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]>large) {
				secondLarge=large;
				large=nums[i];
			
			}
			if(nums[i]>secondLarge&&nums[i]<large) {
				secondLarge=nums[i];
			}
		}
		  
		 System.out.println("My large number is "+large);
		 System.out.println("My second large number is "+secondLarge);

	}

}
