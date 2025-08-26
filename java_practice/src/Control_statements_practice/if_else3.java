package Control_statements_practice;

public class if_else3 {

	public static void main(String[] args) {
		int personage=18;
		boolean idcard=true;
		boolean isstudent=true;
		if(personage>=18 && idcard)
		{
			System.out.println("person is eligible for entry for discount offers");
		}
		else 
		{
			System.out.println("person is not eligible for entry for discount offers");
				
		}
		if(personage<18 || isstudent )
		{
			System.out.println("person is eligible for student discount");
		}
		else {
			System.out.println("person is not eligible for student pass");
		}

	}

}
