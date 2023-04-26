package Assignment4;

public class avgArr {
	
	    public static void main(String[] args) {
	        int[] arr= {5, 8, 10, 12};
	        
	        int sum = 0;
	        for (int i = 0; i < 4; i++) {
	            sum += arr[i];
	        }
	        
	        double average = (double)sum/4;
	        System.out.println("The average:" + average);
	    }

}
