package Assignment3;

import java.util.Scanner;

public class Nnumbers {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n, i = 1, sum = 0;

	        System.out.print("Enter value of n: ");
	        n = in.nextInt();

	        do {
	            sum += i;//sum+i
	            i++;
	        } while (i <= n);

	        System.out.println("The sum of the first n numbers" + sum);
	    }
	}
