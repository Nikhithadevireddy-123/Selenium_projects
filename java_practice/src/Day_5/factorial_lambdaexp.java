package Day_5;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class factorial_lambdaexp {
	public static void main(String[] args) {
		IntFunction<Long>factorial = n->IntStream.rangeClosed(1, n).mapToLong(i->i).reduce(1, (a,b) -> a * b);

System.out.println("Factorial of 5: " + factorial.apply(5));
		
	}
	

}
