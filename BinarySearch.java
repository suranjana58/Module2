package Assignment4;

public class BinarySearch {
	    public static void main(String[] args) {
	        int[] array = {5, 8, 10, 12};
	        int searchNumber = 8;
	        
	        int low = 0;
	        int high = array.length - 1;
	        boolean found = false;
	        
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (array[mid] == searchNumber) {
	                found = true;
	                break;
	            } else if (array[mid] < searchNumber) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        
	        if (found) {
	            System.out.println("The number was found in the array");
	        } else {
	            System.out.println("The number was not found in the array");
	        }
	    }
}
