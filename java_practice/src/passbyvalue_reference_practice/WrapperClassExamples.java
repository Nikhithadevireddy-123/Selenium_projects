package passbyvalue_reference_practice;

public class WrapperClassExamples {
    public static void main(String[] args) {
        char ch = '9';
        boolean isDigit = Character.isDigit(ch);
        System.out.println(ch + " is digit? " + isDigit);

        String str1 = "hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Strings equal? " + isEqual);

        int num = 779;
        String numStr = String.valueOf(num);
        System.out.println("String from int: " + numStr);
        
        double d = 88.67;
        Double dObj = Double.valueOf(d);
        System.out.println("Double object: " + dObj);

        Boolean boolObj = Boolean.valueOf(true);
        System.out.println("Boolean wrapper: " + boolObj);

        String nullStr = null;
        Integer intObj = nullStr == null ? null : Integer.valueOf(nullStr);  
        System.out.println("Integer object from null string: " + intObj);
    }
}

