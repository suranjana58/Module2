package Assignment7;
import java.util.ArrayList;
public class SubarrSum {
	    public static void main(String[] args) {
	        int[] arr = {1,3,2,5,1,6,4};
	        int target = 5;
	        ArrayList<ArrayList<Integer>> subarrays = findSubarraysWithTargetSum(arr, target);
	        System.out.println("Subarrays with sum " + target + ": " + subarrays);
	    }
	    public static ArrayList<ArrayList<Integer>> findSubarraysWithTargetSum(int[] arr, int target) {
	        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
	        if (arr == null || arr.length == 0) {
	            return subarrays;
	        }
	        int left = 0;
	        int right = 0;
	        int sum = 0;
	        while (right < arr.length) {
	            sum += arr[right];
	            while (sum > target && left <= right) {
	                sum -= arr[left];
	                left++;
	            }
	            if (sum == target) {
	                ArrayList<Integer> subarray = new ArrayList<>();
	                for (int i = left; i <= right; i++) {
	                    subarray.add(arr[i]);
	                }
	                subarrays.add(subarray);
	            }
	            right++;
	        }
	        return subarrays;
	    }
	}
