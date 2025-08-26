package Day_7;

class MyObject {
    String value;

    MyObject(String value) {
        this.value = value;
    }
}

public class assigning_value {
    public static void changeReference(MyObject obj) {
        System.out.println("Inside method (before reassignment): obj.value = " + obj.value);
        obj = new MyObject("New Value"); // Reassigning the local copy of the reference
        System.out.println("Inside method (after reassignment): obj.value = " + obj.value);
    }

    public static void main(String[] args) {
        MyObject originalObject = new MyObject("Original Value");
        System.out.println("Before method call: originalObject.value = " + originalObject.value);

        changeReference(originalObject);

        System.out.println("After method call: originalObject.value = " + originalObject.value);
        // Output will show "Original Value", proving the original reference did not change.
    }
}
