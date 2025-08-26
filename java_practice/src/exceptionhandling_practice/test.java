package exceptionhandling_practice;

public class test {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(1);
		try {
			int[]a=new int[4];
			System.out.println(a[6]);
			System.out.println(5/0);
			String str="hello";
			System.out.println(str.charAt(6));	
		}
		catch(StringIndexOutOfBoundsException e)  //we can also write exception
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println(4);
		System.out.println(4);
		

	}

}
