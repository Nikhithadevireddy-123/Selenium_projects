package Control_statements_practice;
//WTP for login
public class nsted_if1 {
	/*public void login() {
	String username="nikhitha";
	String password="pass@123";
	
	String usernameentered="nikhitha";
	String passwordentered="pass@12";
	if(username==usernameentered)
	{
		if(password==passwordentered)
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("incorrect password");
		}
	}
	else
	{
		System.out.println("incorrect username");
	}
	}
	*/
	
	
//------------------------------------------------------------------------------------------
	
	//WTP for loan approval
	/*public void loan_aproval(int sal,int credit_score) {
		if(sal>2500)
		{
			if(credit_score>=700)
			{
				System.out.println("credit score is good so loan is approved");
				
			}
			else
			{
				System.out.println("credit score is not good so loan is not approved");
			}
		}
		else
		{
			System.out.println("loan is rejected");
		}	
	}*/
	
	//WAP for eligibility of getting driving license
	public void driving_licence(int age,boolean test) {
		if(age>18)
		{
			if(test)
			{
				System.out.println("you passed the test so u will get license");
				
			}
			else
			{
				System.out.println("you didn't passed the test so u won't get license");
				
			}
		}
		else
		{
			System.out.println("you don't have eligibility for licence ");
		}
		
	}

	public static void main(String[] args) {
		nsted_if1 obj=new nsted_if1();
		//obj.login();
		//obj.loan_aproval(3000,70);
		obj.driving_licence(17, true);
	}
}
		


