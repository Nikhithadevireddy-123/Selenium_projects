package Control_statements_practice;

public class if_else_if1 {

	public static void main(String[] args) {
	   float temp=40f;
		if(temp>=40)
		{
			System.out.println("temp is very hot");
		}
		else if(temp>=30 && temp<40)
		{
			System.out.println("temp is hot");
		}
		else if(temp>=20 && temp<=29)
		{
			System.out.println("temp is warm");
		}
		else if(temp>=10 && temp<=19)
		{
			System.out.println("temp is cool");
		}
		else if(temp>=0 && temp<10)
		{
			System.out.println("temp is very cool");
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
