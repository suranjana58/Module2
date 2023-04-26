package com.assignment1;
import java.util.Scanner;

public class CircleArea {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input radius:");
		int r=sc.nextInt(); //since integer
		int area=0;
		area=(int) (3.14 *r*r);
		System.out.println("Area is:"+area);
	}
}
