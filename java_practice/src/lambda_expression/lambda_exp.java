package lambda_expression;

interface Greetings
{
	void sayHello();
}

public class lambda_exp {

	public static void main(String[] args) {
		Greetings greet=()->System.out.println("hello students");
		greet.sayHello();
		
		

	}

}
