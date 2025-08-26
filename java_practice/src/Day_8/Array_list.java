package Day_8;
//Search an Element 
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("enter a number");
		int al1=sc.nextInt();
		if(al.contains(al1))
		{
			System.out.println("yes number is there");
		}
		else
		{
			System.out.println("number is not there");
		}
	}

}
