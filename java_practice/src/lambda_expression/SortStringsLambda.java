package lambda_expression;
import java.util.Arrays;
import java.util.List;
public class SortStringsLambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "horse", "elephant", "camel");
       
        words.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Sorted by length: " + words);

        
        words.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted alphabetically: " + words);
    }
}

