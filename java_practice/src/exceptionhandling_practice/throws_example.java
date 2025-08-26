package exceptionhandling_practice;

public class throws_example {
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition:"+sum);
	}
	void div(int a,int b)throws ArithmeticException
	{
		int div=a/b;
		System.out.println("division:"+div);
	}

	public static void main(String[] args) {
		throws_example d=new throws_example();
		d.add(1, 2);
		d.div(10, 2);
		

	}

}
