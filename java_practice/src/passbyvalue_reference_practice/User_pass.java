package passbyvalue_reference_practice;

class username_password {
	String username;
	String password;
}
public class User_pass{
	static void update_credentials(username_password up)
	{
		up.username="admin123";
		up.password="pass123";
		
	}
	public static void main(String[] args) {
		username_password up=new username_password();
		up.username="user123";
		up.password="user@123";
		update_credentials(up);
		System.out.println("username="+up.username);
		System.out.println("password="+up.password);
		

	}

}
