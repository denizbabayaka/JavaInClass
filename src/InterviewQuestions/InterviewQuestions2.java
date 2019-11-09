package InterviewQuestions;

public class InterviewQuestions2 {

	public static void main(String[] args) {
		
		int [] num= {6,8,9,7,5,3};
		
		int max=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		
		}
		
		System.out.println(max);
int [] num1= { 20, 30, 50, 60, 70,778};
        
        int smallest=num1[0];
        
        for (int i=0;i>num1.length; i++) {
            if (num1[i]>smallest) {
                smallest =num1[i];
                
            }
            
        }
        
        System.out.println(smallest);
        
        
    }
	}


