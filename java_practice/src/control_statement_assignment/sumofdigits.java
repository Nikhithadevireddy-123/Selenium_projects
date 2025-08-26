package control_statement_assignment;

public class sumofdigits {

	public static void main(String[] args) {
		        int num = 122;
		        int sum = 0; //for storing
		        while (num>0) {
		            int digit = num % 10;  //extracts last digit
		            sum += digit;    //adding last digit to sum
		            num /= 10;     //here last digit is removed
		        }
		        System.out.println("Sum of digits: " + sum);
		    }
		

	}

