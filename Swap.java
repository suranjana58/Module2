package com.assignment1;

public class Swap {
	public static void main(String args[]) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First number now:"+a);
		System.out.println("Second number now:"+b);
	}
}
