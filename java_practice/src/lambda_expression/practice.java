package lambda_expression;
import java.util.function.Predicate;

public class practice {

	public static void main(String[] args) {
		Predicate<Integer> isEven=num->num%2==0;
		System.out.println(isEven.test(3));

	}

}
