package com.assignment1;
import java.util.Scanner;
public class Substring {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String mainString = scanner.nextLine();

	        System.out.print("Enter a substring to search for: ");
	        String subString = scanner.nextLine();

	        if (mainString.contains(subString)) {
	            System.out.println("The main string contains the substring.");
	        } else {
	            System.out.println("The main string does not contain the substring.");
	        }

	        scanner.close();
	    }
	

}
