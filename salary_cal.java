package Assignment2;
import java.util.Scanner;
public class salary_cal {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = input.nextDouble(); //can take int also
        double hra, da;
        if (basicSalary <= 15000) {
            hra = 0.25 * basicSalary;
            da = 0.82 * basicSalary;
        } else if (basicSalary <= 20200) {
            hra = 0.27 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.36 * basicSalary;
            da = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross salary: " + grossSalary);
    }
}
