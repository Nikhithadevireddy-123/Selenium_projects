package Day_7;
//Write a program where a method accepts an integer parameter and tries to change its value. 
//Print the value before and after the method call. 
public class test {
	public static void meth(int a)
	{
		a=10;
		System.out.println("inside method:"+a);
	}

	public static void main(String[] args) {
		int num=20;
		System.out.println("before method calling:"+num);
		meth(num);
		System.out.println("after method calling:"+num);

	}

}
