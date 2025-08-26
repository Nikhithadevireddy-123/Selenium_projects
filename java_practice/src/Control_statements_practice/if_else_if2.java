package Control_statements_practice;

public class if_else_if2 {

	public static void main(String[] args) {
		float units=300f;
		if(units>0 && units<=100)
		{
			System.out.println("low usage");
		}
		else if(units>100 && units<=299)
		{
			System.out.println("medium usage");
		}
		else if(units>=300 && units<=499)
		{
			System.out.println("high usage");
		}
		else if(units<=500)
		{
			System.out.println("very high usage");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
		
		

	}

}
