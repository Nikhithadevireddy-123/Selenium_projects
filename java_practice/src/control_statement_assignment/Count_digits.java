package control_statement_assignment;

public class Count_digits {

	public static void main(String[] args) {
		        int num = 123;
		        int count = 0;//1 //2 //3
		        if (num == 0)
		        {
		            count = 1; 
		        } 
		        else
		        {
		            while (num != 0) {
		                num /= 10; //3 //2 //1
		                count++; //1 //2 //3
		             }
		        }
		        System.out.println("Total digits: " + count);

	}

}
