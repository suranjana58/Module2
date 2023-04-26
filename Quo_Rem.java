package Assignment2;
import java.util.Scanner;

public class Quo_Rem {
//dividend=divisor*quotient+remainder
 public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter dividend and divisor in order:");
	int dividend=sc.nextInt();
	int divisor=sc.nextInt();
	int quotient=dividend/divisor;
	int rem=dividend%divisor;
	System.out.println("quotient: " + quotient + "remainder: " + rem);
	}
}
