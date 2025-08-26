package typecasting_practice;

public class Wrapper_classes {

	public static void main(String[] args) {
		//autoboxing
		int num=10;
		System.out.println("primitive type of data="+num);//memory allocation of 4 byte
		Integer num1=num;//convert primitive int to object Integer
		System.out.println("wrap type of data="+num1);
		//wrapper(convert wrappers to primitive) 
		Integer a=20;
		System.out.println("for object="+a);
		int b=a;//Unboxing(object to primitive)
		System.out.println("for primitive data type in="+b);
		
		String str="1234";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String n=Integer.toString(num);
		System.out.println(n);
		
		d
		
		
		
		

	}

}
