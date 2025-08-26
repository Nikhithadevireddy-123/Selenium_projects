package typecasting_practice;

public class Type_casting {

	public static void main(String[] args) {
		//widening
		int num=10;
		System.out.println("value of num="+num);
		float f=num;
		System.out.println("value of f="+f);
		//narrowing
		int a=(int)f;
		System.out.println("value of a="+a);

	}

}
