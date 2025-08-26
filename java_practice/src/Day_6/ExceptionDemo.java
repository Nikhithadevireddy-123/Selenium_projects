package Day_6;

public class ExceptionDemo {

	public static void main(String[] args) {
	
	try {
		int a=10;
		int b=0;
		int result=a/b;
		System.out.println("result:"+result);
	}
	catch(ArithmeticException e)
	{
		System.out.println("error:cannot divide by zero");
	}
	try {
		int[] arr= {1,2,3};
		System.out.println("Accessing element: " + arr[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index is out of bounds!");
    } finally {
        System.out.println("Array access operation completed.");
    }
    System.out.println("Program finished.");
}

		

	}

