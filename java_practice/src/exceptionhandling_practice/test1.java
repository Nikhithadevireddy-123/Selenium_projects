package exceptionhandling_practice;
import java.util.*;

public class test1 {
	    public static void main(String[] args) {
	        try {
	            
	            int result = 10 / 0;
	            System.out.println("Result: " + result);

	           
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]);
	        
	            String str = "abc";
	            int num = Integer.parseInt(str);
	            System.out.println("Parsed number: " + num);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Error: " + e.getMessage());
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Error: " + e.getMessage());
	        } 
	        catch (NumberFormatException e) {
	            System.out.println("Number Format Error: " + e.getMessage());
	        } 
	        catch (Exception e) {
	            System.out.println("General Exception: " + e.getMessage());
	        } 
	        finally {
	            System.out.println("Finally block always executes.");
	        }

	        System.out.println("Program continues after exception handling.");
	    }
}
