package Control_statements_practice;

public class nested_if {

	public static void main(String[] args) {
		boolean isreg=true;
		boolean hashallticket=true;
		if(isreg)
		{
			if(hashallticket)
			{
				System.out.println("you can write your exam");
			}
			else
			{
				System.out.println("you need a hall ticket");
			}
		}
		else
		{
			System.out.println("you are not registered");
		}

	}

}
