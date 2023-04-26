package Assignment4;
import java.util.Arrays;
public class ArrEqual {
	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {1, 1, 3, 4, 5};
	        boolean isEqual = Arrays.equals(array1, array2);
	        if (isEqual) {
	            System.out.println("The two arrays are equal.");
	        } else {
	            System.out.println("The two arrays are not equal.");
	        }
	    }
	}


