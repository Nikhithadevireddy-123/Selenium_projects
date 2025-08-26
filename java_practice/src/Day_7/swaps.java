package Day_7;

public class swaps {
	public static void me4th(int a,int b)
	{
		int temp;
		a=10;
		b=20;
		temp=b;
		b=a;
		a=temp;
		System.out.println("inside swap method: a= "+ a +", b =" + b);	
	}
	public static void main(String[] args) {
		int x=11;
		int y=22;
		System.out.println("before swapping: x= "+ x +", y =" + y);
		me4th(x,y);
		System.out.println("after swapping: x= "+ x +", y =" + y);

	}

}
