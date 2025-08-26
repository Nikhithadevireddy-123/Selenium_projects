package Control_statements_practice;

public class if_else_if {

	public static void main(String[] args) {
		float per=70f;
		if(per>=75 && per <=100)
		{
			System.out.println("distint");
		}
		else if(per>=60 && per <75)
		{
			System.out.println("first class");
		}
		else if(per>50 && per <=60)
		{
			System.out.println("second class");
		}
		else if(per>=40 && per <=50)
		{
			System.out.println("pass");
		}
		else if(per>=0 && per <=40)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
