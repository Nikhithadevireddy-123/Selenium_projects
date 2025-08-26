package lambda_expression;

import java.util.Arrays;
import java.util.List;
public class even_odd_lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Even numbers:");
        numbers.forEach(n -> { if (n % 2 == 0) System.out.println(n); });
        System.out.println("Odd numbers:");
        numbers.forEach(n -> { if (n % 2 != 0) System.out.println(n); });
    }
}
