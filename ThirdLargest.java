package Assignment4;

public class ThirdLargest {
	    public static void main(String[] args) {
	        int[] array = {5,8,10,3,1,7,9};
	        
	        int firstLargest = array[0];
	        int secondLargest = Integer.MIN_VALUE;
	        int thirdLargest = Integer.MIN_VALUE;
	        
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > firstLargest) {
	                thirdLargest = secondLargest;
	                secondLargest = firstLargest;
	                firstLargest = array[i];
	            } else if (array[i] > secondLargest) {
	                thirdLargest = secondLargest;
	                secondLargest = array[i];
	            } else if (array[i] > thirdLargest) {
	                thirdLargest = array[i];
	            }
	        }
	        
	        if (thirdLargest != Integer.MIN_VALUE) {
	            System.out.println("The third largest element in the array is " + thirdLargest);
	        } else {
	            System.out.println("There is no third largest element in the array.");
	        }
	    }
	}

