package Assignment3;

import java.util.Scanner;

public class LargestSmallestNumbers {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;//initialize 
        int smallest = Integer.MAX_VALUE;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a series of numbers (separated by spaces): ");
        String in = scanner.nextLine();
        String[] numbers = in.split(" ");
        
        for (String number : numbers) {
            int n = Integer.parseInt(number);
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }
        
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
