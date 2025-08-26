package passbyvalue_reference_practice;

public class TestPass {
	public static void username(String password)
	{
		password="newpassword";
	}


	public static void main(String[] args) {
		String password="oldpassword";
		username(password);

	}

}
