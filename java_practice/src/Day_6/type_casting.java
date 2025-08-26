package Day_6;

import java.util.Scanner;

public class type_casting {
	Scanner sc=new Scanner(System.in);
	void widening()
	{
		System.out.println("please enter int value");
		int value=sc.nextInt();
		double value1=value;
		System.out.println("int value:"+value);
		System.out.println("double value:"+value1);
		
		System.out.println("please enter double value");
		double value11=sc.nextDouble();
		System.out.println("double value:"+value11);
		int value111=(int)value11;
		System.out.println("int value:"+value111);
		short value1111=(short)value11;
		System.out.println("short value:"+value1111);
		
	}
	public static void main(String[] args) {
		type_casting s=new type_casting();
		s.widening();
		

	}

}
