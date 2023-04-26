package Assignment4;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {5,8,10,12};
        int searchNumber = 2;
        
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The number is there in the array.");
        } else {
            System.out.println("The number was not found in the array.");
        }
    }
}
