package assignment_day4;

class calculate{
	public void add(int a,int b)
	{
		System.out.println("sum(int,int) :"+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("sum(int,int,int) :"+(a+b+c));
	}
	public void add(double a,double b)
	{
		System.out.println("sum(double,double) :"+(a+b));
	}
}

public class Calculator_overloading {

	public static void main(String[] args) {
		calculate calc=new calculate();
		calc.add(1, 0);
		calc.add(1, 2, 3);
		calc.add(20.0, 30.0);
	}

}
