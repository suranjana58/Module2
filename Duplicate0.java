package Assignment4;
import java.util.*;

		public class Duplicate0 {
		    public static void main(String[] args) {
		        int[] array = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
		        Set<Integer> set = new LinkedHashSet<>();//using set
		        List<Integer> list = new ArrayList<>();  //Create a List to store the modified array
		        for (int i = 0; i < array.length; i++) {
		            if (set.add(array[i])) {
		                list.add(array[i]);
		            } else {
		                list.add(0);//Add 0
		            }
		        }
		        int[] newArray = new int[list.size()];
		        for (int i = 0; i < list.size(); i++) {
		            newArray[i] = list.get(i);
		        }
		        Arrays.sort(newArray);
		        int count = 0;
		       //Convert back to an array
		        System.out.println("Original array: " + Arrays.toString(array));
		        System.out.print("Modified arr::");
		        for (int i = 0; i < newArray.length; i++) {
		            if (newArray[i] != 0) {
		            	
		                System.out.print(newArray[i] + " ");
		            } else {
		                count++;
		            }
		        }
		        for (int i = 0; i < count; i++) {
		            System.out.print("0 ");
		        }  
		    }
		}


