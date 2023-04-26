package com.assignment1;
import java.util.Scanner;

public class UserName {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);//Scanner object for i/p
	System.out.println("Write your name:");
    String name = in.nextLine();  //Read
    System.out.println("Your name is: " + name);//Output
  }
}
