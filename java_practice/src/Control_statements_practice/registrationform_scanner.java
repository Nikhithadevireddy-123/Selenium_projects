package Control_statements_practice;

import java.util.Scanner;

public class registrationform_scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your full name ");
		String name=sc.nextLine();
		System.out.println("enter your mobile number ");
		long number=sc.nextLong();
		System.out.println("enter your email address ");
		String email=sc.nextLine();
		System.out.println("enter your username ");
		String username=sc.nextLine();
		System.out.println("enter your password ");
		String password=sc.nextLine();
		System.out.println("enter confirm password ");
		String conpass =sc.nextLine();
		
		System.out.println("registration details are:...");
		System.out.println("name                  ="+name);
		System.out.println("mobile number         ="+number);
		System.out.println("email address         ="+email);
		System.out.println("username              ="+username);
		System.out.println("password              ="+password);
		System.out.println("confirm password      ="+conpass);
		
		//if(password.length()==conpass.length() )
		//{
		//	System.out.println("");
		//}
		
		

	}
}
