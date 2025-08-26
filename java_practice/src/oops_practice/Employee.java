package oops_practice;

import java.util.Scanner;

class Emp {
	private String empname;
	private double empsal;
	public String getempname()
	{
		return empname;
	}
	public void setempname(String empname)
	{
		this.empname=empname;
	}	
	public double getempsal()
	{
		return empsal;
	}
	public void setempsal(double d)
	{
		this.empsal=d;
	}
}
public class Employee
{
	void details()
	{
		Emp obj=new Emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emp name");
		obj.setempname(sc.next());
		System.out.println("enter emp sal");
		obj.setempsal(sc.nextDouble());
		
		System.out.println("employee name:"+obj.getempname());
		System.out.println("employee sal:"+obj.getempsal());
		
	}
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.details();

	}

}
