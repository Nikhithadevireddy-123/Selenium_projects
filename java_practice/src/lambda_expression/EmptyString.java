package lambda_expression;

import java.util.function.Predicate;
public class EmptyString {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        String s1 = "";
        String s2 = "Hello";
        System.out.println("" + s1 + " is empty? " + isEmpty.test(s1));
        System.out.println("" + s2 + " is empty? " + isEmpty.test(s2));
    }
}

