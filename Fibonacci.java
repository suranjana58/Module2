package Assignment3;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter till what number: ");
        int num = input.nextInt();
        
		int first=0;
		int second=1;
		int sum;
		
		System.out.print("Fibonacci series: ");
		System.out.print(first + " " + second + " ");
		
		for(int i=2; i<=num; i++) {
			sum = first + second;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		}	
	}
}
