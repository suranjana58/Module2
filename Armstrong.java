package Assignment7;

public class Armstrong {
	    public static boolean isArmstrong(int num) {
	        int sum = 0;
	        int temp = num;
	        int numDigits = String.valueOf(num).length();
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, numDigits);
	            temp /= 10;
	        }
	        return sum == num;
	    }

	    public static void main(String[] args) {
	        int num1 = 153;
	        System.out.println(num1 + " is an Armstrong number: " + isArmstrong(num1));
	    }
	}



