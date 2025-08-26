package lambda_expression;

import java.util.Arrays;
public class Aggregate_operations {
    public static void main(String[] args) {
        double[] numbers = {6.8,3.2,1.5,3.4};
        double sum = Arrays.stream(numbers).sum();
        double max = Arrays.stream(numbers).max().getAsDouble();
        double avg = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
    }
}

