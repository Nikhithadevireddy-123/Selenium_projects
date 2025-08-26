package Day_7;

public class PassPrimitive {
    public static void modifyPrimitive(int num) {
        num = num + 10; // Modifies the local copy
        System.out.println("Inside method (primitive): num = " + num);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before method call (primitive): x = " + x);
        modifyPrimitive(x);
        System.out.println("After method call (primitive): x = " + x); // x is still 5
    }
}
