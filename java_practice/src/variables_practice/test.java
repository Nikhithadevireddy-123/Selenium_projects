package variables_practice;

public class test {
	int x=10;  // non static variable
	static int y=8;  //static variable
	static void meth1()
	{
		System.out.println("Instance variable x:"+new test().x);
		System.out.println("Static variable y:"+y);
	}

	public static void main(String[] args) {
		test obj=new test();
		obj.meth1();
	}
}



