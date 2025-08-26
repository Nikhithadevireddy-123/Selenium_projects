package passbyvalue_reference_practice;

public class PassByValueDemo {
    static void changeValue(int num) {
        System.out.println("Inside method, before change: " + num);
        num = 10;  
        System.out.println("Inside method, after change: " + num);
    }
    public static void main(String[] args) {
        int original = 20;
        System.out.println("Before method call: " + original);
        changeValue(original);
        System.out.println("After method call: " + original);
    }
}

