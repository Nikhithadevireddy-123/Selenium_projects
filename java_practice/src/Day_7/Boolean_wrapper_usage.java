package Day_7;

public class Boolean_wrapper_usage {

	public static void main(String[] args) {
		        Boolean b1 = Boolean.valueOf(true);
		        Boolean b2 = Boolean.valueOf("false");

		        System.out.println("b1: " + b1);
		        System.out.println("b2: " + b2);

		        if (b1) {
		            System.out.println("b1 is true");
		        } else {
		            System.out.println("b1 is false");
		        }

	}

}
