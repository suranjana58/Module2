package Assignment2;

import java.util.Scanner;

public class UserNumber {
	public static void main (String args[]) {	
	Scanner sc=new Scanner(System.in);
	
	
	while (true) {
		System.out.println("Enter number:");
		int num=sc.nextInt();

        if (num < 0) {
            System.out.println("It's Over");
            break;
        } else {
            System.out.println("Good Going");
        }
    }
	}
}
