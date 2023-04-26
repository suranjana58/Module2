package Assignment4;
import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        int[] arr= new int[size];
        
        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("The values are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
