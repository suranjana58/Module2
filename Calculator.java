package Assignment2;
import java.util.Scanner;

public class Calculator {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First number:");
		int first=sc.nextInt();
		
		System.out.println("Enter operand(+-*/):");
		char operation = sc.next().charAt(0);
		
		System.out.println("Second number:");
		int second=sc.nextInt();
		
		int result;

	      switch(operation) {
	         case '+':
	            result = first + second;
	            System.out.println(first + " + " + second + " = " + result);
	            break;
	         case '-':
	            result = first - second;
	            System.out.println(first + " - " +second+ " = " + result);
	            break;
	         case '*':
	            result = first * second;
	            System.out.println(first+ " * " +second + " = " + result);
	            break;
	         case '/':
	            if(second == 0) { //undefined
	               System.out.println("Division by zero not allowed");
	               return;
	            }
	            result = first /second;
	            System.out.println(first + " / " + second + " = " + result);
	            break;
	         default:
	            System.out.println("Invalid operation!");
	            break;
	      }
	      sc.close();

	}
}
