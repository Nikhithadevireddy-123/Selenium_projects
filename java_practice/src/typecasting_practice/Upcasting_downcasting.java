package typecasting_practice;

class test {
		void show()
		{
			System.out.println("hello");
		}
}
class test1 extends test{
	void display()
	{
		System.out.println("welcome");
	}
	void show()
	{
		System.out.println("wel");
	}
}
public class Upcasting_downcasting
{
	public static void main(String[] args) {
	test t1=new test();
	t1.show();
	test t=new test1();//upcasting
	t.show();
	test1 t2=(test1)t;//downcasting
	t2.display();
	t2.show();
	}
}
