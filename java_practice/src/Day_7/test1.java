package Day_7;
//Write a Java program to pass primitive data types to a method and observe 
//whether changes inside the method affect the original variables. 

public class test1 {
	public static void meth1(int val) {
	        val += 100;
	        System.out.println("Inside method: val = " + val);
	    }

	    public static void main(String[] args) {
	        int original = 20;
	        System.out.println("Before method: original = " + original);
	        meth1(original);
	        System.out.println("After method: original = " + original);
	    }
}

