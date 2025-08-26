package Control_statements_practice;
import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		//check if nbr is even or odd using if else(using Scanner class)
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();  //acc to ur req take that datatype
		if(num%2==0)
		{
			System.out.println(num + " is even");
		}
		else
		{
			System.out.println(num + " is odd");
		}

	}

}
